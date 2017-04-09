package com.ecommerce.vo;

public class UserActivityVo {
	private int userTrackId;
	private int userId;
	private String userAction;
	private String activityDate;
	private String activityStartTime;
	private String activityEndTime;
	private String timeSpend;

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
