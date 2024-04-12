package com.springboothibernate.myrepository;

import com.springboothibernate.myentity.J_Role;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface J_RoleTableRepository extends JpaRepository<J_Role, Integer> {

	J_Role findByRoleName(J_Role.RoleName roleName);

    List<J_Role> findByDescriptionContaining(String keyword);

    @Query("SELECT r FROM RoleTable r WHERE r.description LIKE %:keyword%")
    List<J_Role> findByDescriptionLike(@Param("keyword") String keyword);
}
