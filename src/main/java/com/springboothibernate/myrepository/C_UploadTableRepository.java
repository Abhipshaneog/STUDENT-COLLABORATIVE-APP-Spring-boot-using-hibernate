package com.springboothibernate.myrepository;

import com.springboothibernate.myentity.C_Upload;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface C_UploadTableRepository extends JpaRepository<C_Upload, Integer> {

    List<C_Upload> findByBranchAndSemester(String branch, String semester);

    List<C_Upload> findByTypesOfDocuments(String typesOfDocuments);

    List<C_Upload> findByUploaderId(int uploaderId);

    List<C_Upload> findByBranchAndSemesterAndUploaderId(String branch, String semester, int uploaderId);

    @Modifying
    @Transactional
    @Query("UPDATE UploadTable u SET u.downloadEnable = :downloadEnable WHERE u.id = :uploadId")
    int updateDownloadEnableById(@Param("uploadId") int uploadId, @Param("downloadEnable") boolean downloadEnable);

    @Modifying
    @Transactional
    @Query("UPDATE UploadTable u SET u.commentEnable = :commentEnable WHERE u.id = :uploadId")
    int updateCommentEnableById(@Param("uploadId") int uploadId, @Param("commentEnable") boolean commentEnable);

}
