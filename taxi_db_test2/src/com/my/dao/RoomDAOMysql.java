package com.my.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.vo.Room;

@Repository
public class RoomDAOMysql implements RoomDAO {
	@Autowired
	private SqlSession session = null;
	
	@Override
	public void insert(Room r) throws Exception {
		session.insert("RoomMapper.insert", r);
	}

}
