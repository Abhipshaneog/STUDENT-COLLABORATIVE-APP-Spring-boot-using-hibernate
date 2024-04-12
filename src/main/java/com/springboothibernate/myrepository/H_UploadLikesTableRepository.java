package com.springboothibernate.myrepository;

import com.springboothibernate.myentity.H_UploadLikes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

public interface H_UploadLikesTableRepository extends JpaRepository<H_UploadLikes, Integer> {

    List<H_UploadLikes> findByUploadId(int uploadId);

    List<H_UploadLikes> findByUserId(int userId);

    @Modifying
    @Transactional
    @Query("DELETE FROM UploadLikesTable ul WHERE ul.uploadId = :uploadId AND ul.userId = :userId")
    		 void deleteByUploadIdAndUserId(@Param("uploadId") int uploadId, @Param("userId") int userId);
}
