package com.test01.entity;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 员工表
 * </p>
 *
 * @author me
 * @since 2023-04-11
 */
public class Emp implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 编号
     */
    private Integer id;

    /**
     * 工号
     */
    private String workno;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private String gender;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 身份证号
     */
    private String idcard;

    /**
     * 工作地址
     */
    private String workaddress;

    /**
     * 入职时间
     */
    private LocalDate entrydate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getWorkno() {
        return workno;
    }

    public void setWorkno(String workno) {
        this.workno = workno;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }
    public String getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(String workaddress) {
        this.workaddress = workaddress;
    }
    public LocalDate getEntrydate() {
        return entrydate;
    }

    public void setEntrydate(LocalDate entrydate) {
        this.entrydate = entrydate;
    }

    @Override
    public String toString() {
        return "Emp{" +
            "id=" + id +
            ", workno=" + workno +
            ", name=" + name +
            ", gender=" + gender +
            ", age=" + age +
            ", idcard=" + idcard +
            ", workaddress=" + workaddress +
            ", entrydate=" + entrydate +
        "}";
    }
}
