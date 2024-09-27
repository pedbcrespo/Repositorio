package bgbackend.com.model;

import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Document(collection = "pool_bet")
@Getter @Setter
public class PoolBet {
    @Id
    private String id;
    private Collection<Bet> bets;
    private String description;
    private String title;
}
