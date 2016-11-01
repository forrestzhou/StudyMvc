package com.springmvc.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
@Repository
public class EntityDaoImpl implements EntityDao {
	private SessionFactory sessionFactory;

	public EntityDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public EntityDaoImpl() {
		
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public List<Object> createQuery(String queryString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object save(Object model) {
		getSessionFactory().getCurrentSession().save(model);
		return null;
	}

	@Override
	public void update(Object model) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Object model) {
		// TODO Auto-generated method stub

	}

}