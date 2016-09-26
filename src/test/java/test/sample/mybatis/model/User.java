package test.sample.mybatis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "T_User")
public class User {
    /**
     * 流水号
     */
    @Id
    @Column(name = "D_ID")
    private Integer dId;

    /**
     * 姓名
     */
    @Column(name = "D_NAME")
    private String dName;

    /**
     * 性别(-1女，0保密，1男)
     */
    @Column(name = "D_SEX")
    private String dSex;

    /**
     * 生日
     */
    @Column(name = "D_Birthday")
    private Date dBirthday;

    /**
     * 年龄
     */
    @Column(name = "D_Age")
    private Byte dAge;

    /**
     * 工资
     */
    @Column(name = "D_Salary")
    private Integer dSalary;

    /**
     * 获取流水号
     *
     * @return D_ID - 流水号
     */
    public Integer getdId() {
        return dId;
    }

    /**
     * 设置流水号
     *
     * @param dId 流水号
     */
    public void setdId(Integer dId) {
        this.dId = dId;
    }

    /**
     * 获取姓名
     *
     * @return D_NAME - 姓名
     */
    public String getdName() {
        return dName;
    }

    /**
     * 设置姓名
     *
     * @param dName 姓名
     */
    public void setdName(String dName) {
        this.dName = dName;
    }

    /**
     * 获取性别(-1女，0保密，1男)
     *
     * @return D_SEX - 性别(-1女，0保密，1男)
     */
    public String getdSex() {
        return dSex;
    }

    /**
     * 设置性别(-1女，0保密，1男)
     *
     * @param dSex 性别(-1女，0保密，1男)
     */
    public void setdSex(String dSex) {
        this.dSex = dSex;
    }

    /**
     * 获取生日
     *
     * @return D_Birthday - 生日
     */
    public Date getdBirthday() {
        return dBirthday;
    }

    /**
     * 设置生日
     *
     * @param dBirthday 生日
     */
    public void setdBirthday(Date dBirthday) {
        this.dBirthday = dBirthday;
    }

    /**
     * 获取年龄
     *
     * @return D_Age - 年龄
     */
    public Byte getdAge() {
        return dAge;
    }

    /**
     * 设置年龄
     *
     * @param dAge 年龄
     */
    public void setdAge(Byte dAge) {
        this.dAge = dAge;
    }

    /**
     * 获取工资
     *
     * @return D_Salary - 工资
     */
    public Integer getdSalary() {
        return dSalary;
    }

    /**
     * 设置工资
     *
     * @param dSalary 工资
     */
    public void setdSalary(Integer dSalary) {
        this.dSalary = dSalary;
    }
}