package com.students.students.controller;

import com.students.students.dto.JWTAuthenticationResponse;
import com.students.students.dto.RefreshTokenRequest;
import com.students.students.dto.SignUpRequest;
import com.students.students.dto.SignInRequest;
import com.students.students.model.users;
import com.students.students.services.AuthenticationService;

import com.students.students.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<users> signup(@RequestBody SignUpRequest signUpRequest)
    {
        return  ResponseEntity.ok(authenticationService.signup(signUpRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<JWTAuthenticationResponse> signin(@RequestBody SignInRequest signinRequest)
    {
        return ResponseEntity.ok(authenticationService.signin(signinRequest));
    }

    @PostMapping("/refresh")
    public ResponseEntity<JWTAuthenticationResponse> refresh(@RequestBody RefreshTokenRequest refreshTokenRequest)
    {
        return ResponseEntity.ok(authenticationService.refreshToken(refreshTokenRequest));
    }


}