package com.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Student;

@Repository
public interface StudentApp extends CrudRepository<Student, Integer>{

}
