package com.students.students.services;

import com.students.students.model.student;
import com.students.students.model.address;
import com.students.students.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.Collections;
import java.util.*;

@Component
public class StudentServices {

    @Autowired
    private static StudentRepository StudentRepository;


    public StudentServices(com.students.students.repository.StudentRepository studentRepository) {
        StudentRepository = studentRepository;
    }




    public  student saveStudent(student student) {
       for (address address : student.getAddresses()) {
            address.setStudent(student);
        }
        return StudentRepository.save(student);
    }

    public student getstudentbyid(Long studentid){

        student student1= StudentRepository.findById(studentid).orElseThrow(()->new RuntimeException("student not found"));

        return student1;
    }

    public Set<student> getallStudent() {
        List<student>studentList= StudentRepository.findAll();
        return new HashSet<>(studentList);
    }

    public void deletebyid(Long id) {
        StudentRepository.deleteById(id);
    }

    public student updatestudent(student student,Long id) {
        student student1=StudentRepository.findById(id).get();
        if(student1 != null){
         student1.setName(student.getName());
         student1.getAddresses().clear();
         student1.getAddresses().addAll(student.getAddresses());
         for(address address: student.getAddresses()){
           address.setStudent(student1);
        }
         return StudentRepository.save(student1);}
        else{
            throw new RuntimeException("student id not found");
        }
    }
}

