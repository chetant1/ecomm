package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.actions.ProductActions;
import com.ecommerce.actions.UserProductActions;
import com.ecommerce.vo.ProductVo;
import com.ecommerce.vo.UserActivityVo;
import com.ecommerce.vo.UserProductVo;

public interface ProductDao {
	public List<ProductVo> getAllProduct();

	public int addProduct(ProductActions productData);

	public int deleteProduct(int productId);

	public ProductVo editProduct(int productId);

	public int updateProduct(ProductActions productData);

	public int addProductToCart(UserProductActions userProductActions);

	public List<UserProductVo> getAllUserCartProduct(int userId);

	public int deleteCartProduct(int cartProductID);

	public List<UserActivityVo> getUserActivity();

	public void updateImageProduct(ProductActions productActions);

	public void updateImageProduct(String productDetailsImagepath, int productId);

	public int deleteCheckOutProduct(int parseInt);

	public List<ProductVo> getAllProduct(String sortParameter);
}
