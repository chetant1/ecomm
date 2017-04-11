package com.ecommerce.vo;

public class UserProductVo {
	private String productName;
	private int userProductID;
	private int userId;
	private int productId;
	private String userProductQuantity;
	private String productPrice;
	private String purchaseStatus;
	private String isActive;
	private String productDetails;

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
	 * @return the productDetails
	 */
	public String getProductDetails() {
		return productDetails;
	}

	/**
	 * @param productDetails
	 *            the productDetails to set
	 */
	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}

}
