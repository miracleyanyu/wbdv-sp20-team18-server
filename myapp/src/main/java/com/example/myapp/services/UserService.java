package com.example.myapp.services;

import com.example.myapp.models.User;
import com.example.myapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  public User logIn(String userName, String password) {
    return userRepository.logIn(userName, password);
  }

  public User SignUp(String userName, String password, String firstName, String lastName, String email) {
    userRepository.SignUp(userName, firstName, lastName, password, email);
    return userRepository.logIn(userName, password);
  }
}
