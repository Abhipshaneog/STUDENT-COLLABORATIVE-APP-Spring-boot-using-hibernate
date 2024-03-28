
package com.springboothibernate.myservice;

import com.springboothibernate.myentity.I_UploadComment;
import com.springboothibernate.myrepository.I_UploadCommentTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class I_UploadCommentTableService {

    @Autowired
    private I_UploadCommentTableRepository uploadCommentTableRepository;

    public I_UploadComment saveUploadComment(I_UploadComment uploadCommentTable) {
        return uploadCommentTableRepository.save(uploadCommentTable);
    }

    public void deleteUploadComment(int id) {
        uploadCommentTableRepository.deleteById(id);
    }

    public List<I_UploadComment> getAllUploadComments() {
        return uploadCommentTableRepository.findAll();
    }

    public I_UploadComment getUploadCommentById(int id) {
        return uploadCommentTableRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Upload Comment not found with id: " + id));
    }
}
