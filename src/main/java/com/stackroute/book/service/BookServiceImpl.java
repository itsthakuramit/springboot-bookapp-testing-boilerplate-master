package com.stackroute.book.service;

import java.util.List;

import com.stackroute.book.model.Book;

/**
 * Service classes are used here to implement additional business logic/validation 
 * Use Proper annotations
 */
public class BookServiceImpl implements BookService{
	
	/*
	 * Use constructor based Autowiring for BookRepository
	 */

	/*
	 * This method should be used to save a new Book.Call the corresponding
	 * method of Respository interface.
	 */

	@Override
	public Book saveBook(Book book) {
		return null;
	}
	
	/*
	 * This method should be used to get a book by its id.Call the corresponding
	 * method of Respository interface.
	 */

	@Override
	public Book getBookById(String bookId) {
		return null;
	}
	

	/*
	 * This method should be used to get all books.Call the
	 * corresponding method of Respository interface.
	 */


	@Override
	public List<Book> getAllBooks() {
		return null;
	}
	
	

}
