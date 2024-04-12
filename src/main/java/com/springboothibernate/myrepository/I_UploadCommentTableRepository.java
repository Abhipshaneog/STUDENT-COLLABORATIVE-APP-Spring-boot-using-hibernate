package com.springboothibernate.myrepository;

import com.springboothibernate.myentity.I_UploadComment;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

public interface I_UploadCommentTableRepository extends JpaRepository<I_UploadComment, Integer> {

    List<I_UploadComment> findByUploadId(int uploadId);

    List<I_UploadComment> findByUserId(int userId);

    List<I_UploadComment> findByUploadIdAndUserId(int uploadId, int userId);

    long countByUploadId(int uploadId);

    long countByUserId(int userId);

    long countByUploadIdAndUserId(int uploadId, int userId);

    @Transactional
    void deleteByUploadId(int uploadId);

    @Transactional
    void deleteByUserId(int userId);

    @Transactional
    void deleteByUploadIdAndUserId(int uploadId, int userId);
}
