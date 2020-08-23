package com.bf.personalinfoservice.controller;


import com.bf.personalinfoservice.entity.UserProfile;
import com.bf.personalinfoservice.repository.UserProfileRepository;
import com.bf.personalinfoservice.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
public class UserProfileController {

    @Autowired
    UserProfileRepository userProfileRepository;

    @Resource
    private UserProfileService service;


    @RequestMapping("/userprofile")
    public UserProfile updateUserProfile(@RequestBody UserProfile user){
        return service.update(user);
    }

}
