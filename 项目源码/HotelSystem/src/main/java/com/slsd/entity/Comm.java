package com.slsd.entity;
/**
 *评论表
 * @author wmm
 *OneToOne(Room&User)
 */
public class Comm {
	private int commId;//评论ID
	private Room room;//客房
	private User user;//客户
	private String commText;//评论内容
	private String remark;//备注
	/**
	 * @return the commId
	 */
	public int getCommId() {
		return commId;
	}
	/**
	 * @param commId the commId to set
	 */
	public void setCommId(int commId) {
		this.commId = commId;
	}
	/**
	 * @return the room
	 */
	public Room getRoom() {
		return room;
	}
	/**
	 * @param room the room to set
	 */
	public void setRoom(Room room) {
		this.room = room;
	}
	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}
	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}
	/**
	 * @return the commText
	 */
	public String getCommText() {
		return commText;
	}
	/**
	 * @param commText the commText to set
	 */
	public void setCommText(String commText) {
		this.commText = commText;
	}
	/**
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Comm [commId=" + commId + ", room=" + room + ", user=" + user + ", commText=" + commText + ", remark="
				+ remark + "]";
	}
	
	
}
