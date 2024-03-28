package com.springboothibernate.myservice;

import com.springboothibernate.myentity.H_UploadLikes;
import com.springboothibernate.myrepository.H_UploadLikesTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class H_UploadLikesTableService {

    @Autowired
    private H_UploadLikesTableRepository uploadLikesTableRepository;

    public H_UploadLikes saveUploadLikes(H_UploadLikes uploadLikesTable) {
        return uploadLikesTableRepository.save(uploadLikesTable);
    }

    public void deleteUploadLikes(int id) {
        uploadLikesTableRepository.deleteById(id);
    }

    public List<H_UploadLikes> getAllUploadLikes() {
        return uploadLikesTableRepository.findAll();
    }

    public H_UploadLikes getUploadLikesById(int id) {
        return uploadLikesTableRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Upload Likes not found with id: " + id));
    }
}
