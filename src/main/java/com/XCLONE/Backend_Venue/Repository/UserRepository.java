package com.XCLONE.Backend_Venue.Repository;

import com.XCLONE.Backend_Venue.Entity.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<Users, ObjectId> {
    Users findByUserName(String username);
    void deleteByUserName(String username);
}
