package com.ecommerce.boimpl;

import java.util.List;

import com.ecommerce.actions.UserAction;
import com.ecommerce.bo.UserBO;
import com.ecommerce.dao.UserDao;
import com.ecommerce.daoimpl.UserDaoImpl;
import com.ecommerce.vo.UserVo;

public class UserBoImpl implements UserBO {

	@Override
	public int registeruser(UserAction user) {
		UserDao dao = new UserDaoImpl();
		return dao.registeruser(user);
	}

	@Override
	public UserVo authenticate(UserAction userAction) {
		// TODO Auto-generated method stub
		UserDao dao = new UserDaoImpl();
		return dao.authenticate(userAction);
	}

	@Override
	public List<UserVo> getAllUser() {
		UserDao dao = new UserDaoImpl();
		return dao.getAllUser();
	}

	@Override
	public int addUser(UserAction userData) {
		UserDao dao = new UserDaoImpl();
		return dao.addUser(userData);
	}

	@Override
	public int deleteUser(int userId) {
		UserDao dao = new UserDaoImpl();
		return dao.deleteUser(userId);
	}

	@Override
	public UserVo editUser(int userId) {
		UserDao dao = new UserDaoImpl();
		return dao.editUser(userId);
	}

	@Override
	public int updateUser(UserAction userData) {
		UserDao dao = new UserDaoImpl();
		return dao.updateUser(userData);
	}

}
