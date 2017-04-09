package com.ecommerce.bo;

import java.util.List;

import com.ecommerce.actions.ProductActions;
import com.ecommerce.actions.UserProductActions;
import com.ecommerce.vo.ProductVo;
import com.ecommerce.vo.UserProductVo;

public interface ProductBo {

	public List<ProductVo> getAllProduct();

	public int addProduct(ProductActions productData);

	public int deleteProduct(int parseInt);

	public ProductVo editProduct(int parseInt);

	public int updateProduct(ProductActions productActions);

	public int addProductToCart(UserProductActions userProductActions);

	public List<UserProductVo> getAllUserCartProduct(int userId);
}
