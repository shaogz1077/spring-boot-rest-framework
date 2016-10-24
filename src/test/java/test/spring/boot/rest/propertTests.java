package test.spring.boot.rest;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.*;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.StreamUtils;
import org.springframework.web.client.RestTemplate;

import spring.boot.rest.common.aop.ServiceMonitor;
import spring.boot.rest.common.model.DataResult;
import spring.boot.rest.common.util.ConfigUtil;
import spring.boot.rest.demo.main.DemoRestApplication;

import java.io.ByteArrayInputStream;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;

import static org.junit.Assert.assertEquals;

/**
 * test
 *
 * @since: 15/11/21.
 * @author: yangjunming
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(DemoRestApplication.class)
@WebIntegrationTest(randomPort = false)
@DirtiesContext
public class propertTests {

	String url = "http://localhost:8012/ping";
	@Value("${str.name}")
	private String myname;

	private Logger logger = LoggerFactory.getLogger(propertTests.class);

	@Test
	public void testPing() throws Exception {
		logger.info(myname+"haahahahahaha");
		logger.info(ConfigUtil.strname+"--------------");
	}

	@Test
	public void testCompression() throws Exception {
	}
}
