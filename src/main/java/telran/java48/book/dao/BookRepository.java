package telran.java48.book.dao;

import java.util.Optional;
import java.util.stream.Stream;

import telran.java48.book.model.Book;

public interface BookRepository {
	Stream<Book> findByAuthorsName(String name);

	Stream<Book> findByPublisherPublisherName(String name);

	boolean existsById(String isbn);

	Book save(Book book);

	Optional<Book> findById(String isbn);

	void deleteById(String isbn);
}
