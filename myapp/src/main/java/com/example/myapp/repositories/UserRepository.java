package com.example.myapp.repositories;

import com.example.myapp.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer> {

  @Query(value = "SELECT * FROM users WHERE user_name=:userName AND password=:password", nativeQuery = true)
  public User logIn(@Param("userName") String username, @Param("password") String password);
}
