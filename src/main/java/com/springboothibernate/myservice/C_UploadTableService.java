package com.springboothibernate.myservice;

import com.springboothibernate.myentity.C_Upload;
import com.springboothibernate.myrepository.C_UploadTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class C_UploadTableService {

    @Autowired
    private C_UploadTableRepository uploadTableRepository;

    public C_Upload saveUpload(C_Upload uploadTable) {
        return uploadTableRepository.save(uploadTable);
    }

    public void deleteUpload(int id) {
        uploadTableRepository.deleteById(id);
    }

    public List<C_Upload> getAllUploads() {
        return uploadTableRepository.findAll();
    }

    public C_Upload getUploadById(int id) {
        return uploadTableRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Upload not found with id: " + id));
    }
}
