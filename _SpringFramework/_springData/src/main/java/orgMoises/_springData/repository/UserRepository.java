package orgMoises._springData.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import orgMoises._springData.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
