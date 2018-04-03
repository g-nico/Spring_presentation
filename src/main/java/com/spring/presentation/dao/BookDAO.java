package com.spring.presentation.dao;

import com.spring.presentation.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * @author Nicoleta GHITESCU at 27-Mar-18
 */
@Repository
@Transactional
public interface BookDAO extends JpaRepository<Book, Long> {

    Book findByTitleAndAuthor(String title, String author);

    //List<Book> findBookByDateBefore(Date date);

}
