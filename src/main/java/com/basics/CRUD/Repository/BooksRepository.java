package com.basics.CRUD.Repository;

import com.basics.CRUD.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books,Integer> {
}
