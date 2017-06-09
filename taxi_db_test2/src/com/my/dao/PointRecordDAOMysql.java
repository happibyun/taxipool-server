package com.my.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.vo.PointRecord;

@Repository
public class PointRecordDAOMysql implements PointRecordDAO {
	@Autowired
	private SqlSession session = null;
	
	@Override
	public void insert(PointRecord pr) throws Exception {
		session.insert("PointRecordMapper.insert", pr);		
	}

}
