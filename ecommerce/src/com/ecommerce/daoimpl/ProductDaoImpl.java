package com.ecommerce.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ecommerce.actions.ProductActions;
import com.ecommerce.actions.UserProductActions;
import com.ecommerce.dao.ProductDao;
import com.ecommerce.database.DatabaseConnection;
import com.ecommerce.vo.ProductVo;
import com.ecommerce.vo.UserProductVo;

public class ProductDaoImpl implements ProductDao {
	Connection connection = null;
	PreparedStatement pstmt = null;
	ResultSet resultSet = null;
	String result = null;

	@Override
	public List<ProductVo> getAllProduct() {
		List<ProductVo> productList = new ArrayList<ProductVo>();
		ProductVo productVo = null;
		connection = DatabaseConnection.getConnection();
		try {
			pstmt = connection
					.prepareStatement("SELECT * FROM `ecomm`.`product_master` where IS_ACTIVE='Y'");
			resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				productVo = new ProductVo();
				productVo.setProductId(resultSet.getInt("PRODUCT_ID"));
				productVo.setProductName(resultSet.getString("PRODUCT_NAME"));
				productVo.setProductBrand(resultSet.getString("PRODUCT_BRAND"));
				productVo.setProductQuantity(resultSet
						.getString("PRODUCT_QUANTITY"));
				productVo.setProductPrice(resultSet.getString("PRODUCT_PRICE"));
				productVo.setIsActive(resultSet.getString("IS_ACTIVE"));
				productList.add(productVo);
			}

		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return productList;
	}

	@Override
	public int addProduct(ProductActions productData) {

		int productAdd = 0;
		connection = DatabaseConnection.getConnection();
		String sqlQuery = "INSERT INTO `ecomm`.`product_master` (`PRODUCT_NAME`, `PRODUCT_BRAND`, `PRODUCT_QUANTITY`, `PRODUCT_PRICE`,"
				+ "`IS_ACTIVE`) VALUES (?,?,?,?,?)";
		try {
			pstmt = connection.prepareStatement(sqlQuery);
			pstmt.setString(1, productData.getProductName());
			pstmt.setString(2, productData.getProductBrand());
			pstmt.setString(3, productData.getProductQuantity());
			pstmt.setString(4, productData.getProductPrice());
			pstmt.setString(5, "Y");
			productAdd = pstmt.executeUpdate();
			System.out.println("productAdd Successfull" + productAdd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productAdd;

	}

	@Override
	public int deleteProduct(int productId) {

		// TODO Auto-generated method stub
		int productUpdate = 0;
		try {
			System.out.println("in deleteProduct daoImpl");
			connection = DatabaseConnection.getConnection();
			pstmt = connection
					.prepareStatement("UPDATE `ecomm`.`product_master` SET `IS_ACTIVE`='N' WHERE `PRODUCT_ID`="
							+ productId);
			productUpdate = pstmt.executeUpdate();
			System.out.println("Out deleteProduct daoImpl");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failed to update status" + e);
			e.printStackTrace();
		}
		return productUpdate;
	}

	@Override
	public ProductVo editProduct(int productId) {
		ProductVo productVo = null;
		connection = DatabaseConnection.getConnection();
		try {
			pstmt = connection
					.prepareStatement("SELECT * FROM `ecomm`.`product_master` where IS_ACTIVE='Y' and product_id="
							+ productId);
			resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				productVo = new ProductVo();
				productVo.setProductId(resultSet.getInt("PRODUCT_ID"));
				productVo.setProductName(resultSet.getString("PRODUCT_NAME"));
				productVo.setProductBrand(resultSet.getString("PRODUCT_BRAND"));
				productVo.setProductQuantity(resultSet
						.getString("PRODUCT_QUANTITY"));
				productVo.setProductPrice(resultSet.getString("PRODUCT_PRICE"));
				productVo.setIsActive(resultSet.getString("IS_ACTIVE"));
			}

		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return productVo;
	}

	@Override
	public int updateProduct(ProductActions productData) {
		// TODO Auto-generated method stub
		int productUpdate = 0;
		try {
			System.out.println("in updateProduct daoImpl");
			connection = DatabaseConnection.getConnection();
			pstmt = connection
					.prepareStatement("UPDATE `ecomm`.`product_master` SET `PRODUCT_NAME`=?, `PRODUCT_BRAND`=?,"
							+ " `PRODUCT_QUANTITY`=?, `PRODUCT_PRICE`=? WHERE `PRODUCT_ID`="
							+ productData.getProductId());
			pstmt.setString(1, productData.getProductName());
			pstmt.setString(2, productData.getProductBrand());
			pstmt.setString(3, productData.getProductQuantity());
			pstmt.setString(4, productData.getProductPrice());
			productUpdate = pstmt.executeUpdate();
			System.out.println("Out updateProduct daoImpl");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failed to update status" + e);
			e.printStackTrace();
		}
		return productUpdate;
	}

	@Override
	public int addProductToCart(UserProductActions userProductActions) {
		int productAdd = 0;
		connection = DatabaseConnection.getConnection();
		String sqlQuery = "INSERT INTO `ecomm`.`userproductdetails` (`USER_ID`, `PRODUCT_ID`,`USER_PRODUCT_QUANTITY`, `PRODUCT_PRICE`, `PURCHASE_STATUS`,`IS_ACTIVE`)"
				+ " VALUES (?, ?, ?, ?, ?, ?)";
		try {
			pstmt = connection.prepareStatement(sqlQuery);
			pstmt.setInt(1, userProductActions.getUserId());
			pstmt.setInt(2, userProductActions.getProductId());
			pstmt.setString(3, userProductActions.getUserProductQuantity());
			pstmt.setString(4, userProductActions.getProductPrice());
			pstmt.setString(5, userProductActions.getPurchaseStatus());
			pstmt.setString(6, "Y");
			productAdd = pstmt.executeUpdate();
			System.out.println("User product Add to cart Successfull"
					+ productAdd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return productAdd;

	}

	@Override
	public List<UserProductVo> getAllUserCartProduct(int userId) {

		List<UserProductVo> productList = new ArrayList<UserProductVo>();
		UserProductVo userProductVo = null;
		connection = DatabaseConnection.getConnection();
		try {
			pstmt = connection
					.prepareStatement("select u.USER_PRODUCT_ID,u.USER_ID,u.PRODUCT_ID,u.USER_PRODUCT_QUANTITY,u.PRODUCT_PRICE,"
							+ "u.PURCHASE_STATUS,u.IS_ACTIVE,p.PRODUCT_NAME from"
							+ " ecomm.userproductdetails as u,ecomm.product_master as p where"
							+ " p.PRODUCT_ID=u.PRODUCT_ID and p.IS_ACTIVE='Y' and u.PURCHASE_STATUS='InCart' and u.user_id="
							+ userId);
			resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				userProductVo = new UserProductVo();
				userProductVo.setProductId(resultSet.getInt("PRODUCT_ID"));
				userProductVo.setProductPrice(resultSet
						.getString("PRODUCT_PRICE"));
				userProductVo.setUserProductQuantity(resultSet
						.getString("USER_PRODUCT_QUANTITY"));
				userProductVo.setProductPrice(resultSet
						.getString("PRODUCT_PRICE"));
				userProductVo.setProductPrice(resultSet
						.getString("PRODUCT_PRICE"));
				userProductVo.setIsActive(resultSet.getString("IS_ACTIVE"));
				userProductVo.setProductName(resultSet
						.getString("PRODUCT_NAME"));
				productList.add(userProductVo);
			}

		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return productList;

	}
}
