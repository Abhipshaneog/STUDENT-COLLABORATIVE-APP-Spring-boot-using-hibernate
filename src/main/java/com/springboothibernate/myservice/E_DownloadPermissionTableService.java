package com.springboothibernate.myservice;

import com.springboothibernate.myentity.E_DownloadPermission;
import com.springboothibernate.myrepository.E_DownloadPermissionTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class E_DownloadPermissionTableService {

    @Autowired
    private E_DownloadPermissionTableRepository downloadPermissionTableRepository;

    public E_DownloadPermission saveDownloadPermission(E_DownloadPermission downloadPermissionTable) {
        return downloadPermissionTableRepository.save(downloadPermissionTable);
    }

    public void deleteDownloadPermission(int id) {
        downloadPermissionTableRepository.deleteById(id);
    }

    public List<E_DownloadPermission> getAllDownloadPermissions() {
        return downloadPermissionTableRepository.findAll();
    }

    public E_DownloadPermission getDownloadPermissionById(int id) {
        return downloadPermissionTableRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Download Permission not found with id: " + id));
    }
}
