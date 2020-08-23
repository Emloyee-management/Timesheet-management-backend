package com.bf.personalinfoservice.service;


import com.bf.personalinfoservice.entity.UserProfile;
import com.bf.personalinfoservice.repository.UserProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;

@Service
public class UserProfileService {

    @Autowired
    UserProfileRepository userProfileRepository;

    @Resource
    public void setUserProfileRepository(UserProfileRepository upr) {
        this.userProfileRepository = upr;
    }

    public UserProfile update(UserProfile newUserProfile) {
//        System.out.println(newUserProfile.getId());
        UserProfile oldUserProfile = userProfileRepository.findByUsername(newUserProfile.getUsername());
        oldUserProfile.setPhone(newUserProfile.getPhone());
        oldUserProfile.setEmail(newUserProfile.getEmail());
        oldUserProfile.setAddress(newUserProfile.getAddress());
        oldUserProfile.setEmergency1Name(newUserProfile.getEmergency1Name());
        oldUserProfile.setEmergency1Phone(newUserProfile.getEmergency1Phone());
        oldUserProfile.setEmergency2Name(newUserProfile.getEmergency2Name());
        oldUserProfile.setEmergency1Phone(newUserProfile.getEmergency2Phone());
        return oldUserProfile;

    }
}
