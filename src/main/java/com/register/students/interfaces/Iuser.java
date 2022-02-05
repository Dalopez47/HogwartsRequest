package com.register.students.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.register.students.model.User;

@Repository

public interface Iuser extends CrudRepository<User, Integer>{

}
