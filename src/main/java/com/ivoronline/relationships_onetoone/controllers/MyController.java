package com.ivoronline.relationships_onetoone.controllers;

import com.ivoronline.relationships_onetoone.entities.AuthorEntity;
import com.ivoronline.relationships_onetoone.entities.AddressEntity;
import com.ivoronline.relationships_onetoone.repositories.AuthorRepository;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

  @Autowired
  AuthorRepository  authorRepository;

  @ResponseBody
  @RequestMapping("/addAuthor")
  public String addAuthor() {

    //CREATE ADDRESS ENTITY
    AddressEntity addressEntity        = new AddressEntity();
                  addressEntity.city   = "London";
                  addressEntity.street = "Piccadilly";

    //CREATE AUTHOR ENTITY
    AuthorEntity  authorEntity         = new AuthorEntity();
                  authorEntity.name    = "John";
                  authorEntity.age     = 20;
                  authorEntity.address = addressEntity;

    //STORE AUTHOR/ADDRESS ENTITY INTO DB
    authorRepository.save(authorEntity);

    //RETURN SOMETHING TO BROWSER
    return "Author/Address was stored into DB";

  }

}
