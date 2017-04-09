package com.ecommerce.actions;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.ecommerce.bo.ProductBo;
import com.ecommerce.boimpl.ProductBoImpl;
import com.ecommerce.vo.UserProductVo;
import com.opensymphony.xwork2.ActionSupport;

public class UserProductActions extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userProductID;
	private int userId;
	private int productId;
	private String productName;
	private String userProductQuantity;
	private String productPrice;
	private String purchaseStatus;
	private String isActive;
	private UserProductActions userProductActions;
	private SessionMap<String, Object> sessionMap = null;
	private List<UserProductVo> cartproductList;
	private HttpServletRequest request = ServletActionContext.getRequest();

	/**
	 * @return the userProductID
	 */
	public int getUserProductID() {
		return userProductID;
	}

	/**
	 * @param userProductID
	 *            the userProductID to set
	 */
	public void setUserProductID(int userProductID) {
		this.userProductID = userProductID;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the userProductQuantity
	 */
	public String getUserProductQuantity() {
		return userProductQuantity;
	}

	/**
	 * @param userProductQuantity
	 *            the userProductQuantity to set
	 */
	public void setUserProductQuantity(String userProductQuantity) {
		this.userProductQuantity = userProductQuantity;
	}

	/**
	 * @return the productPrice
	 */
	public String getProductPrice() {
		return productPrice;
	}

	/**
	 * @param productPrice
	 *            the productPrice to set
	 */
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	/**
	 * @return the purchaseStatus
	 */
	public String getPurchaseStatus() {
		return purchaseStatus;
	}

	/**
	 * @param purchaseStatus
	 *            the purchaseStatus to set
	 */
	public void setPurchaseStatus(String purchaseStatus) {
		this.purchaseStatus = purchaseStatus;
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
	 * @return the userProductActions
	 */
	public UserProductActions getUserProductActions() {
		return userProductActions;
	}

	/**
	 * @param userProductActions
	 *            the userProductActions to set
	 */
	public void setUserProductActions(UserProductActions userProductActions) {
		this.userProductActions = userProductActions;
	}

	@Override
	public void setSession(Map<String, Object> map) {
		sessionMap = (SessionMap<String, Object>) map;

	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName
	 *            the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the cartproductList
	 */
	public List<UserProductVo> getCartproductList() {
		return cartproductList;
	}

	/**
	 * @param cartproductList
	 *            the cartproductList to set
	 */
	public void setCartproductList(List<UserProductVo> cartproductList) {
		this.cartproductList = cartproductList;
	}

	public String addProductToCart() {
		ProductBo productBo = new ProductBoImpl();
		userProductActions
				.setUserId(Integer.parseInt((sessionMap.get("userid"))
						.toString()));
		productBo.addProductToCart(userProductActions);
		setCartproductList(productBo.getAllUserCartProduct(Integer
				.parseInt((sessionMap.get("userid")).toString())));
		return "success";
	}

	public String getAllUserCartProducts() {
		ProductBo productBo = new ProductBoImpl();
		setCartproductList(productBo.getAllUserCartProduct(Integer
				.parseInt((sessionMap.get("userid")).toString())));
		return "success";
	}

	public String deleteCartProduct() {
		ProductBo productBo = new ProductBoImpl();
		productBo.deleteCartProduct(Integer.parseInt((request
				.getParameter("userProductId")).toString()));
		setCartproductList(productBo.getAllUserCartProduct(Integer
				.parseInt((sessionMap.get("userid")).toString())));
		return "success";

	}

	public String checkOutProduct() {
		return "success";
	}
}
