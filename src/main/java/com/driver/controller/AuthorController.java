package com.driver.controller;

//Add required annotations

import com.driver.models.Author;
import com.driver.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {

    //Write createAuthor API with required annotations

    @Autowired
    AuthorService authorService;

    @PostMapping("/create")
    public ResponseEntity createAuthor(@RequestBody Author author){

        authorService.create(author);
        return new ResponseEntity<>("the author is successfully added to the system", HttpStatus.CREATED);
    }

}