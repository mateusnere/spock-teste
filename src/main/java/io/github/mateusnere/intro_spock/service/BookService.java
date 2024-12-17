package io.github.mateusnere.intro_spock.service;

import io.github.mateusnere.intro_spock.model.Book;
import io.github.mateusnere.intro_spock.repository.BookRepository;

public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book getBookDetails(Long id) {
        return bookRepository.findById(id).orElse(null);
    }

}
