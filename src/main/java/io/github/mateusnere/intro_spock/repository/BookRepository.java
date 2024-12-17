package io.github.mateusnere.intro_spock.repository;

import io.github.mateusnere.intro_spock.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
