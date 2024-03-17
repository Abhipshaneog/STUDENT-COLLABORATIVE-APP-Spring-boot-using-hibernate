package com.springboothibernate.myentity;

import java.time.LocalDateTime;

import javax.persistence.*;


@Entity
@Table(name = "a_authentication_table")
public class A_Authentication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "EMAIL_ID", unique = true, nullable = false)
    private String emailId;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS", nullable = false, columnDefinition = "ENUM('ACTIVE','INACTIVE','PENDING')")
    private Status status = Status.PENDING;

    @Column(name = "CREATED_DATE", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", nullable = true)
    private LocalDateTime createdDate;

    // Constructors
    public A_Authentication() {
    }

    public A_Authentication(String emailId, String password, Status status, LocalDateTime createdDate) {
        this.emailId = emailId;
        this.password = password;
        this.status = status;
        this.createdDate = createdDate;
    }
    
    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    
    
    // Enum for Status
    public enum Status {
        ACTIVE, INACTIVE, PENDING
    }
}
