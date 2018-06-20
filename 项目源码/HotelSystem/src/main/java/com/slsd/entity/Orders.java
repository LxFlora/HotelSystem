package com.slsd.entity;
/**
 * 订单表
 * @author wmm
 *OneToOne(Room&User)
 */

import java.util.Date;

public class Orders {
	private int orderId;//订单ID
	private Room room ;//客房
	private User user ;//客户
	private String orderstate ;//订单状态
	private int Deposit;//定金
	private int price;//价格
	private Date ordertime;//下单时间
	private int personNum;//人数
	private Date inTime;//入住时间
	private Date outTime;//离开时间
	private String remark ;//备注
	/**
	 * @return the orderId
	 */
	public int getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(int orderId) {
		this.orderId = orderId;
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
	 * @return the orderstate
	 */
	public String getOrderstate() {
		return orderstate;
	}
	/**
	 * @param orderstate the orderstate to set
	 */
	public void setOrderstate(String orderstate) {
		this.orderstate = orderstate;
	}
	/**
	 * @return the deposit
	 */
	public int getDeposit() {
		return Deposit;
	}
	/**
	 * @param deposit the deposit to set
	 */
	public void setDeposit(int deposit) {
		Deposit = deposit;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the ordertime
	 */
	public Date getOrdertime() {
		return ordertime;
	}
	/**
	 * @param ordertime the ordertime to set
	 */
	public void setOrdertime(Date ordertime) {
		this.ordertime = ordertime;
	}
	/**
	 * @return the personNum
	 */
	public int getPersonNum() {
		return personNum;
	}
	/**
	 * @param personNum the personNum to set
	 */
	public void setPersonNum(int personNum) {
		this.personNum = personNum;
	}
	/**
	 * @return the inTime
	 */
	public Date getInTime() {
		return inTime;
	}
	/**
	 * @param inTime the inTime to set
	 */
	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}
	/**
	 * @return the outTime
	 */
	public Date getOutTime() {
		return outTime;
	}
	/**
	 * @param outTime the outTime to set
	 */
	public void setOutTime(Date outTime) {
		this.outTime = outTime;
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
		return "Orders [orderId=" + orderId + ", room=" + room + ", user=" + user + ", orderstate=" + orderstate
				+ ", Deposit=" + Deposit + ", price=" + price + ", ordertime=" + ordertime + ", personNum=" + personNum
				+ ", inTime=" + inTime + ", outTime=" + outTime + ", remark=" + remark + "]";
	}
	
	
}
