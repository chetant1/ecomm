package com.ecommerce.actions;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.ecommerce.bo.ProductBo;
import com.ecommerce.bo.UserBO;
import com.ecommerce.boimpl.ProductBoImpl;
import com.ecommerce.boimpl.UserBoImpl;
import com.ecommerce.vo.ProductVo;
import com.ecommerce.vo.UserVo;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userId;
	private String username;
	private String password;
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String emailId;
	private String userRole;
	private String isActive;
	private UserAction userAction;
	private SessionMap<String, Object> sessionMap = null;
	private List<UserVo> userList = null;
	private UserVo userVo = null;
	private HttpServletRequest request = ServletActionContext.getRequest();
	private ProductActions productActions = new ProductActions();
	private List<ProductVo> userProductList = null;

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userProductList
	 *            the userProductList to set
	 */
	public void setUserProductList(List<ProductVo> userProductList) {
		this.userProductList = userProductList;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber
	 *            the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}

	/**
	 * @param emailId
	 *            the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	/**
	 * @return the userRole
	 */
	public String getUserRole() {
		return userRole;
	}

	/**
	 * @param userRole
	 *            the userRole to set
	 */
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	/**
	 * @return the isActive
	 */
	public String getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive
	 *            the isActive to set
	 */
	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the userAction
	 */
	public UserAction getUserAction() {
		return userAction;
	}

	/**
	 * @param userAction
	 *            the userAction to set
	 */
	public void setUserAction(UserAction userAction) {
		this.userAction = userAction;
	}

	@Override
	public void setSession(Map<String, Object> map) {
		sessionMap = (SessionMap<String, Object>) map;
	}

	/**
	 * @return the userList
	 */
	public List<UserVo> getUserList() {
		return userList;
	}

	/**
	 * @param userList
	 *            the userList to set
	 */
	public void setUserList(List<UserVo> userList) {
		this.userList = userList;
	}

	/**
	 * @return the userVo
	 */
	public UserVo getUserVo() {
		return userVo;
	}

	/**
	 * @param userVo
	 *            the userVo to set
	 */
	public void setUserVo(UserVo userVo) {
		this.userVo = userVo;
	}

	/**
	 * @return the productActions
	 */
	public ProductActions getProductActions() {
		return productActions;
	}

	/**
	 * @param productActions
	 *            the productActions to set
	 */
	public void setProductActions(ProductActions productActions) {
		this.productActions = productActions;
	}

	public String registerUser() {

		UserBO userBO = new UserBoImpl();
		int result = userBO.registeruser(userAction);
		if (result == 1) {
			return "success";
		} else {
			return "fail";
		}
	}

	public String checkLogin() {
		UserBO userBO = new UserBoImpl();
		UserVo loginUser = userBO.authenticate(userAction);
		String result = INPUT;
		if (null != loginUser) {
			System.out.println("Login Success");
			sessionMap.put("login", "true");
			sessionMap.put("userid", loginUser.getUserId());
			sessionMap.put("fName", loginUser.getFirstName());
			sessionMap.put("userrole", loginUser.getUserRole());
			if (loginUser.getUserRole().equals("admin"))
				result = "adminpage";
			else
				result = "userpage";

		}
		return result;

	}

	public String logout() {
		String result = INPUT;
		if (null != sessionMap) {
			sessionMap.remove("login");
			sessionMap.invalidate();
			result = SUCCESS;
		}
		System.out.println("User Logout success");
		return result;

	}

	public String manageUser() {
		UserBO userBO = new UserBoImpl();
		userList = userBO.getAllUser();
		setUserList(userList);
		return "success";
	}

	public String addUser() {
		UserBO userBO = new UserBoImpl();
		userBO.addUser(userAction);
		userList = userBO.getAllUser();
		setUserList(userList);
		return "success";
	}

	public String deleteUser() {
		UserBO userBO = new UserBoImpl();
		userBO.deleteUser(Integer.parseInt(request.getParameter("userId")));
		userList = userBO.getAllUser();
		setUserList(userList);
		return "success";
	}

	public String editUser() {
		UserBO userBO = new UserBoImpl();
		setUserVo(userBO.editUser(Integer.parseInt(request
				.getParameter("userId"))));

		userList = userBO.getAllUser();
		setUserList(userList);
		return "success";
	}

	public String updateUser() {
		UserBO userBO = new UserBoImpl();
		userBO.updateUser(userAction);
		userList = userBO.getAllUser();
		setUserList(userList);
		return "success";
	}

	public String getUserProductList() {
		ProductBo productBo = new ProductBoImpl();
		userProductList = productBo.getAllProduct();
		productActions.setProductList(userProductList);
		return "success";
	}

	public String getHomePage() {
		String result = null;
		if ((sessionMap.get("userrole").toString()).equals("admin"))
			result = "adminpage";
		else
			result = "userpage";
		return result;
	}
}
