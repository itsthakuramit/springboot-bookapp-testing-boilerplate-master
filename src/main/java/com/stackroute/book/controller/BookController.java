package com.stackroute.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.book.model.Book;
import com.stackroute.book.service.BookService;

/**
 * We are creating REST web services  and Controllers intercept the client request and generates the response.
 * Use proper annotations for this controller class.
 */

@RestController
public class BookController {
	
	/*
	 * Use COnstructor base Auto wiring for BookService
	 */
	
	@Autowired
	private BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService=bookService;
	}
	
	/*
	 * Define a handler method which will create a book by reading the
	 * Serialized category object from request body and save the category in
	 * database. This handler method should return any one of the status messages basis on
	 * different situations: 
	 * 1. 201(CREATED - In case of successful creation of the book
	 * 2. 409(CONFLICT) - In case of duplicate bookId
	 *
	 * 
	 * This handler method should map to the URL "/api/v1/bookservice/book" using HTTP POST
	 * method".
	 */
	
	@PostMapping("/api/v1/bookservice/book")
	public ResponseEntity<?> addBook(@RequestBody Book book){
		Book addBook =bookService.saveBook(book);
		if(addBook==null)
			return new ResponseEntity<String>("Book is already prsent..!!",HttpStatus.CONFLICT);	
		else
			return new ResponseEntity<String>("Book is successfully added..!!",HttpStatus.CREATED);			
	}
	

	/*
	 * Define a handler method which will get us the book by its id.
	 * 
	 * This handler method should return any one of the status messages basis on
	 * different situations: 1. 200(OK) - If the book found successfully. 
	 * 
	 * 
	 * This handler method should map to the URL "/api/v1/bookservice/{bookId}" using HTTP GET method
	 */
	
	@GetMapping("/api/v1/bookservice/{bookId}")
	public ResponseEntity<?> getBook(@PathVariable("bookId") String bookId){
		try {
			Book book = bookService.getBookById(bookId);
			return new ResponseEntity<Book>(book, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<String>("Book Id is not present..!!",HttpStatus.CONFLICT);	
		}	
	}
	
	/*
	 * Define a handler method which will get us list of books.
	 * 
	 * This handler method should return any one of the status messages basis on
	 * different situations: 1. 200(OK) - If the book found successfully. 
	 * 
	 * 
	 * This handler method should map to the URL "/api/v1/bookservice/book" using HTTP GET method
	 */
	
	@GetMapping("/api/v1/bookservice/book")
	public ResponseEntity<?> getAllBooks(){
		List<Book> bookList = bookService.getAllBooks();
		return new ResponseEntity<>(bookList,HttpStatus.OK);
	}
}
