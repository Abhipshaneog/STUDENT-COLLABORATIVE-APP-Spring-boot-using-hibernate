package com.springboothibernate.myservice;

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
