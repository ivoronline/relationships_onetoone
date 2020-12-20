package com.ivoronline.relationships_onetoone.repositories;

import com.ivoronline.relationships_onetoone.entities.AuthorEntity;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<AuthorEntity, Integer> { }
