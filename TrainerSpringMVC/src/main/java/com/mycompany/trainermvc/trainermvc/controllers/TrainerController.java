/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trainermvc.trainermvc.controllers;

import com.mycompany.trainermvc.trainermvc.services.ITrainer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class TrainerController {
    private String listurl = "list";
    private String editurl = "edit";
    private String deleteurl = "delete";
    private String updateurl = "update";
    
    @Autowired
    ITrainer trainerService;
    
    @Autowired
    MessageSource messageSource;
    
    // index
    @RequestMapping(value = { "/", "/list" }, method = RequestMethod.GET)
    public String listAllStudents(ModelMap view, @RequestParam(required = false) String msg) {
        //List<Trainer> trainers  = trainerService.findAllTrainers();
        //view.addAttribute("students", students);
        //view.addAttribute("editurl", editurl);
        //view.addAttribute("deleteurl", deleteurl);
        //view.addAttribute("msg", msg);
        return("studentlist");
    }
    
}
