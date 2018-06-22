package com.slsd.dao;

import java.util.List;

import com.slsd.entity.Room;
import com.slsd.entity.User;

/**
 * User接口
 * @author wmm
 */
public interface UserDao {
	/**
	 * 查询所有用户
	 * @return List<User>
	 */
	public List<User> getAllUser();
	/**
	 * 添加用户
	 * @param user
	 * @return int
	 */
	public int addUser(User user);
	/**
	 *编辑用户信息 
	 * @param user
	 * @return int
	 */
	public int editUser(User user);
	/**
	 * 删除用户
	 * @param uid
	 * @return int
	 */
	public int delUser(int uid);
	
	  /**
     * 页面查询
     * @param pageStart 开始页
     * @param pageSize  页面大小
     * @return List<Room>
     */
    public List<User> page(int pageStart,int pageSize);
    /**
     * 数据的总数
     * @return int
     */
    public int count();
}
