package com.example.springjdbc.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springjdbc.model.Book;
import com.example.springjdbc.repository.BookRepository;

@RestController
public class BookController 
{
	@Autowired
	private BookRepository repo;
	
//	private JdbcTemplate jdbcTemplate;
	
//	Query q = new Query();
	
//	public BookController(JdbcTemplate jdbcTemplate) 
//	{
//		this.jdbcTemplate=jdbcTemplate;
//	}

	@PostMapping("/addBook")
	public String saveBook(@RequestBody Book book)
	{
		repo.save(book);
		return "Added book with id : "+book.getId();
	}
	
	@GetMapping("/findAllBooks")
	public List<Book> getBooks()
	{
		System.out.println("Hello");
		return repo.findAll();
		
	}
	
	@GetMapping("/findAllBooks/{id}")
	public Optional<Book> getBook(@PathVariable int id)
	{
//		q.addCriteria(Criteria.where("id").is(101));

		return repo.findById(id);
	}
	
	@DeleteMapping
	public String deleteBook(@PathVariable int id)
	{
		repo.findById(id);
		return "Book Deleted with id : "+id;
	}
	
//	query.addCriteria(Criteria.where("id").is(501));

//
//	Update update = new Update();
//	update.set("cost", 1065.25);
//	update.set("name", "Core Java");
//
//	mt.findAndModify(query, update, Book.class);
//	System.out.println("Data Modified");
}
