package com.glearning.studentManagement.service;



import com.glearning.studentManagement.entity.Student;

import java.util.List;


public interface StudentService {
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student thestudent);

	public void deleteById(int theId);

	

}
