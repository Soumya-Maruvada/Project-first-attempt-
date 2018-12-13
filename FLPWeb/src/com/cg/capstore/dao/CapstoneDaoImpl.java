package com.cg.capstore.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.cg.capstore.bean.Order;

public class CapstoneDaoImpl implements ICapstoreDao{
	
	@PersistenceContext
	EntityManager entitymanager;

	@Override
	public List<Order> showAllorders() {
		Query query = entitymanager.createQuery("SELECT o FROM Order o");
		List<Order> order = query.getResultList();
		return order;
	}

}
