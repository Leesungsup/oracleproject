package oracleproject.oracleproject.Repository;

import oracleproject.oracleproject.Repository.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
