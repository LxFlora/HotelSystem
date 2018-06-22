package com.slsd.service;

import java.util.List;

import com.slsd.entity.User;

public interface UserService {
	/**
	 * 查询所有用户
	 * @return List<User>
	 */
	public List<User> getAllUser();
	/**
	 * 添加用户
	 * @param user
	 * @return boolean
	 */
	public boolean addUser(User user);
	/**
	 *编辑用户信息 
	 * @param user
	 * @return boolean
	 */
	public boolean editUser(User user);
	/**
	 * 删除用户
	 * @param uid
	 * @return boolean
	 */
	public boolean delUser(int uid);
}
