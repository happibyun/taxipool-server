package com.my.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.vo.CustomerInfo;

@Repository
public class CustomerInfoDAOMysql implements CustomerInfoDAO {
	@Autowired
	private SqlSession session = null;
	
	//회원가입
	@Override
	public void insert(CustomerInfo c) throws Exception {
		session.insert("CustomerInfoMapper.insert", c);		
	}

	//로그인
	@Override
	public CustomerInfo selectById(String info_id) throws Exception {
		try{
			return session.selectOne("CustomerInfoMapper.selectById", info_id);
		} catch(Exception e){
			throw e;
		}
	}

}
