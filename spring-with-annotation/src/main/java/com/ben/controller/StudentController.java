package com.ben.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ben.model.Student;
import com.ben.service.StudentService;

public class StudentController {
	
public static void main(String[] args) {
	
	ApplicationContext context = new AnnotationConfigApplicationContext("com.ben");
	Student student =context.getBean(Student.class);
	student.setsId(1010);
	student.setsName("Ben");
StudentService service=context.getBean(StudentService.class);

System.out.println(service);

	
	
	service.saveStudent(student);
	
	

}
}
