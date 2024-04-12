package com.springboothibernate.myentity;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "c_upload_table")
public class C_Upload {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "UPLOADER_ID", nullable = false)
    private int uploaderId;

    @Column(name = "TOPIC", nullable = false, columnDefinition = "TEXT")
    private String topic;

    @Enumerated(EnumType.STRING)
    @Column(name = "BRANCH", nullable = false, columnDefinition = "ENUM('COMPUTER SCIENCE','CIVIL','MECHANICAL','ELECTRICAL','INSTRUMENTATION')")
    private Branch branch;

    @Enumerated(EnumType.STRING)
    @Column(name = "SEMESTER", nullable = false, columnDefinition = "ENUM('1','2','3','4','5','6','7','8')")
    private Semester semester;

    @Enumerated(EnumType.STRING)
    @Column(name = "TYPES_OF_DOCUMENTS", nullable = false, columnDefinition = "ENUM('NOTES','RESEARCH PAPER','PROJECT FILES','PYQs')")
    private DocumentType documentType;

    @Column(name = "TAGS", length = 5000)
    private String tags;

    @Column(name = "FILES", nullable = false, length = 5000)
    private String files;

    @Column(name = "DOWNLOAD_ENABLE", nullable = false)
    private boolean downloadEnable;

    @Column(name = "COMMENT_ENABLE", nullable = true)
    private boolean commentEnable;

    @Column(name = "PARENT_UPLOAD_ID", nullable = true)
    private Integer parentUploadId;

    @Column(name = "CREATED_DATE", nullable = true, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdDate;

    // Constructors
    public C_Upload() {
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUploaderId() {
        return uploaderId;
    }

    public void setUploaderId(int uploaderId) {
        this.uploaderId = uploaderId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
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

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }

    public boolean isDownloadEnable() {
        return downloadEnable;
    }

    public void setDownloadEnable(boolean downloadEnable) {
        this.downloadEnable = downloadEnable;
    }

    public boolean isCommentEnable() {
        return commentEnable;
    }

    public void setCommentEnable(boolean commentEnable) {
        this.commentEnable = commentEnable;
    }

    public Integer getParentUploadId() {
        return parentUploadId;
    }

    public void setParentUploadId(Integer parentUploadId) {
        this.parentUploadId = parentUploadId;
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

    public enum DocumentType {
        NOTES, RESEARCH_PAPER, PROJECT_FILES, PYQS
    }
}
