/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trainermvc.dao;

import com.mycompany.trainermvc.entities.Trainer;
import java.util.List;

/**
 *
 * @author konstantinos
 */
public interface ITrainerDao {
    public List<Trainer> findAllTrainers();
    public Trainer findById(int id);
    public boolean save(Trainer trainer);
    public boolean delete(int id);
    public boolean update(Trainer trainer);
}
