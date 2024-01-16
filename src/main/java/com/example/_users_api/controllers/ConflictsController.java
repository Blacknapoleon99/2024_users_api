package com.example._users_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConflictsController {
    @GetMapping("/conflictss")
    public String getConflicts(){
        return "Getting conflicts";
    }

    @DeleteMapping("/conflicts")
    public String deleteConflicts(){
        return "Deleting conflicts";
    }

    @PostMapping("/conflicts")
    public String postConflicts(){
        return "Posting conflicts";
    }

}