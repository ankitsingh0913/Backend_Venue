package com.XCLONE.Backend_Venue.Repository;

import com.XCLONE.Backend_Venue.Entity.Products;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Products, ObjectId> {

}
