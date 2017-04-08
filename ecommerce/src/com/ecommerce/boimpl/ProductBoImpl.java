package com.ecommerce.boimpl;

import java.util.List;

import com.ecommerce.actions.ProductActions;
import com.ecommerce.bo.ProductBo;
import com.ecommerce.dao.ProductDao;
import com.ecommerce.daoimpl.ProductDaoImpl;
import com.ecommerce.vo.ProductVo;

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

}
