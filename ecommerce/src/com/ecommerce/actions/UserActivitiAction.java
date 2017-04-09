package com.ecommerce.actions;

import java.util.List;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.ecommerce.bo.ProductBo;
import com.ecommerce.boimpl.ProductBoImpl;
import com.ecommerce.vo.UserActivityVo;
import com.opensymphony.xwork2.ActionSupport;

public class UserActivitiAction extends ActionSupport implements SessionAware {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int userTrackId;
	private int userId;
	private String userAction;
	private String activityDate;
	private String activityStartTime;
	private String activityEndTime;
	private String timeSpend;
	private UserActivitiAction userActivitiAction;
	private SessionMap<String, Object> sessionMap = null;
	private List<UserActivityVo> activityVoList = null;

	/**
	 * @return the userTrackId
	 */
	public int getUserTrackId() {
		return userTrackId;
	}

	/**
	 * @param userTrackId
	 *            the userTrackId to set
	 */
	public void setUserTrackId(int userTrackId) {
		this.userTrackId = userTrackId;
	}

	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * @return the userAction
	 */
	public String getUserAction() {
		return userAction;
	}

	/**
	 * @param userAction
	 *            the userAction to set
	 */
	public void setUserAction(String userAction) {
		this.userAction = userAction;
	}

	/**
	 * @return the activityDate
	 */
	public String getActivityDate() {
		return activityDate;
	}

	/**
	 * @param activityDate
	 *            the activityDate to set
	 */
	public void setActivityDate(String activityDate) {
		this.activityDate = activityDate;
	}

	/**
	 * @return the activityStartTime
	 */
	public String getActivityStartTime() {
		return activityStartTime;
	}

	/**
	 * @param activityStartTime
	 *            the activityStartTime to set
	 */
	public void setActivityStartTime(String activityStartTime) {
		this.activityStartTime = activityStartTime;
	}

	/**
	 * @return the userActivitiAction
	 */
	public UserActivitiAction getUserActivitiAction() {
		return userActivitiAction;
	}

	/**
	 * @param userActivitiAction
	 *            the userActivitiAction to set
	 */
	public void setUserActivitiAction(UserActivitiAction userActivitiAction) {
		this.userActivitiAction = userActivitiAction;
	}

	/**
	 * @return the sessionMap
	 */
	public SessionMap<String, Object> getSessionMap() {
		return sessionMap;
	}

	/**
	 * @param sessionMap
	 *            the sessionMap to set
	 */
	public void setSessionMap(SessionMap<String, Object> sessionMap) {
		this.sessionMap = sessionMap;
	}

	@Override
	public void setSession(Map<String, Object> map) {
		setSessionMap((SessionMap<String, Object>) map);

	}

	/**
	 * @return the activityVoList
	 */
	public List<UserActivityVo> getActivityVoList() {
		return activityVoList;
	}

	/**
	 * @param activityVoList
	 *            the activityVoList to set
	 */
	public void setActivityVoList(List<UserActivityVo> activityVoList) {
		this.activityVoList = activityVoList;
	}

	/**
	 * @return the activityEndTime
	 */
	public String getActivityEndTime() {
		return activityEndTime;
	}

	/**
	 * @param activityEndTime
	 *            the activityEndTime to set
	 */
	public void setActivityEndTime(String activityEndTime) {
		this.activityEndTime = activityEndTime;
	}

	public String getUserActivity() {
		ProductBo productBo = new ProductBoImpl();
		setActivityVoList(productBo.getUserActivity());
		return "success";
	}

	/**
	 * @return the timeSpend
	 */
	public String getTimeSpend() {
		return timeSpend;
	}

	/**
	 * @param timeSpend the timeSpend to set
	 */
	public void setTimeSpend(String timeSpend) {
		this.timeSpend = timeSpend;
	}

}
