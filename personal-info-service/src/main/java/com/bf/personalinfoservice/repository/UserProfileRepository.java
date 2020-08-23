package com.bf.personalinfoservice.repository;

import com.bf.personalinfoservice.entity.UserProfile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProfileRepository extends MongoRepository<UserProfile, String> {

    UserProfile findById(String id);


}
