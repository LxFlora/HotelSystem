package com.slsd.entity;
/**
 * 客房类
 * @author wmm
 *ManyToOne(Rtype)
 */
public class Room {
    private int roomId;//客房ID
    private Rtype rtype;//客房类型
    private int price;//价格
    private int liveNum;//居住人数
    private String facility;//基础设施
    private int resMoney;//预定金额
    private int isRes;//是否可预定
    private int isNet;//是否有宽带
    private int isFoot;//是否提供早餐
    private String defImg;//默认图片url
    private String rSize;//客房大小
    private String bed;//床信息
    private String state;//状态
    private String remark;//备注
    private Comm comm;//评论
    private Orders orders;//订单
	/**
	 * @return the roomId
	 */
	public int getRoomId() {
		return roomId;
	}
	/**
	 * @param roomId the roomId to set
	 */
	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}
	/**
	 * @return the rtype
	 */
	public Rtype getRtype() {
		return rtype;
	}
	/**
	 * @param rtype the rtype to set
	 */
	public void setRtype(Rtype rtype) {
		this.rtype = rtype;
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
	 * @return the liveNum
	 */
	public int getLiveNum() {
		return liveNum;
	}
	/**
	 * @param liveNum the liveNum to set
	 */
	public void setLiveNum(int liveNum) {
		this.liveNum = liveNum;
	}
	/**
	 * @return the facility
	 */
	public String getFacility() {
		return facility;
	}
	/**
	 * @param facility the facility to set
	 */
	public void setFacility(String facility) {
		this.facility = facility;
	}
	/**
	 * @return the resMoney
	 */
	public int getResMoney() {
		return resMoney;
	}
	/**
	 * @param resMoney the resMoney to set
	 */
	public void setResMoney(int resMoney) {
		this.resMoney = resMoney;
	}
	/**
	 * @return the isRes
	 */
	public int getIsRes() {
		return isRes;
	}
	/**
	 * @param isRes the isRes to set
	 */
	public void setIsRes(int isRes) {
		this.isRes = isRes;
	}
	/**
	 * @return the isNet
	 */
	public int getIsNet() {
		return isNet;
	}
	/**
	 * @param isNet the isNet to set
	 */
	public void setIsNet(int isNet) {
		this.isNet = isNet;
	}
	/**
	 * @return the isFoot
	 */
	public int getIsFoot() {
		return isFoot;
	}
	/**
	 * @param isFoot the isFoot to set
	 */
	public void setIsFoot(int isFoot) {
		this.isFoot = isFoot;
	}
	/**
	 * @return the defImg
	 */
	public String getDefImg() {
		return defImg;
	}
	/**
	 * @param defImg the defImg to set
	 */
	public void setDefImg(String defImg) {
		this.defImg = defImg;
	}
	/**
	 * @return the rSize
	 */
	public String getrSize() {
		return rSize;
	}
	/**
	 * @param rSize the rSize to set
	 */
	public void setrSize(String rSize) {
		this.rSize = rSize;
	}
	/**
	 * @return the bed
	 */
	public String getBed() {
		return bed;
	}
	/**
	 * @param bed the bed to set
	 */
	public void setBed(String bed) {
		this.bed = bed;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Room [roomId=" + roomId + ", rtype=" + rtype + ", price=" + price + ", liveNum=" + liveNum
				+ ", facility=" + facility + ", resMoney=" + resMoney + ", isRes=" + isRes + ", isNet=" + isNet
				+ ", isFoot=" + isFoot + ", defImg=" + defImg + ", rSize=" + rSize + ", bed=" + bed + ", state=" + state
				+ ", remark=" + remark + "]";
	}
    
    
}
