package com.ecommerce.actions;

//import org.apache.struts2.components.File;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
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
	private String productDetails;
	private File productDetailsmainImage;
	private String productDetailsmainImageFileName;
	private String userImageContentType;
	private String userImageFileName;
	private File thumbnelImage1;
	private String thumbnelImage1FileName;
	private File thumbnelImage2;
	private String thumbnelImage2FileName;
	private File thumbnelImage3;
	private String thumbnelImage3FileName;
	private File largerImage1;
	private String largerImage1FileName;
	private File largerImage2;
	private String largerImage2FileName;
	private File largerImage3;
	private String largerImage3FileName;

	/**
	 * @return the productDetailsmainImage
	 */
	public File getProductDetailsmainImage() {
		return productDetailsmainImage;
	}

	/**
	 * @param productDetailsmainImage
	 *            the productDetailsmainImage to set
	 */
	public void setProductDetailsmainImage(File productDetailsmainImage) {
		this.productDetailsmainImage = productDetailsmainImage;
	}

	/**
	 * @return the productDetailsmainImageFileName
	 */
	public String getProductDetailsmainImageFileName() {
		return productDetailsmainImageFileName;
	}

	/**
	 * @param productDetailsmainImageFileName
	 *            the productDetailsmainImageFileName to set
	 */
	public void setProductDetailsmainImageFileName(
			String productDetailsmainImageFileName) {
		this.productDetailsmainImageFileName = productDetailsmainImageFileName;
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

	Properties dbProp = new Properties();

	/**
	 * @return the thumbnelImage1
	 */
	public File getThumbnelImage1() {
		return thumbnelImage1;
	}

	/**
	 * @param thumbnelImage1
	 *            the thumbnelImage1 to set
	 */
	public void setThumbnelImage1(File thumbnelImage1) {
		this.thumbnelImage1 = thumbnelImage1;
	}

	/**
	 * @return the thumbnelImage2
	 */
	public File getThumbnelImage2() {
		return thumbnelImage2;
	}

	/**
	 * @param thumbnelImage2
	 *            the thumbnelImage2 to set
	 */
	public void setThumbnelImage2(File thumbnelImage2) {
		this.thumbnelImage2 = thumbnelImage2;
	}

	/**
	 * @return the thumbnelImage3
	 */
	public File getThumbnelImage3() {
		return thumbnelImage3;
	}

	/**
	 * @param thumbnelImage3
	 *            the thumbnelImage3 to set
	 */
	public void setThumbnelImage3(File thumbnelImage3) {
		this.thumbnelImage3 = thumbnelImage3;
	}

	/**
	 * @return the largerImage1
	 */
	public File getLargerImage1() {
		return largerImage1;
	}

	/**
	 * @param largerImage1
	 *            the largerImage1 to set
	 */
	public void setLargerImage1(File largerImage1) {
		this.largerImage1 = largerImage1;
	}

	/**
	 * @return the largerImage2
	 */
	public File getLargerImage2() {
		return largerImage2;
	}

	/**
	 * @param largerImage2
	 *            the largerImage2 to set
	 */
	public void setLargerImage2(File largerImage2) {
		this.largerImage2 = largerImage2;
	}

	/**
	 * @return the largerImage3
	 */
	public File getLargerImage3() {
		return largerImage3;
	}

	/**
	 * @param largerImage3
	 *            the largerImage3 to set
	 */
	public void setLargerImage3(File largerImage3) {
		this.largerImage3 = largerImage3;
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
		int productId = 0;
		for (int i = 0; i < productList.size(); i++) {
			productId = productList.get(0).getProductId();
			if (i == 0)
				break;
		}
		try {
			dbProp.load(ProductActions.class.getClassLoader()
					.getResourceAsStream("config.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block` `
			e.printStackTrace();
		}
		String productImagePath = dbProp.getProperty("productImagepath")
				+ productId;
		String rootProductImagePath = dbProp
				.getProperty("rootproductImagepath") + productId + "/";
		File productDirectory = new File(productImagePath);

		if (productDirectory.exists()) {
		} else {
			productDirectory.mkdir();
		}
		File fileToCreate;
		fileToCreate = new File(productImagePath,
				productDetailsmainImageFileName);
		try {
			FileUtils.copyFile(productDetailsmainImage, fileToCreate);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String productDetailsImagepath = rootProductImagePath
				+ productDetailsmainImageFileName;
		productBo.updateImageProduct(productDetailsImagepath, productId);
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

	public String getUserProductDetails() {
		ProductBo productBo = new ProductBoImpl();
		setProductVo(productBo.editProduct(Integer.parseInt(request
				.getParameter("productId"))));
		return "success";
	}

	public String addProductImage() {
		try {
			dbProp.load(ProductActions.class.getClassLoader()
					.getResourceAsStream("config.properties"));
			String productImagePath = dbProp.getProperty("productImagepath")
					+ productActions.getProductId();
			String rootProductImagePath = dbProp
					.getProperty("rootproductImagepath")
					+ productActions.getProductId() + "/";
			File productDirectory = new File(productImagePath);

			if (productDirectory.exists()) {
			} else {
				productDirectory.mkdir();
			}
			File fileToCreate;
			fileToCreate = new File(productImagePath, thumbnelImage1FileName);
			FileUtils.copyFile(thumbnelImage1, fileToCreate);
			fileToCreate = new File(productImagePath, thumbnelImage2FileName);
			FileUtils.copyFile(thumbnelImage2, fileToCreate);
			fileToCreate = new File(productImagePath, thumbnelImage3FileName);
			FileUtils.copyFile(thumbnelImage3, fileToCreate);
			fileToCreate = new File(productImagePath, largerImage1FileName);
			FileUtils.copyFile(largerImage1, fileToCreate);
			fileToCreate = new File(productImagePath, largerImage2FileName);
			FileUtils.copyFile(largerImage2, fileToCreate);
			fileToCreate = new File(productImagePath, largerImage3FileName);
			FileUtils.copyFile(largerImage3, fileToCreate);

			String thumbImagepath1 = rootProductImagePath
					+ thumbnelImage1FileName;
			String thumbImagepath2 = rootProductImagePath
					+ thumbnelImage2FileName;
			String thumbImagepath3 = rootProductImagePath
					+ thumbnelImage3FileName;
			String largeImagePath1 = rootProductImagePath
					+ largerImage1FileName;
			String largeImagePath2 = rootProductImagePath
					+ largerImage2FileName;
			String largeImagePath3 = rootProductImagePath
					+ largerImage3FileName;
			productActions.setThumbnelImage1FileName(thumbImagepath1);
			productActions.setThumbnelImage2FileName(thumbImagepath2);
			productActions.setThumbnelImage3FileName(thumbImagepath3);
			productActions.setLargerImage1FileName(largeImagePath1);
			productActions.setLargerImage2FileName(largeImagePath2);
			productActions.setLargerImage3FileName(largeImagePath3);
			ProductBo productBo = new ProductBoImpl();
			productBo.updateImageProduct(productActions);
			productList = productBo.getAllProduct();
			setProductList(productList);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";

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
	 * @return the userImageContentType
	 */
	public String getUserImageContentType() {
		return userImageContentType;
	}

	/**
	 * @param userImageContentType
	 *            the userImageContentType to set
	 */
	public void setUserImageContentType(String userImageContentType) {
		this.userImageContentType = userImageContentType;
	}

	/**
	 * @return the userImageFileName
	 */
	public String getUserImageFileName() {
		return userImageFileName;
	}

	/**
	 * @param userImageFileName
	 *            the userImageFileName to set
	 */
	public void setUserImageFileName(String userImageFileName) {
		this.userImageFileName = userImageFileName;
	}

	public static void main(String args[]) {
		ProductActions n = new ProductActions();
		n.addProduct();
	}

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
}
