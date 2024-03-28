package com.springboothibernate.myservice;

import com.springboothibernate.myentity.G_UploadRating;
import com.springboothibernate.myrepository.G_UploadRatingTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class G_UploadRatingTableService {

    @Autowired
    private G_UploadRatingTableRepository uploadRatingTableRepository;

    public G_UploadRating saveUploadRating(G_UploadRating uploadRatingTable) {
        return uploadRatingTableRepository.save(uploadRatingTable);
    }

    public void deleteUploadRating(int id) {
        uploadRatingTableRepository.deleteById(id);
    }

    public List<G_UploadRating> getAllUploadRatings() {
        return uploadRatingTableRepository.findAll();
    }

    public G_UploadRating getUploadRatingById(int id) {
        return uploadRatingTableRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Upload Rating not found with id: " + id));
    }
}
