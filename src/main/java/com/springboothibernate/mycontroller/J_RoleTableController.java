package com.springboothibernate.mycontroller;

import com.springboothibernate.myentity.J_Role;
import com.springboothibernate.myservice.J_RoleTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/roles")
public class J_RoleTableController {

    @Autowired
    private J_RoleTableService roleTableService;

    @GetMapping
    public List<J_Role> getAllRoles() {
        return roleTableService.getAllRoles();
    }

    @GetMapping("/{id}")
    public J_Role getRoleById(@PathVariable int id) {
        return roleTableService.getRoleById(id);
    }

    @PostMapping
    public J_Role saveRole(@RequestBody J_Role roleTable) {
        return roleTableService.saveRole(roleTable);
    }

    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable int id) {
        roleTableService.deleteRole(id);
    }
}
