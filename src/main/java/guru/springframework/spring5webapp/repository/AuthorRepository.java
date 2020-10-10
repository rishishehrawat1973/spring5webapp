package guru.springframework.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import guru.springframework.domain.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long>{

}
