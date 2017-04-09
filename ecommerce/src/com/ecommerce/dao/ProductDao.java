package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.actions.ProductActions;
import com.ecommerce.actions.UserProductActions;
import com.ecommerce.vo.ProductVo;
import com.ecommerce.vo.UserProductVo;

public interface ProductDao {
	public List<ProductVo> getAllProduct();

	public int addProduct(ProductActions productData);

	public int deleteProduct(int productId);

	public ProductVo editProduct(int productId);

	public int updateProduct(ProductActions productData);

	public int addProductToCart(UserProductActions userProductActions);

	public List<UserProductVo> getAllUserCartProduct(int userId);
}
