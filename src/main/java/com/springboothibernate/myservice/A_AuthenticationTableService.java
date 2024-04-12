package com.springboothibernate.myservice;

import com.springboothibernate.dto.LoginRequest;
import com.springboothibernate.dto.*;
import com.springboothibernate.myentity.A_Authentication;
import com.springboothibernate.myrepository.A_AuthenticationTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class A_AuthenticationTableService {

    @Autowired
    private A_AuthenticationTableRepository authenticationTableRepository;
    
    public void registerUser(RegistrationRequest request) {
    	// Extract user details from registration request
        String emailId = request.getEmail();
        String password = request.getPassword();
        // Additional details as needed

        // Create entity object and set user details
        A_Authentication user = new A_Authentication();
        user.setEmailId(emailId);
        user.setPassword(password);
        

        // Save user details to the database using repository
        authenticationTableRepository.save(user);
		
		
	}

	public void loginUser(LoginRequest request) {
		
		    // Extract login credentials from login request
		    String emailId = request.getEmail();
		    String password = request.getPassword();

		    
		    A_Authentication user = authenticationTableRepository.findByEmailId(emailId);

		    // Check if user exists and compare passwords
		    if (user != null && user.getPassword() != null && user.getPassword().equals(password)) {
		        // Authentication successful
		    	System.out.println("Authentication successful");
		    	
		    } else {
		        // Authentication failed
		        
		    }
		}



   

	public A_Authentication saveAuthentication(A_Authentication authenticationTable) {
        return authenticationTableRepository.save(authenticationTable);
    }

    public void deleteAuthentication(int id) {
        authenticationTableRepository.deleteById(id);
    }

    public List<A_Authentication> getAllAuthentications() {
        return authenticationTableRepository.findAll();
    }

    public A_Authentication getAuthenticationById(int id) {
        return authenticationTableRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Authentication not found with id: " + id));
    }

	
}
