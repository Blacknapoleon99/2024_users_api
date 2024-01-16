package com.example._users_api.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConflictsController {


    @GetMapping("/conflict")
    public String getConflict(){
        return "Getting conflicts";
    }

    @DeleteMapping("/conflict")
    public String deleteConflict(){
        return "Deleting conflicts";
    }

}
