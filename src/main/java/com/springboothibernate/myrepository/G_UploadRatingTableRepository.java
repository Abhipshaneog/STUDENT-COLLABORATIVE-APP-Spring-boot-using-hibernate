package com.springboothibernate.myrepository;

import com.springboothibernate.myentity.G_UploadRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface G_UploadRatingTableRepository extends JpaRepository<G_UploadRating, Integer> {

    // Custom query to calculate average rating for a specific upload
    @Query("SELECT AVG(ur.rating) FROM UploadRatingTable ur WHERE ur.uploadId = :uploadId")
    Double findAverageRatingByUploadId(@Param("uploadId") int uploadId);

    // Custom query to count total ratings for a specific upload
    @Query("SELECT COUNT(ur.rating) FROM UploadRatingTable ur WHERE ur.uploadId = :uploadId")
    Long countRatingsByUploadId(@Param("uploadId") int uploadId);

    // Custom query to find total rating by user for a specific upload
    Long countByUserIdAndUploadId(int userId, int uploadId);
}
