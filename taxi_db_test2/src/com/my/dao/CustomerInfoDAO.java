package com.my.dao;

import com.my.vo.CustomerInfo;

public interface CustomerInfoDAO {
	public void insert(CustomerInfo c) throws Exception;
	public CustomerInfo selectById(String info_id) throws Exception;
}
