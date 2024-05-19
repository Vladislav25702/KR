package com.example.demo.services;

import com.example.demo.entity.QuestsEntity;
import com.example.demo.entity.UsersEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestsService {


    @Autowired
    IQuestsService iSectionService;

    public List<QuestsEntity> loadAllSections() {
        return (List<QuestsEntity>) iSectionService.findAll();
    }

    public QuestsEntity addProduct(QuestsEntity product) {return iSectionService.save(product);}

    public void Delete(QuestsEntity sections) {
        iSectionService.delete(sections);
    }

    public QuestsEntity getById(Integer id) {
        return iSectionService.findById(id).orElse(null);
    }
    public QuestsEntity update(QuestsEntity student) {
        QuestsEntity updateResponse = iSectionService.save(student);
        return updateResponse;
    }

}