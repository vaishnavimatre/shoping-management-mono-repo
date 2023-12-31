package org.dnyanyog.repo;






import java.util.List;

import org.dnyanyog.dto.LoginResponse;
import org.dnyanyog.dto.User;
import org.dnyanyog.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Repository
@Component
public interface UsersRepository  extends JpaRepository< Users, Long>{
	List<User>findByUsernameAndPassword(String username,String password);
	List<User>findByEmail(String email);
	List<User>findByAge(String age);
	List<User>findByUsername(String username);
	
	
}	
	
	
	
	
	
	
	
	
	
	
	









	
	
	
	
/*
	Users save(Users usersTable);

	Optional<User> findById(Long userId);

	List<User>findByUsernameAndPassword(String username,String password);
	List<User>findByEmail(String email);
	List<User>findByAge(String age);
	List<User>findByUserName(String userName);
List<User>findById(long userId);
	
*/

