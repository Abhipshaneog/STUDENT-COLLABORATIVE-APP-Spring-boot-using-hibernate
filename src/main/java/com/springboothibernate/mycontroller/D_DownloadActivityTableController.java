
package com.springboothibernate.mycontroller;

import com.springboothibernate.myentity.D_DownloadActivity;
import com.springboothibernate.myservice.D_DownloadActivityTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/download-activity")
public class D_DownloadActivityTableController {

    @Autowired
    private D_DownloadActivityTableService downloadActivityTableService;

    @GetMapping
    public List<D_DownloadActivity> getAllDownloadActivities() {
        return downloadActivityTableService.getAllDownloadActivities();
    }

    @GetMapping("/{id}")
    public D_DownloadActivity getDownloadActivityById(@PathVariable int id) {
        return downloadActivityTableService.getDownloadActivityById(id);
    }

    @PostMapping
    public D_DownloadActivity saveDownloadActivity(@RequestBody D_DownloadActivity downloadActivityTable) {
        return downloadActivityTableService.saveDownloadActivity(downloadActivityTable);
    }

    @DeleteMapping("/{id}")
    public void deleteDownloadActivity(@PathVariable int id) {
        downloadActivityTableService.deleteDownloadActivity(id);
    }
}
