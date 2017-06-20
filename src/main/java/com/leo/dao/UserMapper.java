package com.leo.dao;

import com.leo.model.SysMenu;
import com.leo.model.User;
import com.leo.model.easyui.PageHelper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author liuxi
 * 2014-8-2
 */


public interface UserMapper {

	public User findUserByName(@Param("username") String username);

	public String getUsernameById(@Param("id") int id);

	public List<SysMenu> getMenuByUserId(@Param("userId") int userId);
	
	public List<User> getDatagrid();

	public Long getDatagridTotal(User user);

	public List<User> datagridUser(PageHelper page);

	public void addUser(User user);

	public void editUser(User user);

}
