package com.springmvc.service;

import java.util.List;

import javax.annotation.Resource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.dao.EntityDao;
import com.springmvc.dao.EntityDaoImpl;
import com.springmvc.pojo.User;

@Service
public class UserService {
	@Resource
	private EntityDao entityDao;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		entityDao = new EntityDaoImpl(sessionFactory);
	}
	
	@Transactional
	public List<Object> getStudentList(){
		StringBuffer sff = new StringBuffer();
		sff.append("select a from ").append(User.class.getSimpleName()).append(" a ");
		List<Object> list = entityDao.createQuery(sff.toString());
		return list;
	}
	
	public void save(User user){
		entityDao.save(user);
	}
	
}
