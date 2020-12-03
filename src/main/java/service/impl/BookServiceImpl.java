package service.impl;

import model.Book;
import model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repository.BookRepository;
import service.BookService;


public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;


    @Override
    public Page<Book> findAll(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findOne(id);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void remove(Long id) {
        bookRepository.delete(id);
    }

    @Override
    public Iterable<Book> findAllByCategory(Category category) {
        return bookRepository.findAllByCategory(category);
    }

    @Override
    public Page<Book> findAllByBookNameContaining(String bookName, Pageable pageable) {
        return bookRepository.findAllByBookNameContaining(bookName, pageable);
    }


}
