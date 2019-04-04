package inc.sgnorth.org.security;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import inc.sgnorth.org.model.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Integer> {

	@Query(value = "select count(1) from users", nativeQuery = true)
	Integer getCount();
}
