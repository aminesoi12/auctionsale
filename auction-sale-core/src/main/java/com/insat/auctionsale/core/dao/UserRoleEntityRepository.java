package com.insat.auctionsale.core.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insat.auctionsale.common.entity.UserRoleEntity;

@Repository(value="userRoleEntityRepository")
public interface UserRoleEntityRepository extends JpaRepository<UserRoleEntity, Integer> {

	
}