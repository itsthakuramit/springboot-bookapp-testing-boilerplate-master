package com.stackroute.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.book.model.Book;
import com.stackroute.book.repository.BookRepository;

/**
 * Service classes are used here to implement additional business logic/validation 
 * Use Proper annotations
 */

@Service
public class BookServiceImpl implements BookService{
	
	/*
	 * Use constructor based Autowiring for BookRepository
	 */
	
	@Autowired
	private BookRepository bookRepository;
	
	
	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository=bookRepository;
	}

	/*
	 * This method should be used to save a new Book.Call the corresponding
	 * method of Respository interface.
	 */

	@Override
	public Book saveBook(Book book) {
		boolean id = bookRepository.existsById(book.getBookId());
		if(id==true)
			return null;
		else
			return bookRepository.save(book);
	}
	
	/*
	 * This method should be used to get a book by its id.Call the corresponding
	 * method of Respository interface.
	 */

	@Override
	public Book getBookById(String bookId) {
		return bookRepository.findById(bookId).get();
	}
	

	/*
	 * This method should be used to get all books.Call the
	 * corresponding method of Respository interface.
	 */


	@Override
	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	
	

}
