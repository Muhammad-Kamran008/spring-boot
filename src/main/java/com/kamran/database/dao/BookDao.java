package com.kamran.database.dao;

import com.kamran.database.domain.Book;

import java.util.Optional;

public interface BookDao {
    void create(Book book);

    Optional<Book> findOne(String isbn);
}
