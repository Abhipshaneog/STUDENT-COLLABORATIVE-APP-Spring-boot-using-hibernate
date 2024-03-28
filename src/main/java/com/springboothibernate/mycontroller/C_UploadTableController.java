package com.springboothibernate.mycontroller;

import com.springboothibernate.myentity.C_Upload;
import com.springboothibernate.myservice.C_UploadTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/uploads")
public class C_UploadTableController {

    @Autowired
    private C_UploadTableService uploadTableService;

    @GetMapping
    public List<C_Upload> getAllUploads() {
        return uploadTableService.getAllUploads();
    }

    @GetMapping("/{id}")
    public C_Upload getUploadById(@PathVariable int id) {
        return uploadTableService.getUploadById(id);
    }

    @PostMapping
    public C_Upload saveUpload(@RequestBody C_Upload uploadTable) {
        return uploadTableService.saveUpload(uploadTable);
    }

    @DeleteMapping("/{id}")
    public void deleteUpload(@PathVariable int id) {
        uploadTableService.deleteUpload(id);
    }
}
