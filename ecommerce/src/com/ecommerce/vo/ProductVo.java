package com.ecommerce.vo;

import java.util.List;

import com.ecommerce.actions.ProductActions;

public class ProductVo {
	private int productId;
	private String productName;
	private String productBrand;
	private String productQuantity;
	private String productPrice;
	private ProductActions productActions;
	List<ProductActions> productList;
	private String isActive;
	private String productDetails;

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
	 * @return the productBrand
	 */
	public String getProductBrand() {
		return productBrand;
	}

	/**
	 * @param productBrand
	 *            the productBrand to set
	 */
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	/**
	 * @return the productQuantity
	 */
	public String getProductQuantity() {
		return productQuantity;
	}

	/**
	 * @param productQuantity
	 *            the productQuantity to set
	 */
	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
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

	/**
	 * @return the productList
	 */
	public List<ProductActions> getProductList() {
		return productList;
	}

	/**
	 * @param productList
	 *            the productList to set
	 */
	public void setProductList(List<ProductActions> productList) {
		this.productList = productList;
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
	 * @return the productDetails
	 */
	public String getProductDetails() {
		return productDetails;
	}

	/**
	 * @param productDetails the productDetails to set
	 */
	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}
}
