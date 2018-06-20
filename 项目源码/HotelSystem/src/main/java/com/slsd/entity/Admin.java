package com.slsd.entity;
/**
 * 管理员表
 * @author wmm
 *
 */
public class Admin {
	private int aId;//管理员ID
	private String aName;//姓名
	private String aPwd;//密码
	/**
	 * @return the aId
	 */
	public int getaId() {
		return aId;
	}
	/**
	 * @param aId the aId to set
	 */
	public void setaId(int aId) {
		this.aId = aId;
	}
	/**
	 * @return the aName
	 */
	public String getaName() {
		return aName;
	}
	/**
	 * @param aName the aName to set
	 */
	public void setaName(String aName) {
		this.aName = aName;
	}
	/**
	 * @return the aPwd
	 */
	public String getaPwd() {
		return aPwd;
	}
	/**
	 * @param aPwd the aPwd to set
	 */
	public void setaPwd(String aPwd) {
		this.aPwd = aPwd;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Admin [aId=" + aId + ", aName=" + aName + ", aPwd=" + aPwd + "]";
	}
	
	
}
