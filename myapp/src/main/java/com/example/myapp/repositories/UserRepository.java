package com.example.myapp.repositories;

import com.example.myapp.models.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends CrudRepository<User, Integer> {

  @Query(value = "SELECT * FROM users WHERE user_name=:userName AND password=:password", nativeQuery = true)
  public User logIn(@Param("userName") String username, @Param("password") String password);

  @Transactional
  @Modifying
  @Query(value = "INSERT INTO users(user_name, first_name, last_name, password, email) VALUES (:userName, :firstname, :lastname, :password, :email)", nativeQuery = true)
  public void SignUp(@Param("userName") String username, @Param("firstname") String firstname, @Param("lastname") String lastname, @Param("password") String password, @Param("email") String email);
}
