package bgbackend.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bgbackend.com.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
    
}
