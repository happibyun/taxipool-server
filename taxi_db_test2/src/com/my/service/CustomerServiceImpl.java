package com.my.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.my.dao.CustomerInfoDAO;
import com.my.vo.CustomerInfo;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerInfoDAO dao;
	
	@Override
	public void regist(CustomerInfo customer) throws Exception {
		dao.insert(customer);
	}

	@Override
	public CustomerInfo login(String id, String pwd) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerInfo findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modify(CustomerInfo c) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyPassword(CustomerInfo c) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifyPassword(String id, String password) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(CustomerInfo c) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CustomerInfo> findByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/*@Override
	public Customer login(String id, String pwd) throws Exception {
		Customer c = dao.selectById(id);
		if(c==null || !c.getPassword().equals(pwd)){
			throw new Exception("로그인 실패");
		}else if(c==null || !c.getPassword().equals(pwd) ||"d".equals(c.getStatus())){
			throw new Exception("탈퇴한 사용자입니다");
		}else if(c==null || !c.getPassword().equals(pwd) ||"b".equals(c.getStatus())){
			throw new Exception("로그인 실패");
		}
		return c;
	}

	@Override
	public Customer findById(String id) throws Exception {
		Customer c = dao.selectById(id);
		return c;
	}

	@Override
	public void modify(Customer c) throws Exception {
		dao.update(c); 
	}

	@Override
	public void modifyPassword(Customer c) throws Exception {
		
	}

	@Override
	public void modifyPassword(String id, String password) throws Exception {
	}

	@Override
	public void remove(Customer c) throws Exception {
		
	}

	@Override
	public void remove(String id) throws Exception {
	//회원탈퇴 status를 d로 변경
		Customer c = dao.selectById(id);
		dao.updateStatusDelete(c);
	}

	public static void main(String[] args) {

	}

	@Override
	public List<Customer> findByName(String name) throws Exception {
		List<Customer> list = dao.selectByName(name);
		return list;
	}*/

}
