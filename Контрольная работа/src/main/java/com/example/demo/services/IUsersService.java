package com.example.demo.services;



import com.example.demo.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

public interface IUsersService extends CrudRepository<UsersEntity, Integer> {

}