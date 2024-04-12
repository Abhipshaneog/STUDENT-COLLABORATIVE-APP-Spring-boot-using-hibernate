package com.springboothibernate.myrepository;

import com.springboothibernate.myentity.D_DownloadActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface D_DownloadActivityTableRepository extends JpaRepository<D_DownloadActivity, Integer> {

    List<D_DownloadActivity> findByUserId(int userId);

    List<D_DownloadActivity> findByDocumentId(int documentId);

    List<D_DownloadActivity> findByUserIdAndDocumentId(int userId, int documentId);

    
}
