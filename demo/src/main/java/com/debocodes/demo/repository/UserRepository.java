package com.debocodes.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.debocodes.demo.entity.Users;

@Repository
public interface UserRepository extends CrudRepository<Users, Integer> {

}
