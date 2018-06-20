package com.slsd.entity;
/**
 * 使用者表
 * @author wmm
 *
 */
public class Uora {
	private int uoraId;//使用者id
	private String uoraType;//使用者类型
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
	 * @return the uoraType
	 */
	public String getUoraType() {
		return uoraType;
	}
	/**
	 * @param uoraType the uoraType to set
	 */
	public void setUoraType(String uoraType) {
		this.uoraType = uoraType;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Uora [uoraId=" + uoraId + ", uoraType=" + uoraType + "]";
	}
	
	
}
