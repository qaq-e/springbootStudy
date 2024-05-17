package com.zk.springbootzk.demos.dao;

import com.zk.springbootzk.demos.entity.T_user;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

public interface TuserDao {

    @Select("select * from t_user where username = #{username}")
    T_user getByUsername(String username);

    // 更具用户名 得到某个用户属于的所有角色集合
    @Select("select r.rolename from t_user u,t_role r where u.role_id = r.id and u.username = #{username}")
    Set<String> getRoles(String username);

    // 根据用户名 得到所有的权限
    @Select("select p.permissionname from t_user u,t_role r,t_permission p where u.role_id = r.id and p.role_id = r.id and u.username = #{username}")
    Set<String> getPermissions(String username);

}
