package com.slsd.entity;
/**
 * 客户类
 * @author wmm
 *
 */

import java.util.Date;

public class User {
    private int uId;//客户id
    private int uoraId;
    private String uNum;//客户账号
    private String uName;//客户姓名
    private String uPhone;//手机
    private String uPwd;//密码
    private String uSex;//性别
    private String IDCard;//身份证号
    private String uEmail;//邮箱
    private Date regisdate;//注册时间
    private Comm comm;//评论
    private Orders orders;//订单
    
	/**
	 * @return the uoraId
	 */
	public int getUoraId() {
		return uoraId;
	}
	/**
	 * @param uoraId the uoraId to set
	 */
	public void setUoraId(int uoraId) {
		this.uoraId = uoraId;
	}
	/**
	 * @return the orders
	 */
	public Orders getOrders() {
		return orders;
	}
	/**
	 * @param orders the orders to set
	 */
	public void setOrders(Orders orders) {
		this.orders = orders;
	}
	/**
	 * @return the uid
	 */
	public int getUId() {
		return uId;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUId(int uid) {
		this.uId = uid;
	}
	/**
	 * @return the uNum
	 */
	public String getuNum() {
		return uNum;
	}
	/**
	 * @param uNum the uNum to set
	 */
	public void setuNum(String uNum) {
		this.uNum = uNum;
	}
	/**
	 * @return the uName
	 */
	public String getuName() {
		return uName;
	}
	/**
	 * @param uName the uName to set
	 */
	public void setuName(String uName) {
		this.uName = uName;
	}
	/**
	 * @return the uPhone
	 */
	public String getuPhone() {
		return uPhone;
	}
	/**
	 * @param uPhone the uPhone to set
	 */
	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}
	/**
	 * @return the uPwd
	 */
	public String getuPwd() {
		return uPwd;
	}
	/**
	 * @param uPwd the uPwd to set
	 */
	public void setuPwd(String uPwd) {
		this.uPwd = uPwd;
	}
	/**
	 * @return the uSex
	 */
	public String getuSex() {
		return uSex;
	}
	/**
	 * @param uSex the uSex to set
	 */
	public void setuSex(String uSex) {
		this.uSex = uSex;
	}
	/**
	 * @return the iDCard
	 */
	public String getIDCard() {
		return IDCard;
	}
	/**
	 * @param iDCard the iDCard to set
	 */
	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}
	/**
	 * @return the uEmail
	 */
	public String getuEmail() {
		return uEmail;
	}
	/**
	 * @param uEmail the uEmail to set
	 */
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	/**
	 * @return the regisdate
	 */
	public Date getRegisdate() {
		return regisdate;
	}
	/**
	 * @param regisdate the regisdate to set
	 */
	public void setRegisdate(Date regisdate) {
		this.regisdate = regisdate;
	}
	
	
	/**
	 * @return the comm
	 */
	public Comm getComm() {
		return comm;
	}
	/**
	 * @param comm the comm to set
	 */
	public void setComm(Comm comm) {
		this.comm = comm;
	}
	
	public User() {
		super();
	}
	
	public User(int uoraId, String uNum, String uName, String uPhone, String uPwd, String uSex, String iDCard,
			String uEmail, Date regisdate) {
		super();
		this.uoraId = uoraId;
		this.uNum = uNum;
		this.uName = uName;
		this.uPhone = uPhone;
		this.uPwd = uPwd;
		this.uSex = uSex;
		IDCard = iDCard;
		this.uEmail = uEmail;
		this.regisdate = regisdate;
	}
	public User(int uId, int uoraId, String uNum, String uName, String uPhone, String uPwd, String uSex, String iDCard,
			String uEmail, Date regisdate) {
		super();
		this.uId = uId;
		this.uoraId = uoraId;
		this.uNum = uNum;
		this.uName = uName;
		this.uPhone = uPhone;
		this.uPwd = uPwd;
		this.uSex = uSex;
		IDCard = iDCard;
		this.uEmail = uEmail;
		this.regisdate = regisdate;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [uId=" + uId + ", uoraId=" + uoraId + ", uNum=" + uNum + ", uName=" + uName + ", uPhone=" + uPhone
				+ ", uPwd=" + uPwd + ", uSex=" + uSex + ", IDCard=" + IDCard + ", uEmail=" + uEmail + ", regisdate="
				+ regisdate + "]";
	}
	
    
    
    
    
}
