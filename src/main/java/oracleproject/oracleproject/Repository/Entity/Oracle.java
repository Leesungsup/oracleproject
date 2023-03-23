package oracleproject.oracleproject.Repository.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Data
public class Oracle {
    @Id @GeneratedValue
    @Column(name = "SEQ_NO")
    private Long id;

    @Column(name = "NAME")
    private String name;
}
