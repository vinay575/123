package service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import dto.UserDto;
import entity.UserEntity;
import repository.UserRepo;
import service.UserService;

public class UserImp implements UserService{

	 @Autowired
	    private UserRepo userRepo;
	 
	    @Autowired
	    private PasswordEncoder passwordEncoder;
	
	
	
	@Override
	public String addUser(UserDto userDto) {
	    // Create a new UserEntity instance using data from UserDto
	    UserEntity userEntity = new UserEntity(
	            userDto.getUserId(),
	            userDto.getUserName(),
	            userDto.getPhoneNumber(),
	            userDto.getEmail(),
	            userDto.getAddress(),
	            this.passwordEncoder.encode(userDto.getPassword())
	    );

	    // Save the UserEntity using the UserRepository
	    userRepo.save(userEntity);

	    // Return the username of the newly added user
	    return userEntity.getUserName();
	}

	
	
	
	
}
