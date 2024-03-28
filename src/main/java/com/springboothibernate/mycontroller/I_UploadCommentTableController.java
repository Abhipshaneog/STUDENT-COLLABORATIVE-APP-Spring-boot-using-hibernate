package com.springboothibernate.mycontroller;

import com.springboothibernate.myentity.I_UploadComment;
import com.springboothibernate.myservice.I_UploadCommentTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/upload-comments")
public class I_UploadCommentTableController {

    @Autowired
    private I_UploadCommentTableService uploadCommentTableService;

    @GetMapping
    public List<I_UploadComment> getAllUploadComments() {
        return uploadCommentTableService.getAllUploadComments();
    }

    @GetMapping("/{id}")
    public I_UploadComment getUploadCommentById(@PathVariable int id) {
        return uploadCommentTableService.getUploadCommentById(id);
    }

    @PostMapping
    public I_UploadComment saveUploadComment(@RequestBody I_UploadComment uploadCommentTable) {
        return uploadCommentTableService.saveUploadComment(uploadCommentTable);
    }

    @DeleteMapping("/{id}")
    public void deleteUploadComment(@PathVariable int id) {
        uploadCommentTableService.deleteUploadComment(id);
    }
}
