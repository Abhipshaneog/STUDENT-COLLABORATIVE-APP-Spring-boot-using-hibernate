package com.springboothibernate.myservice;

import com.springboothibernate.myentity.K_UserRole;
import com.springboothibernate.myrepository.K_UserRoleTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class K_UserRoleTableService {

    @Autowired
    private K_UserRoleTableRepository userRoleTableRepository;

    public K_UserRole saveUserRole(K_UserRole userRoleTable) {
        return userRoleTableRepository.save(userRoleTable);
    }

    public void deleteUserRole(int id) {
        userRoleTableRepository.deleteById(id);
    }

    public List<K_UserRole> getAllUserRoles() {
        return userRoleTableRepository.findAll();
    }

    public K_UserRole getUserRoleById(int id) {
        return userRoleTableRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("User Role not found with id: " + id));
    }
}
