package com.springboothibernate.mycontroller;

import com.springboothibernate.myentity.A_Authentication;
import com.springboothibernate.myservice.A_AuthenticationTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import com.springboothibernate.dto.RegistrationRequest;
import com.springboothibernate.dto.LoginRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/auth")
public class A_AuthenticationTableController {

    @Autowired
    private A_AuthenticationTableService authenticationTableService;
    
    
    @PostMapping("/registeruser")
    public ResponseEntity<?> registerUser(@RequestBody RegistrationRequest request) {
        // Call the AuthenticationService method to handle user registration
        authenticationTableService.registerUser(request);
        // Return appropriate response
        return ResponseEntity.ok().build();
    }
    
    @PostMapping("/loginuser")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest request) {
        // Call the AuthenticationService method to handle user login
        authenticationTableService.loginUser(request);
        // Return appropriate response
		return ResponseEntity.ok().build();
    }

    @GetMapping
    public List<A_Authentication> getAllAuthentications() {
        return authenticationTableService.getAllAuthentications();
    }

    @GetMapping("/{id}")
    public A_Authentication getAuthenticationById(@PathVariable int id) {
        return authenticationTableService.getAuthenticationById(id);
    }
    
   

    @PostMapping
    public A_Authentication saveAuthentication(@RequestBody A_Authentication authenticationTable) {
        return authenticationTableService.saveAuthentication(authenticationTable);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthentication(@PathVariable int id) {
        authenticationTableService.deleteAuthentication(id);
    }
}
