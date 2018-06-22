package com.slsd.service;

import java.util.List;

import com.slsd.entity.Admin;

public interface AdminService {
	/**
	 * 查询所有管理员 
	 * @return List<Room>
	 */
    public List<Admin> getAllAdmin();
    /**
     * 添加管理员
     * @param room
     * @return boolean
     */
    public boolean addAdmin(Admin admin);
    /**
     * 编辑管理员信息
     * @param room
     * @return boolean
     */
    public boolean editAdmin(Admin admin);
    /**
     * 删除管理员信息
     * @param room
     * @return boolean
     */
    public boolean delAdmin(int aId);
}
