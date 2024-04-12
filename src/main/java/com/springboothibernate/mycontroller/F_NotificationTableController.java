package com.springboothibernate.mycontroller;

import com.springboothibernate.myentity.F_Notification;
import com.springboothibernate.myservice.F_NotificationTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/notifications")
public class F_NotificationTableController {

    @Autowired
    private F_NotificationTableService notificationTableService;

    @GetMapping
    public List<F_Notification> getAllNotifications() {
        return notificationTableService.getAllNotifications();
    }

    @GetMapping("/{id}")
    public F_Notification getNotificationById(@PathVariable int id) {
        return notificationTableService.getNotificationById(id);
    }

    @PostMapping
    public F_Notification saveNotification(@RequestBody F_Notification notificationTable) {
        return notificationTableService.saveNotification(notificationTable);
    }

    @DeleteMapping("/{id}")
    public void deleteNotification(@PathVariable int id) {
        notificationTableService.deleteNotification(id);
    }
}
