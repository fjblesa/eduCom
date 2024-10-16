//package com.school.educcom.infrastructure.controllers;
//
//import com.school.educcom.application.service.UserService;
//import com.school.educcom.domain.model.UserDTO;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/api/auth")
//public class AuthController {
//
//  @Autowired
//  private UserService userService;
//
//  @Autowired
//  private PasswordEncoder passwordEncoder;
//
//  @PostMapping("/register")
//  public ResponseEntity<UserDTO> register(@RequestBody UserDTO user) {
//    return ResponseEntity.ok(userService.registerUser(user));
//  }
//
//  @PostMapping("/login")
//  public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
//    UserDTO user = userService.findByUserName(loginRequest.getUserName());
//    if (user != null && passwordEncoder.matches(loginRequest.getPassword(), user.getPassword())) {
//      return ResponseEntity.ok("Login successful");
//    }
//    return ResponseEntity.status(401).body("Invalid credentials");
//  }
//}