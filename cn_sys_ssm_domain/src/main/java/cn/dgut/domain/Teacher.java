package cn.dgut.domain;

import java.util.Date;
import java.util.List;

/**
 * 教师实体类
 */
public class Teacher {
    //唯一主键
    private String id;
    //教师工号
    private String tea_id;
    //教师姓名
    private String tea_name;
    //登录密码
    private String password;
    //性别
    private String gender;
    //联系电话
    private String tea_phone;
    //邮箱
    private String email;
    //出生年月日
    private Date birthday;
    private String birthdayStr;
    private List<Course> courses;
    private Role role;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTea_id() {
        return tea_id;
    }

    public void setTea_id(String tea_id) {
        this.tea_id = tea_id;
    }

    public String getTea_name() {
        return tea_name;
    }

    public void setTea_name(String tea_name) {
        this.tea_name = tea_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getTea_phone() {
        return tea_phone;
    }

    public void setTea_phone(String tea_phone) {
        this.tea_phone = tea_phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBirthdayStr() {
        return birthdayStr;
    }

    public void setBirthdayStr(String birthdayStr) {
        this.birthdayStr = birthdayStr;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
