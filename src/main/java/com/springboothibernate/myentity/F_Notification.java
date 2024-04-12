package com.springboothibernate.myentity;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "f_notification_table")
public class F_Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "USER_ID", nullable = false)
    private int userId;

    @Enumerated(EnumType.STRING)
    @Column(name = "PURPOSE", nullable = false, columnDefinition = "ENUM('UPLOAD','DOWNLOAD')")
    private Purpose purpose;

    @Column(name = "CONTENT", length = 2000)
    private String content;

    @Column(name = "CREATED_DATE", nullable = true, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdDate;

    // Constructors
    public F_Notification() {
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    // Enum
    public enum Purpose {
        UPLOAD, DOWNLOAD
    }
}
