package com.slsd.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.slsd.dao.RoomDao;
import com.slsd.entity.Room;

@Repository
public class RoomDaoImpl extends SqlSessionDaoSupport implements RoomDao {
	@Autowired
	@Qualifier("sqlSessionFactory")
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	public List<Room> getAllRoom() {
		SqlSession sqlSession = this.getSqlSession();
		List<Room> rlist=sqlSession.selectList("getAllRoom");
		return rlist;
		
	}

	public Room getRoomById(int roomId) {
		SqlSession sqlSession = this.getSqlSession();
		Room room=sqlSession.selectOne("getRoomById", roomId);
		return room;
	}

	public int addRoom(Room room) {
		SqlSession sqlSession = this.getSqlSession();
		int row=sqlSession.insert("addRoom", room);
		return row;
	}

	public int editRoom(Room room) {
		SqlSession sqlSession = this.getSqlSession();
		int row=sqlSession.update("editRoom", room);
		return row;
	}

	public int delRoom(int roomId) {
		SqlSession sqlSession = this.getSqlSession();
		int row=sqlSession.delete("delRoom", roomId);
		return row;
	}

	public List<Room> page(int pageStart, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
