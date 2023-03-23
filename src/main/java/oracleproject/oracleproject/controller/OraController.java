package oracleproject.oracleproject.controller;
import oracleproject.oracleproject.Repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class OraController {
    private final BookRepository bookRepository;

    public OraController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @GetMapping("/")
    public Object home() {
        return bookRepository.findAll();
    }
}
