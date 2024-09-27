package bgbackend.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import bgbackend.com.model.Bet;

public interface BetRepository extends MongoRepository<Bet, String>{
    
}
