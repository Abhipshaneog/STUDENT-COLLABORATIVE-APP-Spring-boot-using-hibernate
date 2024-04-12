package com.springboothibernate.mycontroller;

import com.springboothibernate.myentity.B_Profile;
import com.springboothibernate.myservice.B_ProfileTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/profiles")
public class B_ProfileTableController {

    @Autowired
    private B_ProfileTableService profileTableService;

    @GetMapping
    public List<B_Profile> getAllProfiles() {
        return profileTableService.getAllProfiles();
    }

    @GetMapping("/{id}")
    public B_Profile getProfileById(@PathVariable int id) {
        return profileTableService.getProfileById(id);
    }

    @PostMapping
    public B_Profile saveProfile(@RequestBody B_Profile profileTable) {
        return profileTableService.saveProfile(profileTable);
    }

    @DeleteMapping("/{id}")
    public void deleteProfile(@PathVariable int id) {
        profileTableService.deleteProfile(id);
    }
}
