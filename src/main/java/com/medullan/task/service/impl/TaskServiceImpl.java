package com.medullan.task.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medullan.task.dao.TaskDAO;
import com.medullan.task.model.Task;
import com.medullan.task.service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {
	
	@Autowired
	TaskDAO taskDao;
	
	@Override
	public void add(Task obj) {
		taskDao.add(obj);
	}

	@Override
	public void edit(Task obj) {
		taskDao.edit(obj);
	}

	@Override
	public void delete(Integer id) {
		taskDao.delete(id);
	}

	@Override
	public Task get(Integer id) {
		return taskDao.get(id);
	}

	@Override
	public List<Task> getAll() {
		return taskDao.getAll();
	}

	public TaskDAO getTaskDao() {
		return taskDao;
	}

	public void setTaskDao(TaskDAO taskDao) {
		this.taskDao = taskDao;
	}
	
	

}
