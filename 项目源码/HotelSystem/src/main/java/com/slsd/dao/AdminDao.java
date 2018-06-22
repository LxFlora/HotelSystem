package com.slsd.dao;

/**
 * Admin接口
 * @author wmm
 */
import java.util.List;

import com.slsd.entity.Admin;



public interface AdminDao {
	/**
	 * 查询所有管理员 
	 * @return List<Room>
	 */
    public List<Admin> getAllAdmin();
    /**
     * 添加管理员
     * @param room
     * @return int
     */
    public int addAdmin(Admin admin);
    /**
     * 编辑管理员信息
     * @param room
     * @return int
     */
    public int editAdmin(Admin admin);
    /**
     * 删除管理员信息
     * @param room
     * @return
     */
    public int delAdmin(int aId);
}
