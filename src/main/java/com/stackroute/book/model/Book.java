package com.stackroute.book.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * This model Book class is having four private properties-bookId,bookName,bookAuthor,bookPrice.
 * Give proper annotations for this entity model
 */

@Entity
public class Book {
	
	/*
	 * Write no-arg and parameterized constructor.
	 * Write Getter and  Setter functions for all the properties
	 * bookId is the primary key 
	 */

	@Id
	@Column(length = 20)
	@NotNull
	private String bookId;
	@Column(length = 20)
	private String bookName;
	@Column(length = 20)
	private String bookAuthor;
	@Column(length = 20)
	private double bookPrice;
	
	
	public Book() {
		super();
	}


	public Book(String bookId, String bookName, String bookAuthor, double bookPrice) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
	}


	public String getBookId() {
		return bookId;
	}


	public void setBookId(String bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getBookAuthor() {
		return bookAuthor;
	}


	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}


	public double getBookPrice() {
		return bookPrice;
	}


	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	
	
	
	
	
}
