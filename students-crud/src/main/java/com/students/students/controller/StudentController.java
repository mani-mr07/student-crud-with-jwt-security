package com.students.students.controller;
import com.students.students.services.userServices;
import com.students.students.model.student;
import com.students.students.model.address;
import com.students.students.model.users;
import com.students.students.repository.StudentRepository;
import com.students.students.services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Set;



@RestController
@RequestMapping
public class StudentController {

    @Autowired
    private StudentServices studentServices;

    @Autowired
    private userServices userServices;
//
//    @PostMapping("/users")
//    public users createUser(@RequestBody users user){
//        return userServices.saveUser(user);
//    }

    @PostMapping("/students")
    public student createStudent(@RequestBody student student) {

        return studentServices.saveStudent(student);
    }

    @GetMapping("students/getonestudent/{id}")
    public student getstudent(@PathVariable ("id")Long studentid){

        return studentServices.getstudentbyid(studentid);
    }

    @GetMapping("students/getallstudents")
    public Set<student>  getallstudent(){

        return studentServices.getallStudent();

    }

    @DeleteMapping("students/deletestudent/{id}")
    public void deletestudent(@PathVariable ("id")Long id){
         studentServices.deletebyid(id);
    }

    @PutMapping("students/{id}")
    public student updatestudent(@RequestBody student student,@PathVariable("id") Long id){
        return studentServices.updatestudent(student,id);

    }

}


