package com.app;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.User;


@Repository
public interface UserApp extends CrudRepository<User, String> {

}
