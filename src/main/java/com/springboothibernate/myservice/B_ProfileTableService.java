package com.springboothibernate.myservice;

import com.springboothibernate.myentity.B_Profile;
import com.springboothibernate.myrepository.B_ProfileTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class B_ProfileTableService {

    @Autowired
    private B_ProfileTableRepository profileTableRepository;

    public B_Profile saveProfile(B_Profile profileTable) {
        return profileTableRepository.save(profileTable);
    }

    public void deleteProfile(int id) {
        profileTableRepository.deleteById(id);
    }

    public List<B_Profile> getAllProfiles() {
        return profileTableRepository.findAll();
    }

    public B_Profile getProfileById(int id) {
        return profileTableRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Profile not found with id: " + id));
    }
}
