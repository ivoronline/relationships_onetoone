package com.ivoronline.relationships_onetoone.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;

@Entity
public class Author {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  name;
  public Integer age;

  @OneToOne(cascade = CascadeType.ALL)
  public Address address;

}





