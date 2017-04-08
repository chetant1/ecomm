package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.actions.UserAction;
import com.ecommerce.vo.UserVo;

public interface UserDao {
	public int registeruser(UserAction user);

	public UserVo authenticate(UserAction userAction);

	public List<UserVo> getAllUser();

	public int addUser(UserAction userAction);

	public int deleteUser(int parseInt);

	public UserVo editUser(int parseInt);

	public int updateUser(UserAction userAction);
}
