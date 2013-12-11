package com.medullan.task.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.medullan.task.dao.TaskDAO;
import com.medullan.task.model.Task;

@Repository
public class TaskDAOImpl implements TaskDAO {
	
	@Autowired 
	private SessionFactory session;
	
	@Override
	@Transactional
	public void add(Task obj) {
		session.getCurrentSession().save(obj);
	}

	@Override
	@Transactional
	public void edit(Task obj) {
		session.getCurrentSession().update(obj);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		session.getCurrentSession().delete(get(id));
	}

	@Override
	@Transactional
	public Task get(Integer id) {
		return (Task) session.getCurrentSession().get(Task.class,id);
	}

	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Task> getAll() {
		return (List<Task>) session.getCurrentSession().createQuery("from Task").list();
	}

	public SessionFactory getSession() {
		return session;
	}

	public void setSession(SessionFactory session) {
		this.session = session;
	}
}
