package com.ecommerce.boimpl;

import java.util.List;

import com.ecommerce.actions.ProductActions;
import com.ecommerce.actions.UserProductActions;
import com.ecommerce.bo.ProductBo;
import com.ecommerce.dao.ProductDao;
import com.ecommerce.daoimpl.ProductDaoImpl;
import com.ecommerce.vo.ProductVo;
import com.ecommerce.vo.UserActivityVo;
import com.ecommerce.vo.UserProductVo;

public class ProductBoImpl implements ProductBo {

	@Override
	public List<ProductVo> getAllProduct() {
		ProductDao dao = new ProductDaoImpl();
		return dao.getAllProduct();
	}

	@Override
	public int addProduct(ProductActions productData) {
		ProductDao dao = new ProductDaoImpl();
		return dao.addProduct(productData);
	}

	@Override
	public int deleteProduct(int productId) {
		ProductDao dao = new ProductDaoImpl();
		return dao.deleteProduct(productId);
	}

	@Override
	public ProductVo editProduct(int productId) {
		ProductDao dao = new ProductDaoImpl();
		return dao.editProduct(productId);
	}

	@Override
	public int updateProduct(ProductActions productData) {
		ProductDao dao = new ProductDaoImpl();
		return dao.updateProduct(productData);
	}

	@Override
	public int addProductToCart(UserProductActions userProductData) {
		ProductDao dao = new ProductDaoImpl();
		return dao.addProductToCart(userProductData);
	}

	@Override
	public List<UserProductVo> getAllUserCartProduct(int userId) {
		ProductDao dao = new ProductDaoImpl();
		return dao.getAllUserCartProduct(userId);
	}

	@Override
	public int deleteCartProduct(int cartProductID) {
		ProductDao dao = new ProductDaoImpl();
		return dao.deleteCartProduct(cartProductID);
	}

	@Override
	public List<UserActivityVo> getUserActivity() {
		ProductDao dao = new ProductDaoImpl();
		return dao.getUserActivity();
	}

	@Override
	public void updateImageProduct(ProductActions productActions) {
		ProductDao dao = new ProductDaoImpl();
		dao.updateImageProduct(productActions);
	}

	@Override
	public void updateImageProduct(String productDetailsImagepath, int productId) {
		ProductDao dao = new ProductDaoImpl();
		dao.updateImageProduct(productDetailsImagepath, productId);

	}

	@Override
	public int deleteCheckOutProduct(int userProductId) {
		ProductDao dao = new ProductDaoImpl();
		return dao.deleteCheckOutProduct(userProductId);
	}

	@Override
	public List<ProductVo> getAllProduct(String sortParameter) {
		ProductDao dao = new ProductDaoImpl();
		return dao.getAllProduct(sortParameter);
	}

}
