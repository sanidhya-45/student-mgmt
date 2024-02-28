package com.example.studentmgmt.repository;

//package student_mgmt.src.main.java.entity.Student;

//package net.javaguides.sms.repository;

import com.example.studentmgmt.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepository extends JpaRepository<Student, Long>{

}
