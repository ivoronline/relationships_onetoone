package com.ivoronline.relationships_onetoone.repositories;

import com.ivoronline.relationships_onetoone.entities.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Integer> { }
