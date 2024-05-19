package com.example.demo.services;

import com.example.demo.entity.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {


    @Autowired
    IUsersService iSectionService;

    public List<UsersEntity> loadAllSections() {
        return (List<UsersEntity>) iSectionService.findAll();
    }

    public UsersEntity addProduct(UsersEntity product) {return iSectionService.save(product);}

    public void Delete(UsersEntity sections) {
        iSectionService.delete(sections);
    }

    public UsersEntity getById(Integer id) {
        return iSectionService.findById(id).orElse(null);
    }
    public UsersEntity update(UsersEntity student) {
        UsersEntity updateResponse = iSectionService.save(student);
        return updateResponse;
    }

}