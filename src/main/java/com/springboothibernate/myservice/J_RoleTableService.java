package com.springboothibernate.myservice;

import com.springboothibernate.myentity.J_Role;
import com.springboothibernate.myrepository.J_RoleTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class J_RoleTableService {

    @Autowired
    private J_RoleTableRepository roleTableRepository;

    public J_Role saveRole(J_Role roleTable) {
        return roleTableRepository.save(roleTable);
    }

    public void deleteRole(int id) {
        roleTableRepository.deleteById(id);
    }

    public List<J_Role> getAllRoles() {
        return roleTableRepository.findAll();
    }

    public J_Role getRoleById(int id) {
        return roleTableRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Role not found with id: " + id));
    }
}
