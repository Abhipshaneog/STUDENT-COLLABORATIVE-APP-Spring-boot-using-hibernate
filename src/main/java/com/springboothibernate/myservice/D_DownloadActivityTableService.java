package com.springboothibernate.myservice;

import com.springboothibernate.myentity.D_DownloadActivity;
import com.springboothibernate.myrepository.D_DownloadActivityTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class D_DownloadActivityTableService {

    @Autowired
    private D_DownloadActivityTableRepository downloadActivityTableRepository;

    public D_DownloadActivity saveDownloadActivity(D_DownloadActivity downloadActivityTable) {
        return downloadActivityTableRepository.save(downloadActivityTable);
    }

    public void deleteDownloadActivity(int id) {
        downloadActivityTableRepository.deleteById(id);
    }

    public List<D_DownloadActivity> getAllDownloadActivities() {
        return downloadActivityTableRepository.findAll();
    }

    public D_DownloadActivity getDownloadActivityById(int id) {
        return downloadActivityTableRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Download Activity not found with id: " + id));
    }
}
