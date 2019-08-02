package cn.dgut.dao;

import cn.dgut.domain.Course;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseDao {

    @Select("select * from course where id in(select courseid from stu_course where stuid=#{sid})")
    List<Course> findById(String sid);
}
