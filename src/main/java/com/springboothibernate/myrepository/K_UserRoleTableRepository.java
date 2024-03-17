package com.springboothibernate.myrepository;

import com.springboothibernate.myentity.K_UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface K_UserRoleTableRepository extends JpaRepository<K_UserRole, Integer> {

    List<K_UserRole> findByUserId(int userId);

    List<K_UserRole> findByRoleId(int roleId);

    void deleteByUserId(int userId);

    void deleteByRoleId(int roleId);
}
