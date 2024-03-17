package com.springboothibernate.myrepository;

import com.springboothibernate.myentity.E_DownloadPermission;
import com.springboothibernate.myentity.E_DownloadPermission.Status;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface E_DownloadPermissionTableRepository extends JpaRepository<E_DownloadPermission, Integer> {

    List<E_DownloadPermission> findByDocumentIdAndStatus(int documentId, Status status);

    List<E_DownloadPermission> findByUploaderIdAndStatus(int uploaderId, Status status);

    List<E_DownloadPermission> findByRequestIdAndStatus(int requestId, Status status);

    @Modifying
    @Transactional
    @Query("UPDATE DownloadPermissionTable d SET d.status = :status WHERE d.documentId = :documentId AND d.uploaderId = :uploaderId")
    int updateStatusByDocumentIdAndUploaderId(@Param("documentId") int documentId, @Param("uploaderId") int uploaderId, @Param("status") Status status);

    @Modifying
    @Transactional
    void deleteByDocumentIdAndUploaderId(int documentId, int uploaderId);

    @Modifying
    @Transactional
    void deleteByRequestIdAndUploaderId(int requestId, int uploaderId);
}
