package com.slsd.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.RtypeDao;
import com.slsd.entity.Rtype;
@Repository
public class RtypeDaoImpl extends SqlSessionDaoSupport implements RtypeDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	/**
	 * 查询所有房屋类型
	 * @return List<Rtype>
	 */
	public List<Rtype> getAllRtype() {
		SqlSession sqlSession = this.getSqlSession();
		List<Rtype> rtlist=sqlSession.selectList("getAllRtype");
		sqlSession.getClass();
		return rtlist;
		
	}
	/**
	 * 通过id查询
	 * @param rtypeId
	 * @return Rtype
	 */
	public Rtype getRtypeById(int getRtypeById) {
		SqlSession sqlSession = this.getSqlSession();
		Rtype rtype=sqlSession.selectOne("getRtypeById", getRtypeById);
		return rtype;
	}
	/**
	 * 添加房屋类型
	 * @param rtype
	 * @return int
	 */
	public int addRtype(Rtype rtype) {
		SqlSession sqlSession = this.getSqlSession();
		int row=sqlSession.insert("addRtype", rtype);
		return row;
	}
	/**
	 * 编辑房屋类型
	 * @param rtype
	 * @return int
	 */
	public int editRtype(Rtype editRtype) {
		SqlSession sqlSession = this.getSqlSession();
		int row=sqlSession.update("editRtype", editRtype);
		return row;
	}
	/**
	 * 根据id删除
	 * @param rtypeId
	 * @return int
	 */
	public int delRtype(int rtypeId) {
		SqlSession sqlSession = this.getSqlSession();
		int row=sqlSession.delete("delRtype", rtypeId);
		return row;
	}

}
