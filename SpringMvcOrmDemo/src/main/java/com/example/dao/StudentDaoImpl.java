package com.example.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Student;

@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void saveStudent(Student s) {
		sessionFactory.getCurrentSession().save(s);

	}

	@Override
	public List<Student> getAllstudents() {

		return sessionFactory.getCurrentSession().createQuery("from Student").list();
	}

}
