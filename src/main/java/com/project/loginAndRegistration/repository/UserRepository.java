package com.project.loginAndRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.loginAndRegistration.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
