package com.ecommerce.interceptors;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.ecommerce.daoimpl.UserDaoImpl;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Map<String, Object> session = invocation.getInvocationContext()
				.getSession();
		String login = (String) session.get("login");
		if (null != login && login.equals("true")) {
			ActionContext context = invocation.getInvocationContext();
			HttpServletRequest request = (HttpServletRequest) context
					.get(StrutsStatics.HTTP_REQUEST);
			String userId = "" + session.get("userid");
			String userAction = request.getParameter("useraction").toString();
			UserDaoImpl userDao = new UserDaoImpl();
			userDao.trackUserActivity(Integer.parseInt(userId), userAction);
			return invocation.invoke();
		} else {
			return Action.LOGIN;
		}
	}
}
