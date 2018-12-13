package com.cg.capstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.capstore.bean.Order;
import com.cg.capstore.dao.ICapstoreDao;

public class CapstoneSerrviceImpl implements ICapstoreService{
	
	@Autowired
	ICapstoreDao capstoneDao;

	@Override
	public List<Order> showAllorders() {
		// TODO Auto-generated method stub
		return capstoneDao.showAllorders();
	}

}
