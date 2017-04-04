package com.ecommerce.boimpl;

import com.ecommerce.actions.UserAction;
import com.ecommerce.bo.UserBO;
import com.ecommerce.dao.UserDao;
import com.ecommerce.daoimpl.UserDaoImpl;

public class UserBoImpl implements UserBO {

	@Override
	public int registeruser(UserAction user) {
		UserDao dao = new UserDaoImpl();
		return dao.registeruser(user);
	}

}
