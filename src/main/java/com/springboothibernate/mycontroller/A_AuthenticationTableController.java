package com.springboothibernate.mycontroller;

import com.springboothibernate.myentity.A_Authentication;
import com.springboothibernate.myservice.A_AuthenticationTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authentication")
public class A_AuthenticationTableController {

    @Autowired
    private A_AuthenticationTableService authenticationTableService;

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
