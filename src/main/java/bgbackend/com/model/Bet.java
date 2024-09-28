package bgbackend.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Document(collection = "bet")
@Getter @Setter
@NoArgsConstructor
public class Bet {
    @Id
    private String id;
    private Double value;
    private Long userId;
    private Boolean open;

    public Bet(Long userId, Double value) {
        this.userId = userId;
        this.value = value;
        this.open = true;
    }
}
