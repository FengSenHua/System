package cn.dgut.domain;

import java.util.Date;

/**
 * 课程实体类
 */
public class Course {
    //主键id
    private String id;
    //课程号
    private String courseid;
    //课程名
    private String coursename;
    //课程开始时间
    private Date starttime;
    private String starttimeStr;
    //课程结束时间
    private Date endtime;
    private String endtimeStr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getStarttimeStr() {
        return starttimeStr;
    }

    public void setStarttimeStr(String starttimeStr) {
        this.starttimeStr = starttimeStr;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getEndtimeStr() {
        return endtimeStr;
    }

    public void setEndtimeStr(String endtimeStr) {
        this.endtimeStr = endtimeStr;
    }
}
