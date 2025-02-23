package com.ivoronline.relationships_onetoone.controllers;

import com.ivoronline.relationships_onetoone.entities.Author;
import com.ivoronline.relationships_onetoone.entities.Address;
import com.ivoronline.relationships_onetoone.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  @Autowired AuthorRepository  authorRepository;

  //===========================================================================
  // ADD AUTHOR ADDRESS
  //===========================================================================
  @RequestMapping("AddAuthorAddress")
  String addAuthorAddress() {

    //CREATE ADDRESS ENTITY
    Address address        = new Address();
            address.city   = "London";
            address.street = "Piccadilly";

    //CREATE AUTHOR ENTITY
    Author  author         = new Author();
            author.name    = "John";
            author.age     = 20;
            author.address = address;

    //STORE AUTHOR/ADDRESS ENTITY INTO DB
    authorRepository.save(author);

    //RETURN SOMETHING
    return "Author/Address was stored into DB";

  }

  //===========================================================================
  // GET AUTHOR ADDRESS
  //===========================================================================
  @RequestMapping("GetAuthorAddress")
  String GetAuthorAddress() {

    //GET AUTHOR
    Author author = authorRepository.findById(1).get();

    //GET ADDRESS
    Address address = author.address;

    //RETURN SOMETHING
    return author.name + " lives in " + address.city;
  }

}
