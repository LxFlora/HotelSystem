package com.slsd.dao;

import java.util.List;

import com.slsd.entity.Rtype;

/**
 * Rtype接口
 * @author wmm
 */
public interface RtypeDao {
	/**
	 * 查询所有房屋类型
	 * @return List<Rtype>
	 */
	public List<Rtype> getAllRtype();
	/**
	 * 通过id查询
	 * @param rtypeId
	 * @return Rtype
	 */
	public Rtype getRtypeById(int rtypeId);
	/**
	 * 添加房屋类型
	 * @param rtype
	 * @return int
	 */
	public int addRtype(Rtype rtype);
	/**
	 * 编辑房屋类型
	 * @param rtype
	 * @return int
	 */
	public int editRtype(Rtype rtype);
	/**
	 * 根据id删除
	 * @param rtypeId
	 * @return int
	 */
	public int delRtype(int rtypeId);
}
