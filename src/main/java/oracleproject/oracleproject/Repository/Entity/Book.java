package oracleproject.oracleproject.Repository.Entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Book {
    @Id
    @Column(name = "BOOKID")
    private Long Bookid;
    @Column(name = "BOOKNAME")
    private String Bookname;
    @Column(name = "PUBLISHER")
    private String Publisher;
    @Column(name = "PRICE")
    private int Price;
}
