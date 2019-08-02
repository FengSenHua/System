package cn.dgut.dao;

import cn.dgut.domain.Role;
import org.apache.ibatis.annotations.Select;

public interface RoleDao {

    @Select("select * from role where id=#{roleid}")
    Role findById(String roleid);
}
