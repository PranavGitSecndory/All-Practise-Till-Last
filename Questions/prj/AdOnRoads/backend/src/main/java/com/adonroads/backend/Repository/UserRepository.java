package com.adonroads.backend.Repository;
import com.adonroads.backend.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
//UserRepository is needed to talk to the database without writing SQL.
//It acts as a bridge between your Java code and the database table (users).
public interface UserRepository extends JpaRepository<User,Integer>{

 // You can add custom queries here later if needed
 Optional<User> findByUsername(String username);  // Find user by username
}
    

