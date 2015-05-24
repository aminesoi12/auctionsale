package com.insat.auctionsale.core.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.insat.auctionsale.common.entity.ProductEntity;

@Repository(value="productEntityRepository")
public interface ProductEntityRepository extends JpaRepository<ProductEntity, Integer> {

	@Query("select p from ProductEntity p where p.endAuctionDate > CURRENT_DATE order by p.endAuctionDate desc")
	public List<ProductEntity> findProductsOnAuction();
	
	@Query("select p from ProductEntity p where p.appUser.login=:userLogin")
	public List<ProductEntity> findUserProducts(@Param("userLogin")String userLogin);
}