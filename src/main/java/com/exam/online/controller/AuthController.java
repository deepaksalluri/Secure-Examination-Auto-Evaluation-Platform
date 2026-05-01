package com.exam.online.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.exam.online.entity.User;
import com.exam.online.repository.UserRepository;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Optional;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
public class AuthController {

 @Autowired
 private UserRepository userRepository;

 // create encoder once
 private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();


 // ================= REGISTER USER =================

 @PostMapping("/register")
 public ResponseEntity<?> register(@RequestBody User user){

  Optional<User> existingUser = userRepository.findByEmail(user.getEmail());

  if(existingUser.isPresent()){
   return ResponseEntity.badRequest().body("Email already registered");
  }

  // encrypt password
  user.setPassword(encoder.encode(user.getPassword()));

  User savedUser = userRepository.save(user);

  // hide password in response
  savedUser.setPassword(null);

  return ResponseEntity.ok(savedUser);
 }


 // ================= LOGIN USER =================

 @PostMapping("/login")
 public ResponseEntity<?> login(@RequestBody User request){

  Optional<User> userOptional = userRepository.findByEmail(request.getEmail());

  if(userOptional.isEmpty()){
   return ResponseEntity.badRequest().body("User not found");
  }

  User user = userOptional.get();

  if(!encoder.matches(request.getPassword(), user.getPassword())){
   return ResponseEntity.badRequest().body("Invalid password");
  }

  // hide password before sending response
  user.setPassword(null);

  return ResponseEntity.ok(user);
 }

}