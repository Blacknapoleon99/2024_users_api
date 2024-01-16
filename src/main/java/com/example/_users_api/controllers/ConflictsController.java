package com.example._users_api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.*;

@RestController
public class ConflictsController {

    @GetMapping("/conflicts")
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

    @PatchMapping("/conflicts")
    public String patchConflicts(){
        return "Patching conflicts";
    }

    @PutMapping("/conflicts")
    public String putConflicts(){
        return "Putting conflicts";
    }



}
