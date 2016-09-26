package spring.boot.rest.common.util;

import java.util.ResourceBundle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigUtil {
	private static final Logger logger = LoggerFactory.getLogger(ConfigUtil.class);

	public static String strname;

	static {
		String path = "dev";

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		String[] profiles = ctx.getEnvironment().getActiveProfiles();
		ctx.close();

		if (profiles != null) {
			for (String profile : profiles) {
				if (profile.equals("prod")) {
					path = "prod";
					break;
				}
				if (profile.equals("test")) {
					path = "test";
					break;
				}
			}
		}

		final ResourceBundle config = ResourceBundle.getBundle("application-" + path);
		logger.info("-------------------------------appserver配置加载开始-------------------------------");
		try {
			strname = config.getString("str.name");

		} catch (Exception ex) {
			logger.warn("加载appserver配置时配置时出现异常" + ex.getMessage());
		}
	}
}
