package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.actions.ProductActions;
import com.ecommerce.vo.ProductVo;

public interface ProductDao {
	public List<ProductVo> getAllProduct();

	public int addProduct(ProductActions productData);

	public int deleteProduct(int productId);

	public ProductVo editProduct(int productId);

	public int updateProduct(ProductActions productData);
}
