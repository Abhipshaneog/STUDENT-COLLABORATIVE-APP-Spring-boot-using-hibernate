package com.springboothibernate.myrepository;

import com.springboothibernate.myentity.A_Authentication;
import com.springboothibernate.myentity.A_Authentication.Status;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface A_AuthenticationTableRepository extends JpaRepository<A_Authentication, Integer> {
	A_Authentication findByEmailId(String emailId);

    A_Authentication findByEmailIdAndStatus(String emailId, Status status);

    List<A_Authentication> findByStatus(Status status);

    long countByStatus(Status status);

    @Modifying
    @Transactional
    @Query("UPDATE AuthenticationTable a SET a.status = :status WHERE a.emailId = :emailId")
    int updateStatusByEmailId(@Param("emailId") String emailId, @Param("status") Status status);

    @Modifying
    @Transactional
    void deleteByStatus(Status status);
}
