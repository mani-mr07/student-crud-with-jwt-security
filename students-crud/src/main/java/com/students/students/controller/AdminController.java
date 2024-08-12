package com.students.students.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/admin")
@RequiredArgsConstructor
public class AdminController {

//    @GetMapping("/special")
//    @PreAuthorize("hasRole('ADMIN')")


    @GetMapping("/base")

    public ResponseEntity<String> hellobase()
    {
        return ResponseEntity.ok("Hi Admin");
    }
}