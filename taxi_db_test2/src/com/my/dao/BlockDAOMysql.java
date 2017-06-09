package com.my.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.vo.Block;

@Repository
public class BlockDAOMysql implements BlockDAO {
	@Autowired
	private SqlSession session = null;
	
	@Override
	public void insert(Block block) throws Exception {
		session.insert("BlockMapper.insert", block);
	}

}
