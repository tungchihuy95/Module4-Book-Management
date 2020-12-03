package service;

import model.Book;
import model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface BookService {
    Page<Book> findAll(Pageable pageable);

    Book findById(Long id);

    void save(Book book);

    void remove(Long id);

    Iterable<Book> findAllByCategory(Category category);

    Page<Book> findAllByBookNameContaining(String bookName, Pageable pageable);

}
