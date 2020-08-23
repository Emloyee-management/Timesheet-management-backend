package com.bf.personalinfoservice.service;


import com.bf.personalinfoservice.entity.User;
import com.bf.personalinfoservice.repository.UserProfileRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserProfileService {

    @Autowired
    UserProfileRepository userProfileRepository;

    @Resource
    public void setUserProfileRepository(UserProfileRepository upr) {
        this.userProfileRepository = upr;
    }

    public User update(User newUser) {

        return userProfileRepository.save(newUser);

    }
}
