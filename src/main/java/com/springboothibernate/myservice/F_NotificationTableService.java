package com.springboothibernate.myservice;

import com.springboothibernate.myentity.F_Notification;
import com.springboothibernate.myrepository.F_NotificationTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class F_NotificationTableService {

    @Autowired
    private F_NotificationTableRepository notificationTableRepository;

    public F_Notification saveNotification(F_Notification notificationTable) {
        return notificationTableRepository.save(notificationTable);
    }

    public void deleteNotification(int id) {
        notificationTableRepository.deleteById(id);
    }

    public List<F_Notification> getAllNotifications() {
        return notificationTableRepository.findAll();
    }

    public F_Notification getNotificationById(int id) {
        return notificationTableRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Notification not found with id: " + id));
    }
}
