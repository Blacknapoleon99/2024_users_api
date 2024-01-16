package com.example._users_api.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class NamesController {

    @GetMapping("/names")
    public String getName(){
        return "You Name is Kevin";
    }

    @PostMapping("/names") // SKapa namn eller användare
    public String postName(@RequestBody String name){
        return "Posting Your Name: " + name;
    }

    @PutMapping("/names") // uppdatera befintlig namn eller användare
    public String putName() {
        return "Updating Your Name";
    }

    @DeleteMapping("/names") // ta bort namn eller användare
    public String deleteName() {
        return "Deleting Your Name";
    }

}
