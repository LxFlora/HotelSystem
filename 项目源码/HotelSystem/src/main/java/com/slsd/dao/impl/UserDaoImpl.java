package com.slsd.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.UserDao;
import com.slsd.entity.User;
@Repository
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	/**
	 * 查询所有管理员 
	 * @return List<Room>
	 */
	public List<User> getAllUser() {
		SqlSession sqlSession = this.getSqlSession();
		List<User> ulist=sqlSession.selectList("getAllUser");
		return ulist;
	}

	public int addUser(User user) {
		SqlSession sqlSession = this.getSqlSession();
		return sqlSession.insert("addUser", user);
	}

	public int editUser(User user) {
		SqlSession sqlSession = this.getSqlSession();
		return sqlSession.update("editUser", user);
	}

	public int delUser(int uid) {
		SqlSession sqlSession = this.getSqlSession();
		return sqlSession.delete("delUser", uid);
	}
	 /**
     * 页面查询
     * @param pageStart 开始页
     * @param pageSize  页面大小
     * @return List<User>
     */
	public List<User> page(int pageStart, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
