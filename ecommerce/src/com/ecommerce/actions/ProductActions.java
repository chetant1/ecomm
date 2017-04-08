package com.ecommerce.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.ecommerce.bo.ProductBo;
import com.ecommerce.boimpl.ProductBoImpl;
import com.ecommerce.vo.ProductVo;
import com.opensymphony.xwork2.ActionSupport;

public class ProductActions extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int productId;
	private String productName;
	private String productBrand;
	private String productQuantity;
	private String productPrice;
	private ProductActions productActions;
	private String isActive;
	private List<ProductVo> productList = null;
	private ProductVo productVo = null;
	private HttpServletRequest request = ServletActionContext.getRequest();

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
	 * @param productActions
	 *            the productActions to set
	 */
	public void setProductActions(ProductActions productActions) {
		this.productActions = productActions;
	}

	/**
	 * @return the productList
	 */
	public List<ProductVo> getProductList() {
		return productList;
	}

	/**
	 * @param productList
	 *            the productList to set
	 */
	public void setProductList(List<ProductVo> productList) {
		this.productList = productList;
	}

	/**
	 * @return the productVo
	 */
	public ProductVo getProductVo() {
		return productVo;
	}

	/**
	 * @param productVo
	 *            the productVo to set
	 */
	public void setProductVo(ProductVo productVo) {
		this.productVo = productVo;
	}

	public String manageProduct() {
		ProductBo productBo = new ProductBoImpl();
		productList = productBo.getAllProduct();
		for (ProductVo productVo : productList) {
			System.out.println(productVo.getProductName());
		}
		setProductList(productList);
		return "success";
	}

	public String addProduct() {
		ProductBo productBo = new ProductBoImpl();
		productBo.addProduct(productActions);
		productList = productBo.getAllProduct();
		setProductList(productList);
		return "success";
	}

	public String deleteProduct() {
		ProductBo productBo = new ProductBoImpl();
		productBo.deleteProduct(Integer.parseInt(request
				.getParameter("productId")));
		productList = productBo.getAllProduct();
		setProductList(productList);
		return "success";
	}

	public String editProduct() {
		ProductBo productBo = new ProductBoImpl();
		setProductVo(productBo.editProduct(Integer.parseInt(request
				.getParameter("productId"))));

		productList = productBo.getAllProduct();
		setProductList(productList);
		return "success";
	}

	public String updateProduct() {
		ProductBo productBo = new ProductBoImpl();
		productBo.updateProduct(productActions);
		productList = productBo.getAllProduct();
		setProductList(productList);
		return "success";
	}

}
