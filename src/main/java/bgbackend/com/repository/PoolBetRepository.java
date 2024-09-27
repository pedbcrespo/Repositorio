package bgbackend.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import bgbackend.com.model.PoolBet;

public interface PoolBetRepository extends MongoRepository<PoolBet, String>{
    
}
