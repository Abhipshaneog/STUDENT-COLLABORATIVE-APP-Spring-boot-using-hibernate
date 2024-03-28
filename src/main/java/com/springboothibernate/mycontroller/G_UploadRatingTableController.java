package com.springboothibernate.mycontroller;

import com.springboothibernate.myentity.G_UploadRating;
import com.springboothibernate.myservice.G_UploadRatingTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/upload-ratings")
public class G_UploadRatingTableController {

    @Autowired
    private G_UploadRatingTableService uploadRatingTableService;

    @GetMapping
    public List<G_UploadRating> getAllUploadRatings() {
        return uploadRatingTableService.getAllUploadRatings();
    }

    @GetMapping("/{id}")
    public G_UploadRating getUploadRatingById(@PathVariable int id) {
        return uploadRatingTableService.getUploadRatingById(id);
    }

    @PostMapping
    public G_UploadRating saveUploadRating(@RequestBody G_UploadRating uploadRatingTable) {
        return uploadRatingTableService.saveUploadRating(uploadRatingTable);
    }

    @DeleteMapping("/{id}")
    public void deleteUploadRating(@PathVariable int id) {
        uploadRatingTableService.deleteUploadRating(id);
    }
}
