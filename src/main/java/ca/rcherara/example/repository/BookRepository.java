package ca.rcherara.example.repository;

import ca.rcherara.example.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * @author rcherara
 *
 */

public interface BookRepository extends JpaRepository<Book, Long> {
}
