package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.StudentDao;
import com.example.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDAO;

	@Override
	public void saveStudent(Student s) {
		studentDAO.saveStudent(s);	
	}

	@Override
	public List<Student> getStudents() {
		return studentDAO.getAllstudents();
	}

}
