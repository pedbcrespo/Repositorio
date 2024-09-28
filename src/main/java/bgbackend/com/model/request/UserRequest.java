package bgbackend.com.model.request;

import java.time.LocalDate;

import bgbackend.com.model.User;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserRequest {
    private String name;
    private String cpf;
    private LocalDate birthDate;
    private String password;

    public User getUser() {
        return new User(name, cpf, birthDate, password);
    }
}
