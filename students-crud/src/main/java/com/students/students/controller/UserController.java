
package com.students.students.controller;

import com.students.students.model.users;
import com.students.students.services.userServices;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor

public class UserController {


    @GetMapping
    public ResponseEntity<String> sayHello()
    {
        return ResponseEntity.ok("Hi User");
    }


}
