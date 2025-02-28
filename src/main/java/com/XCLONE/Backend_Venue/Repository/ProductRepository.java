package com.XCLONE.Backend_Venue.Repository;

import com.XCLONE.Backend_Venue.Entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {
}
