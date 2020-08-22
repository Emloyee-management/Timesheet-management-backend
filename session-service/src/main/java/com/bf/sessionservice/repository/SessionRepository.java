package com.bf.sessionservice.repository;

import com.bf.sessionservice.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface SessionRepository extends MongoRepository<User, String> {
    @Query("{ 'username': ?0, 'password': ?1}")
    User findByUsernameAndPassword(String username, String password);
}

