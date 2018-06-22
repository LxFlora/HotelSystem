package com.slsd.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.AdminDao;
import com.slsd.entity.Admin;
@Repository
public class AdminDaoImpl extends SqlSessionDaoSupport implements AdminDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	/**
	 * 查询所有管理员 
	 * @return List<Room>
	 */
	public List<Admin> getAllAdmin() {
		SqlSession sqlSession = this.getSqlSession();
		List<Admin> alist=sqlSession.selectList("getAllAdmin");
		return alist;
	}
	 /**
     * 添加管理员
     * @param room
     * @return int
     */
	public int addAdmin(Admin admin) {
		SqlSession sqlSession = this.getSqlSession();
		int row=sqlSession.update("editAdmin", admin);
		return row;
	}
	 /**
     * 编辑管理员信息
     * @param room
     * @return int
     */
	public int editAdmin(Admin admin) {
		SqlSession sqlSession = this.getSqlSession();
		int row=sqlSession.update("editAdmin", admin);
		return row;
	}
	/**
     * 删除管理员信息
     * @param room
     * @return
     */
	public int delAdmin(int aId) {
		SqlSession sqlSession = this.getSqlSession();
		int row=sqlSession.delete("delAdmin", aId);
		return row;	
		}

}
