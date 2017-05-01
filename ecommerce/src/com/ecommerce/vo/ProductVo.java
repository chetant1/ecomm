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
	private String thumbnelImage1FileName;
	private String thumbnelImage2FileName;
	private String thumbnelImage3FileName;
	private String largerImage1FileName;
	private String largerImage2FileName;
	private String productDetailsmainImageFileName;

	/**
	 * @return the thumbnelImage1FileName
	 */
	public String getThumbnelImage1FileName() {
		return thumbnelImage1FileName;
	}

	/**
	 * @param thumbnelImage1FileName
	 *            the thumbnelImage1FileName to set
	 */
	public void setThumbnelImage1FileName(String thumbnelImage1FileName) {
		this.thumbnelImage1FileName = thumbnelImage1FileName;
	}

	/**
	 * @return the thumbnelImage2FileName
	 */
	public String getThumbnelImage2FileName() {
		return thumbnelImage2FileName;
	}

	/**
	 * @param thumbnelImage2FileName
	 *            the thumbnelImage2FileName to set
	 */
	public void setThumbnelImage2FileName(String thumbnelImage2FileName) {
		this.thumbnelImage2FileName = thumbnelImage2FileName;
	}

	/**
	 * @return the thumbnelImage3FileName
	 */
	public String getThumbnelImage3FileName() {
		return thumbnelImage3FileName;
	}

	/**
	 * @param thumbnelImage3FileName
	 *            the thumbnelImage3FileName to set
	 */
	public void setThumbnelImage3FileName(String thumbnelImage3FileName) {
		this.thumbnelImage3FileName = thumbnelImage3FileName;
	}

	/**
	 * @return the largerImage1FileName
	 */
	public String getLargerImage1FileName() {
		return largerImage1FileName;
	}

	/**
	 * @param largerImage1FileName
	 *            the largerImage1FileName to set
	 */
	public void setLargerImage1FileName(String largerImage1FileName) {
		this.largerImage1FileName = largerImage1FileName;
	}

	/**
	 * @return the largerImage2FileName
	 */
	public String getLargerImage2FileName() {
		return largerImage2FileName;
	}

	/**
	 * @param largerImage2FileName
	 *            the largerImage2FileName to set
	 */
	public void setLargerImage2FileName(String largerImage2FileName) {
		this.largerImage2FileName = largerImage2FileName;
	}

	/**
	 * @return the largerImage3FileName
	 */
	public String getLargerImage3FileName() {
		return largerImage3FileName;
	}

	/**
	 * @param largerImage3FileName
	 *            the largerImage3FileName to set
	 */
	public void setLargerImage3FileName(String largerImage3FileName) {
		this.largerImage3FileName = largerImage3FileName;
	}

	private String largerImage3FileName;

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
	 * @param productDetails
	 *            the productDetails to set
	 */
	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}

	/**
	 * @return the productDetailsmainImageFileName
	 */
	public String getProductDetailsmainImageFileName() {
		return productDetailsmainImageFileName;
	}

	/**
	 * @param productDetailsmainImageFileName the productDetailsmainImageFileName to set
	 */
	public void setProductDetailsmainImageFileName(
			String productDetailsmainImageFileName) {
		this.productDetailsmainImageFileName = productDetailsmainImageFileName;
	}
}
