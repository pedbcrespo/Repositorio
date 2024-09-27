package bgbackend.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Document(collection = "bet")
@Getter @Setter
public class Bet {
    @Id
    private String id;
    private Double value;
    private Long userId;
    private Boolean open;
}
