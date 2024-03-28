package com.springboothibernate.mycontroller;

import com.springboothibernate.myentity.H_UploadLikes;
import com.springboothibernate.myservice.H_UploadLikesTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/upload-likes")
public class H_UploadLikesTableController {

    @Autowired
    private H_UploadLikesTableService uploadLikesTableService;

    @GetMapping
    public List<H_UploadLikes> getAllUploadLikes() {
        return uploadLikesTableService.getAllUploadLikes();
    }

    @GetMapping("/{id}")
    public H_UploadLikes getUploadLikesById(@PathVariable int id) {
        return uploadLikesTableService.getUploadLikesById(id);
    }

    @PostMapping
    public H_UploadLikes saveUploadLikes(@RequestBody H_UploadLikes uploadLikesTable) {
        return uploadLikesTableService.saveUploadLikes(uploadLikesTable);
    }

    @DeleteMapping("/{id}")
    public void deleteUploadLikes(@PathVariable int id) {
        uploadLikesTableService.deleteUploadLikes(id);
    }
}
