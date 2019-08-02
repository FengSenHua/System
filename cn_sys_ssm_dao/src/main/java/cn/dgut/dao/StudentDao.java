package cn.dgut.dao;

import cn.dgut.domain.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface StudentDao {
    @Select("select * from student")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "stu_id", column = "stu_id"),
            @Result(property = "stu_name", column = "stu_name"),
            @Result(property = "password", column = "password"),
            @Result(property = "stu_phone", column = "stu_phone"),
            @Result(property = "gender", column = "gender"),
            @Result(property = "email", column = "email"),
            @Result(property = "birthday", column = "birthday"),
            @Result(property = "courses",column = "id",javaType =java.util.List.class,many = @Many(select = "cn.dgut.dao.CourseDao.findById")),
            @Result(property = "role",column = "roleid",one = @One(select = "cn.dgut.dao.RoleDao.findById"))

    })
    List<Student> findAll();
}
