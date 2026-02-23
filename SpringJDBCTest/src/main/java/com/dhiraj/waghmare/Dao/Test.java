package com.dhiraj.waghmare.Dao;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/dhiraj/waghmare/Dao/spring.xml");

        // Get bean by ID and type
        StudentDao dao = (StudentDao) context.getBean("studentDao");

        // Insert a student
        dao.save(new Student("Dhiraj", "Dhiraj@gmail.com"));

        // Fetch all students
        List<Student> students = dao.findAll();
        for (Student s : students) {
            System.out.println("Id: " + s.getId());
            System.out.println("Name: " + s.getName());
            System.out.println("Email: " + s.getEmail());
        }

        // Delete student with id 1
        dao.delete(1);
    }
}