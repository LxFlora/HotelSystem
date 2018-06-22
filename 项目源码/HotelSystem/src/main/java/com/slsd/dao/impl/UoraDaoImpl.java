package com.slsd.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.UoraDao;
import com.slsd.entity.Uora;
@Repository
public class UoraDaoImpl extends SqlSessionDaoSupport implements UoraDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	public List<Uora> getAllUora() {
		SqlSession sqlSession = this.getSqlSession();
		List<Uora> ulist=sqlSession.selectList("getAllUora");
		return ulist;
	}

}
