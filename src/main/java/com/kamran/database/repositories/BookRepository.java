package com.kamran.database.repositories;

import com.kamran.database.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,String> {
}
