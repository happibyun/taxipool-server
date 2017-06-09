package com.my.service;

import java.util.List;

import com.my.vo.CustomerInfo;

public interface CustomerService {
	/**
	 * 고객 가입
	 * @param customer 고객객체
	 * @throws Exception
	 * */
	void regist(CustomerInfo customer) throws Exception;
	/**
	 * 로그인
	 * @param id 아이디
	 * @param pwd 비밀번호
	 * @throws Exception 로그인 실패시 예외발생
	 * */
	CustomerInfo login(String id, String pwd) throws Exception;
	/**
	 * 아이디에 해당하는 고객 반환
	 * @param id 아이디
	 * @return 고객객체 아이디에 해당하는 고객이 없을경우 null을 반환
	 * @throws Exception
	 * */
	CustomerInfo findById(String id) throws Exception;
	
	/**
	 * 고객정보를 수정한다
	 * @param c 고객객체 null값을 갖는 프로퍼티는 수정하지 않는다
	 * @throws Exception
	 */
	void modify(CustomerInfo c) throws Exception;

	/**
	 * 비밀번호를 수정한다
	 * @param c
	 * @throws Exception
	 */
	void modifyPassword(CustomerInfo c) throws Exception;
	void modifyPassword(String id, String password) throws Exception;
	
	/**
	 * 고객정보를 삭제한다
	 * @param c
	 * @throws Exception
	 */
	void remove(CustomerInfo c) throws Exception;
	void remove(String id) throws Exception;
	
	List<CustomerInfo> findByName(String name) throws Exception;	
	
}
