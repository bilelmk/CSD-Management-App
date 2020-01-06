package csd_manager.authserver;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import csd_manager.authserver.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String userName);
    public User save(User user) ;
}
