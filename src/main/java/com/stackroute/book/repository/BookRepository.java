package com.stackroute.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.book.model.Book;

/**
 * This interface represents the Repository object
 * Use proper annotations.
 */

@Repository
public interface BookRepository extends JpaRepository<Book,String>{

}
