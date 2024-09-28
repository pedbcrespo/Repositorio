package bgbackend.com.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BetRequest {
    private Long userId;
    private String poolId;
    private Double value;
}
