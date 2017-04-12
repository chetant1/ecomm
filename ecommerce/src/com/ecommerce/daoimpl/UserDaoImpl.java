package com.ecommerce.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.mail.MessagingException;

import com.ecommerce.actions.UserAction;
import com.ecommerce.dao.UserDao;
import com.ecommerce.database.DatabaseConnection;
import com.ecommerce.utility.EmailUtil;
import com.ecommerce.vo.UserVo;

public class UserDaoImpl implements UserDao {
	Connection connection = null;
	PreparedStatement pstmt = null;
	ResultSet resultSet = null;
	String result = null;
	private static final DateFormat sdf = new SimpleDateFormat(
			"yyyy/MM/dd HH:mm:ss");

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
		if (null != connection) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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

	@Override
	public UserVo authenticate(UserAction userAction) {
		UserVo userVo = null;
		connection = DatabaseConnection.getConnection();

		String sqlQuery = "select * from ecomm.usermaster where firstname=? and password=?";
		try {
			pstmt = connection.prepareStatement(sqlQuery);
			pstmt.setString(1, userAction.getFirstName());
			pstmt.setString(2, userAction.getPassword());
			resultSet = pstmt.executeQuery();
			if (resultSet.next()) {
				userVo = new UserVo();
				userVo.setUserId(resultSet.getInt("USER_ID"));
				userVo.setFirstName(resultSet.getString("FIRSTNAME"));
				userVo.setUserRole(resultSet.getString("USERROLE"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (null != connection) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return userVo;
	}

	@Override
	public List<UserVo> getAllUser() {
		List<UserVo> userList = new ArrayList<UserVo>();
		UserVo userVo = null;
		connection = DatabaseConnection.getConnection();
		try {
			pstmt = connection
					.prepareStatement("SELECT * FROM ecomm.usermaster where IS_ACTIVE='Y'");
			resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				userVo = new UserVo();
				userVo.setUserId(resultSet.getInt("USER_ID"));
				userVo.setFirstName(resultSet.getString("FIRSTNAME"));
				userVo.setLastName(resultSet.getString("LASTNAME"));
				userVo.setEmailId(resultSet.getString("EMAIL"));
				userVo.setMobileNumber(resultSet.getString("MOBILENO"));
				userVo.setIsActive(resultSet.getString("IS_ACTIVE"));
				userList.add(userVo);
			}

		} catch (Exception exception) {
			exception.printStackTrace();
		}
		if (null != connection) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return userList;
	}

	@Override
	public int addUser(UserAction userAction) {
		int userAdd = 0;
		connection = DatabaseConnection.getConnection();
		String sqlQuery = "INSERT INTO `ecomm`.`usermaster` (`PASSWORD`, `FIRSTNAME`, `LASTNAME`, `MOBILENO`, `EMAIL`, `USERROLE`, `IS_ACTIVE`)"
				+ " VALUES (?,?,?,?,?,?,?)";
		try {
			pstmt = connection.prepareStatement(sqlQuery);
			pstmt.setString(1, userAction.getPassword());
			pstmt.setString(2, userAction.getFirstName());
			pstmt.setString(3, userAction.getLastName());
			pstmt.setString(4, userAction.getMobileNumber());
			pstmt.setString(5, userAction.getEmailId());
			pstmt.setString(6, userAction.getUserRole());
			pstmt.setString(7, "Y");
			userAdd = pstmt.executeUpdate();
			System.out.println("userAdd Successfull" + userAdd);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (null != connection) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return userAdd;
	}

	@Override
	public int deleteUser(int userId) {
		int deleteUser = 0;
		try {
			System.out.println("in deleteUser daoImpl");
			connection = DatabaseConnection.getConnection();
			pstmt = connection
					.prepareStatement("UPDATE `ecomm`.`usermaster`  SET `IS_ACTIVE`='N' WHERE `USER_ID`="
							+ userId);
			deleteUser = pstmt.executeUpdate();
			System.out.println("Out deleteUser daoImpl");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failed to update status" + e);
			e.printStackTrace();
		}
		if (null != connection) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return deleteUser;
	}

	@Override
	public UserVo editUser(int userId) {
		UserVo userVo = null;
		connection = DatabaseConnection.getConnection();
		try {
			pstmt = connection
					.prepareStatement("SELECT * FROM `ecomm`.`usermaster` where IS_ACTIVE='Y' and user_id="
							+ userId);
			resultSet = pstmt.executeQuery();
			while (resultSet.next()) {
				userVo = new UserVo();
				userVo.setUserId(resultSet.getInt("USER_ID"));
				userVo.setFirstName(resultSet.getString("FIRSTNAME"));
				userVo.setLastName(resultSet.getString("LASTNAME"));
				userVo.setEmailId(resultSet.getString("EMAIL"));
				userVo.setMobileNumber(resultSet.getString("MOBILENO"));
				userVo.setIsActive(resultSet.getString("IS_ACTIVE"));
				userVo.setPassword(resultSet.getString("password"));
			}

		} catch (Exception exception) {
			exception.printStackTrace();
		}
		return userVo;
	}

	@Override
	public int updateUser(UserAction userAction) {
		// TODO Auto-generated method stub
		int updateUser = 0;
		try {
			System.out.println("in updateUser daoImpl");
			connection = DatabaseConnection.getConnection();
			pstmt = connection
					.prepareStatement("UPDATE `ecomm`.`usermaster` SET `FIRSTNAME`=?, `LASTNAME`=?, `MOBILENO`=?, `EMAIL`=? WHERE `USER_ID`="
							+ userAction.getUserId());
			pstmt.setString(1, userAction.getFirstName());
			pstmt.setString(2, userAction.getLastName());
			pstmt.setString(3, userAction.getMobileNumber());
			pstmt.setString(4, userAction.getEmailId());
			updateUser = pstmt.executeUpdate();
			System.out.println("Out updateUser daoImpl");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Failed to update status" + e);
			e.printStackTrace();
		}
		if (null != connection) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return updateUser;
	}

	public int trackUserActivity(int userId, String userAction) {
		int iuserCreated = 0;
		connection = DatabaseConnection.getConnection();
		Calendar cal = Calendar.getInstance();
		String startDate = sdf.format(cal.getTime());
		String datetime[] = startDate.split(" ");
		String actionDate = datetime[0];
		String startActionTIme = datetime[1];
		String sqlQuery = "INSERT INTO `ecomm`.`user_activity` (`USER_ID`, `USER_ACTION`, `ACTIVITY_DATE`, `START_TIME`) "
				+ "VALUES (?,?,?,?)";
		try {
			pstmt = connection.prepareStatement(sqlQuery);
			pstmt.setInt(1, userId);
			pstmt.setString(2, userAction);
			pstmt.setString(3, actionDate);
			pstmt.setString(4, startActionTIme);
			iuserCreated = pstmt.executeUpdate();
			System.out.println("Registration Successfull" + iuserCreated);
			if (iuserCreated == 1) {
				String userTrackIDQuery = "SELECT max(USER_TRACK_ID) as USER_TRACK_ID FROM user_activity WHERE USER_TRACK_ID < (SELECT max(USER_TRACK_ID) FROM user_activity) and user_id="
						+ userId;
				pstmt = connection.prepareStatement(userTrackIDQuery);
				resultSet = pstmt.executeQuery();
				int userTrackId = 0;
				if (resultSet.next()) {
					userTrackId = resultSet.getInt("USER_TRACK_ID");
				}
				String endSqlQuery = "UPDATE `ecomm`.`user_activity` SET `END_TIME`=? WHERE `USER_TRACK_ID`="
						+ userTrackId;
				pstmt = connection.prepareStatement(endSqlQuery);
				pstmt.setString(1, startActionTIme);
				int iusertimeSpend = pstmt.executeUpdate();
				if (iusertimeSpend == 1) {
					String iuserTrackIDQuery = "select start_time,end_time from ecomm.user_activity where user_track_id="
							+ userTrackId;
					pstmt = connection.prepareStatement(iuserTrackIDQuery);
					resultSet = pstmt.executeQuery();
					String endActionTime = null;
					String StartActionTime = null;
					if (resultSet.next()) {
						StartActionTime = resultSet.getString("start_time");
						endActionTime = resultSet.getString("end_time");
					}
					String timeSpend = timeSpend(StartActionTime, endActionTime);
					String timeSpendquery = "UPDATE `ecomm`.`user_activity` SET `TIME_SPEND`=? WHERE `USER_TRACK_ID`="
							+ userTrackId;
					pstmt = connection.prepareStatement(timeSpendquery);
					pstmt.setString(1, timeSpend);
					int itimeSpend = pstmt.executeUpdate();
					System.out.println("ime difference added" + itimeSpend);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (null != connection) {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return iuserCreated;

	}

	public String timeSpend(String sTime, String eTime) {
		Date sdate = null;
		Date edate = null;
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
		try {
			sdate = sdf.parse(sTime);
			edate = sdf.parse(eTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long duration = edate.getTime() - sdate.getTime();

		long diffInSeconds = TimeUnit.MILLISECONDS.toSeconds(duration);
		long diffInMinutes = TimeUnit.MILLISECONDS.toMinutes(duration);
		long diffInHours = TimeUnit.MILLISECONDS.toHours(duration);
		String timeSpend = "" + diffInHours + ":" + diffInMinutes + ":"
				+ diffInSeconds;
		return timeSpend;
	}
}
