package com.ImportsFiles.repository;

import org.springframework.data.repository.CrudRepository;

import com.ImportsFiles.Models.User;

public interface UserRepository extends CrudRepository<User, String> {

}
