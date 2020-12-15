/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trainermvc.services;

import com.mycompany.trainermvc.dao.TrainerDaoImpl;
import com.mycompany.trainermvc.entities.Trainer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("trainerService")
@Transactional
public class TrainerImpl implements ITrainer{
    
    @Autowired
    TrainerDaoImpl dao;
    
    @Override
    public List<Trainer> findAllTrainers() {
        List<Trainer> trainers = dao.findAllTrainers();
        return trainers;
    }

    public Trainer findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean save(Trainer trainer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean update(Trainer student) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
