package com.springboothibernate.myentity;


import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "b_profile_table")
public class B_Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "USER_ID", nullable = false)
    private int userId;

    @Enumerated(EnumType.STRING)
    @Column(name = "BRANCH", nullable = false, columnDefinition = "ENUM('COMPUTER SCIENCE','CIVIL','MECHANICAL','ELECTRICAL','INSTRUMENTATION')")
    private Branch branch;

    @Enumerated(EnumType.STRING)
    @Column(name = "SEMESTER", nullable = false, columnDefinition = "ENUM('1','2','3','4','5','6','7','8')")
    private Semester semester;

    @Column(name = "PHONE_NO", nullable = false, length = 45)
    private String phoneNo;

    @Column(name = "ROLL_NO", nullable = false, length = 45)
    private String rollNo;

    @Column(name = "ABOUT", length = 5000)
    private String about;

    @Column(name = "HOBBIES", length = 2000)
    private String hobbies;

    @Column(name = "INTEREST_FIELDS", length = 500)
    private String interestFields;

    @Column(name = "GITHUB_LINK", nullable = false, length = 255)
    private String githubLink;

    @Column(name = "LINKEDIN_LINK", nullable = false, length = 255)
    private String linkedinLink;

    @Column(name = "USER_IMAGE_URL", nullable = false, length = 500)
    private String userImageUrl;

    @Column(name = "CREATED_DATE", nullable = true, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdDate;

    // Constructors
    public B_Profile() {
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

    public Branch getBranch() {
        return branch;
    }

    public void setBranch(Branch branch) {
        this.branch = branch;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getInterestFields() {
        return interestFields;
    }

    public void setInterestFields(String interestFields) {
        this.interestFields = interestFields;
    }

    public String getGithubLink() {
        return githubLink;
    }

    public void setGithubLink(String githubLink) {
        this.githubLink = githubLink;
    }

    public String getLinkedinLink() {
        return linkedinLink;
    }

    public void setLinkedinLink(String linkedinLink) {
        this.linkedinLink = linkedinLink;
    }

    public String getUserImageUrl() {
        return userImageUrl;
    }

    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    // Enums
    public enum Branch {
        COMPUTER_SCIENCE, CIVIL, MECHANICAL, ELECTRICAL, INSTRUMENTATION
    }

    public enum Semester {
        S1, S2, S3, S4, S5, S6, S7, S8
    }
}
