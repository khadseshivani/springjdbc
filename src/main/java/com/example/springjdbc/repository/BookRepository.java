package com.example.springjdbc.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.springjdbc.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer>
{
	List<Book> findByAuthor(boolean author);
}
