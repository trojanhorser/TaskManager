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
		map.put("task2", task);
		map.put("taskList", taskService.getAll());
		return "task2";
	}
	
//	@RequestMapping(value="/student.do",method=RequestMethod.POST)
//	public String doActions(@ModelAttribute Student student,BindingResult result,
//		   @RequestParam String action, Map<String,Object> map){
//		
//		Student searchedStudent  = null;
//		Student studentResult = null;
//		
//		
//		
////		switch(action.toLowerCase()){
////			case "add":
////				studentService.add(student);
////			break;
////			case "edit":
////				studentService.edit(student);
////			break;
////			case "delete":
////				studentService.delete(student.getStudentid());
////			break;
////			case "search":
////				searchedStudent = studentService.get(student.getStudentid());
////			break;
////		}
//		
//		if(searchedStudent != null){
//			studentResult = searchedStudent;
//		}else{
//			studentResult = student;
//		}
//		
//		map.put("student", studentResult);
//		map.put("studentList", studentService.getAll());
//		return "student";
//	}
//	
//	//Getters and Setter
//	public StudentService getStudentService() {
//		return studentService;
//	}
//
//	public void setStudentService(StudentServiceImpl studentService) {
//		this.studentService = studentService;
//	}
//
//	public Student getStudent() {
//		return student;
//	}
//
//	public void setStudent(Student student) {
//		this.student = student;
//	}

}
