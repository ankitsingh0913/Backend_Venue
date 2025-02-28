package com.XCLONE.Backend_Venue.Repository;

import com.XCLONE.Backend_Venue.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    Users findByUserName(String username);
    void deleteByUserName(String username);
}
