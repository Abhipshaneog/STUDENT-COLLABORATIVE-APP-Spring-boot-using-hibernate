package com.springboothibernate.myrepository;

import com.springboothibernate.myentity.F_Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface F_NotificationTableRepository extends JpaRepository<F_Notification, Integer> {

    List<F_Notification> findByUserId(int userId);

    List<F_Notification> findByPurposeAndUserId(String purpose, int userId);
}
