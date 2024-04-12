package com.springboothibernate.myrepository;

import com.springboothibernate.myentity.B_Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface B_ProfileTableRepository extends JpaRepository<B_Profile, Integer> {
    List<B_Profile> findByBranch(String branch);
    List<B_Profile> findBySemester(String semester);
}
