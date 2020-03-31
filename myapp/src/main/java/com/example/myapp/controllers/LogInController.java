package com.example.myapp.controllers;

import com.example.myapp.models.User;
import com.example.myapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class LogInController {

  @Autowired
  UserService userService;

  @PostMapping(value = "/login.json")
  public User logIn(@RequestParam("username") String username, @RequestParam("password") String password) {
    return userService.logIn(username, password);
  }
}
