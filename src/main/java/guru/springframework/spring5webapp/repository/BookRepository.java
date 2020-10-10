package guru.springframework.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.domain.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
