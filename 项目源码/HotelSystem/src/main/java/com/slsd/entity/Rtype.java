package com.slsd.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * 客房类型表
 * @author wmm
 *OneToMany(Room)
 */
public class Rtype {
	private int rtypeId;//客房类型ID
	private String rtypeName;//客房类型名
	private int liveNum;//客房居住人数
	private String facility;//基础设施
	private int resMoney;//预定金额
	private int isRes;//是否可预定
	private int isNet;//是否有宽带
	private int isFoot;//是否提供早餐
	private String imgUrl;//宣传图片
	private String remark;//备注
	private Set<Room> rooms = new HashSet<Room>();
	/**
	 * @return the rtypeId
	 */
	public int getRtypeId() {
		return rtypeId;
	}
	/**
	 * @param rtypeId the rtypeId to set
	 */
	public void setRtypeId(int rtypeId) {
		this.rtypeId = rtypeId;
	}
	/**
	 * @return the rtypeName
	 */
	public String getRtypeName() {
		return rtypeName;
	}
	/**
	 * @param rtypeName the rtypeName to set
	 */
	public void setRtypeName(String rtypeName) {
		this.rtypeName = rtypeName;
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
	 * @return the imgUrl
	 */
	public String getImgUrl() {
		return imgUrl;
	}
	/**
	 * @param imgUrl the imgUrl to set
	 */
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
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
	 * @return the rooms
	 */
	public Set<Room> getRooms() {
		return rooms;
	}
	/**
	 * @param rooms the rooms to set
	 */
	public void setRooms(Set<Room> rooms) {
		this.rooms = rooms;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Rtype [rtypeId=" + rtypeId + ", rtypeName=" + rtypeName + ", liveNum=" + liveNum + ", facility="
				+ facility + ", resMoney=" + resMoney + ", isRes=" + isRes + ", isNet=" + isNet + ", isFoot=" + isFoot
				+ ", imgUrl=" + imgUrl + ", remark=" + remark + "]";
	}

	
}
