package com.springboothibernate.mycontroller;

import com.springboothibernate.myentity.K_UserRole;
import com.springboothibernate.myservice.K_UserRoleTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userRoles")
public class K_UserRoleTableController {

    @Autowired
    private K_UserRoleTableService userRoleTableService;

    @GetMapping
    public List<K_UserRole> getAllUserRoles() {
        return userRoleTableService.getAllUserRoles();
    }

    @GetMapping("/{id}")
    public K_UserRole getUserRoleById(@PathVariable int id) {
        return userRoleTableService.getUserRoleById(id);
    }

    @PostMapping
    public K_UserRole saveUserRole(@RequestBody K_UserRole userRoleTable) {
        return userRoleTableService.saveUserRole(userRoleTable);
    }

    @DeleteMapping("/{id}")
    public void deleteUserRole(@PathVariable int id) {
        userRoleTableService.deleteUserRole(id);
    }
}
