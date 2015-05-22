package com.insat.auctionsale.core.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.insat.auctionsale.common.entity.ProposalEntity;

@Repository(value="proposalEntityRepository")
public interface ProposalEntityRepository extends JpaRepository<ProposalEntity, Integer> {

	
}