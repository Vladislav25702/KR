package com.example.demo.services;



import com.example.demo.entity.QuestsEntity;
import com.example.demo.entity.UsersEntity;
import org.springframework.data.repository.CrudRepository;

public interface IQuestsService extends CrudRepository<QuestsEntity, Integer> {

}