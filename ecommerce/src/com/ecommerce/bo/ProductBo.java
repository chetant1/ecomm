package com.ecommerce.bo;

import java.util.List;

import com.ecommerce.actions.ProductActions;
import com.ecommerce.vo.ProductVo;

public interface ProductBo {

	public List<ProductVo> getAllProduct();

	public int addProduct(ProductActions productData);

	public int deleteProduct(int parseInt);

	public ProductVo editProduct(int parseInt);

	public int updateProduct(ProductActions productActions);
}
