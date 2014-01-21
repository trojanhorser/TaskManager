package com.medullan.task;

import java.util.Map;


import com.medullan.task.model.Task;
import com.medullan.task.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

@Controller
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	private Task task;

	@RequestMapping("/index")
	public String setupForm(Map<String,Object> map){
		map.put("task", task);
		map.put("taskList", taskService.getAll());
		map.put("taskListTwo", taskService.getAll());
		return "task";
	}

}
