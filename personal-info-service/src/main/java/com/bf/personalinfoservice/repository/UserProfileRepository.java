package com.bf.personalinfoservice.repository;

import com.bf.personalinfoservice.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserProfileRepository extends MongoRepository<User, String> {

}
