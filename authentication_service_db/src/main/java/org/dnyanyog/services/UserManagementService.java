package org.dnyanyog.services;







import java.util.Optional;

import org.dnyanyog.dto.User;
import org.dnyanyog.dto.UserRequest;
import org.dnyanyog.dto.UserResponse;
import org.dnyanyog.entity.Users;
import org.dnyanyog.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserManagementService {

@Autowired
UsersRepository userRepo;


public UserResponse  addUpdateUser(UserRequest request){
	UserResponse response = new UserResponse();
	  
	Users UsersTable=new Users();
	UsersTable.setAge(request.getAge());
	UsersTable.setEmail(request.getEmail());
	UsersTable.setPassword(request.getPassword());
	UsersTable.setUsername(request.getUsername());
	
	UsersTable =userRepo.save(UsersTable);
	
	response.setMessage("user added Successfully");
	response.setStatus("Success");
	response.setUserid(UsersTable.getUserId());
	response.setAge(UsersTable.getAge());
	response.setEmail(UsersTable.getEmail());
	response.setPassword(UsersTable.getPassword());
	response.setUsername(UsersTable.getUsername());
		
	return response;
	
	
	
}
public UserResponse  UpdateUser(Long userId, UserRequest request){
	UserResponse response = new UserResponse();
	  
	Optional<Users>receivedData=userRepo.findById(userId);
	if(receivedData.isPresent()) {
			Users UsersTable=new Users();
				UsersTable.setAge(request.getAge());
				UsersTable.setEmail(request.getEmail());
				UsersTable.setPassword(request.getPassword());
				UsersTable.setUsername(request.getUsername());
				UsersTable.setUserId(userId);
	UsersTable =userRepo.save(UsersTable);
	
	response.setMessage("user updated Successfully");
	response.setStatus("Success");
	response.setUserid(userId);
	response.setAge(UsersTable.getAge());
	response.setEmail(UsersTable.getEmail());
	response.setPassword(UsersTable.getPassword());
	response.setUsername(UsersTable.getUsername());
			}
	return response;
	
	
	
	
	
}



public User getSingleUser(Long userId) {
	User userResponse =new User();
	
	Optional<Users>receivedData=userRepo.findById(userId);
	if(receivedData.isEmpty()) {
		userResponse.setStatus("Fail");
		userResponse.setMessage("User  not Found");
			}else {
				Users user=receivedData.get();
				userResponse.setStatus("Success");
				userResponse.setMessage("User Found");
				userResponse.setUserId(user.getUserId());
				userResponse.setAge(user.getAge());
				userResponse.setEmail(user.getEmail());
				userResponse.setPassword(user.getPassword());
				userResponse.setUsername(user.getUsername());
				//return userResponse;
			}
	return userResponse;
}



public void deletetSingleUser(Long userId) {
	User userResponse =new User();
	
	Optional<Users>receivedData=userRepo.findById(userId);
	if(receivedData.isPresent()) {
		userRepo.deleteById(userId);
		userResponse.setUserid(userId);		
				userResponse.setStatus("Success");
				userResponse.setMessage("User deleted");
		
				//return userResponse;
			}
	
	
}

}