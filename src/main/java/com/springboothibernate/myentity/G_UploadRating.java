package com.springboothibernate.myentity;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "g_upload_rating_table")
public class G_UploadRating {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "UPLOAD_ID", nullable = false)
    private int uploadId;

    @Column(name = "USER_ID", nullable = false)
    private int userId;

    @Column(name = "RATING", nullable = true)
    private Integer rating;

    @Column(name = "CREATED_DATE", nullable = true, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdDate;

    // Constructors
    public G_UploadRating() {
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUploadId() {
        return uploadId;
    }

    public void setUploadId(int uploadId) {
        this.uploadId = uploadId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }
}
