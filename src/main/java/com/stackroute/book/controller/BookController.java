package com.stackroute.book.controller;


/**
 * We are creating REST web services  and Controllers intercept the client request and generates the response.
 * Use proper annotations for this controller class.
 */
public class BookController {
	
	/*
	 * Use COnstructor base Auto wiring for BookService
	 */
	
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

	/*
	 * Define a handler method which will get us the book by its id.
	 * 
	 * This handler method should return any one of the status messages basis on
	 * different situations: 1. 200(OK) - If the book found successfully. 
	 * 
	 * 
	 * This handler method should map to the URL "/api/v1/bookservice/{bookId}" using HTTP GET method
	 */
	
	/*
	 * Define a handler method which will get us list of books.
	 * 
	 * This handler method should return any one of the status messages basis on
	 * different situations: 1. 200(OK) - If the book found successfully. 
	 * 
	 * 
	 * This handler method should map to the URL "/api/v1/bookservice/book" using HTTP GET method
	 */



	

}
