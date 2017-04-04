package com.ecommerce.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.mail.MessagingException;

import com.ecommerce.actions.UserAction;
import com.ecommerce.dao.UserDao;
import com.ecommerce.database.DatabaseConnection;
import com.ecommerce.utility.EmailUtil;

public class UserDaoImpl implements UserDao {
	Connection connection = null;
	PreparedStatement pstmt = null;
	ResultSet resultSet = null;
	String result = null;

	@Override
	public int registeruser(UserAction user) {
		int iuserCreated = 0;
		connection = DatabaseConnection.getConnection();
		String sqlQuery = "INSERT INTO `ecomm`.`usermaster` (`FIRSTNAME`,`PASSWORD`,`EMAIL`, `IS_ACTIVE`,`USERROLE`) VALUES (?,?,?,?,?)";
		try {
			pstmt = connection.prepareStatement(sqlQuery);
			pstmt.setString(1, user.getFirstName());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getEmailId());
			pstmt.setString(4, "Y");
			pstmt.setString(5, user.getUserRole());
			iuserCreated = pstmt.executeUpdate();
			if (iuserCreated == 1) {
				sendEmailToUser(user, user.getPassword());
			}
			System.out.println("Registration Successfull" + iuserCreated);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return iuserCreated;
	}

	private void sendEmailToUser(UserAction user, String origPassword)
			throws MessagingException {
		String emailText = "";
		StringBuilder sbEmailText = new StringBuilder();
		sbEmailText
				.append("Dear ")
				.append(user.getFirstName())
				.append(",")
				.append("<br/><br/>")
				.append("Thank you for the registration!")
				.append("<br/><br/>")
				.append("Please find login details below.")
				.append("<br/><br/>")
				.append("Username : <b>")
				.append(user.getEmailId())
				.append("</b><br/>")
				.append("Password : <b>")
				.append(origPassword)
				.append("</b><br/><br/>")
				.append("<b><a href=\"http://localhost:8080/ecommerce/login.jsp\">Click Here</a></b> to log in.")
				.append("<br/><br/>").append("Regards").append("<br/>")
				.append("Team Ecommerce");
		emailText = sbEmailText.toString();
		EmailUtil.sendMail(user.getEmailId(), emailText);
	}

}
