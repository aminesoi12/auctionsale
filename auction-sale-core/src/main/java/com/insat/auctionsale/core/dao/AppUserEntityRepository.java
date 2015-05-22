package com.insat.auctionsale.core.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insat.auctionsale.common.entity.AppUserEntity;

@Repository(value="appUserEntityRepository")
public interface AppUserEntityRepository extends JpaRepository<AppUserEntity, String> {

	
}