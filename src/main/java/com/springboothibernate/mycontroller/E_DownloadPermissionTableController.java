package com.springboothibernate.mycontroller;

import com.springboothibernate.myentity.E_DownloadPermission;
import com.springboothibernate.myservice.E_DownloadPermissionTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/download-permissions")
public class E_DownloadPermissionTableController {

    @Autowired
    private E_DownloadPermissionTableService downloadPermissionTableService;

    @GetMapping
    public List<E_DownloadPermission> getAllDownloadPermissions() {
        return downloadPermissionTableService.getAllDownloadPermissions();
    }

    @GetMapping("/{id}")
    public E_DownloadPermission getDownloadPermissionById(@PathVariable int id) {
        return downloadPermissionTableService.getDownloadPermissionById(id);
    }

    @PostMapping
    public E_DownloadPermission saveDownloadPermission(@RequestBody E_DownloadPermission downloadPermissionTable) {
        return downloadPermissionTableService.saveDownloadPermission(downloadPermissionTable);
    }

    @DeleteMapping("/{id}")
    public void deleteDownloadPermission(@PathVariable int id) {
        downloadPermissionTableService.deleteDownloadPermission(id);
    }
}
