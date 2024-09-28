package bgbackend.com.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class User {
    public User(String name, String cpf, LocalDate birthDate, String password) {
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.password = password;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String name;
    private String password;
    private LocalDate birthDate;
}
