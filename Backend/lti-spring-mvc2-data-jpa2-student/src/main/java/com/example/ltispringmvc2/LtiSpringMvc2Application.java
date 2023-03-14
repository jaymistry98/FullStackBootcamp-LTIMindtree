package com.example.ltispringmvc2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.model.Student;
import com.service.StudentDao;
import com.service.StudentDaoImpl;


@EntityScan("com.model")
@EnableJpaRepositories("com.app")
@ComponentScan("com")
@SpringBootApplication
public class LtiSpringMvc2Application {
	
	//@Autowired
	//StudentDaoImpl studentdao;
	
	public static void main(String[] args) {
		SpringApplication.run(LtiSpringMvc2Application.class, args);
		
		/*
		ApplicationContext ctx=	SpringApplication.run(LtiSpringMvc2Application.class, args);
		StudentDao dao= ctx.getBean(StudentDao.class);
		
		Student stu1 = new Student(201,"Jay","Computer Science", "Queens College");
		
		List<Student> lst = dao.loadAll();
		for(Student stu2: lst) {
			System.out.println(stu2);
		}
		*/
		
		
	}
	
	

}
