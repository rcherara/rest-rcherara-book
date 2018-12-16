package ca.rcherara.example.service;

import ca.rcherara.example.domain.Book;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author rcherara
 *
 */
public interface BookService {

    Book saveBook(@NotNull @Valid final Book book);

    List<Book> getList();

    Book getBook(Long bookId);

    void deleteBook(final Long bookId);
}
