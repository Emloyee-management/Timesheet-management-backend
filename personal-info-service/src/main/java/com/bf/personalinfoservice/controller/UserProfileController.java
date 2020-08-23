package com.bf.personalinfoservice.controller;


import com.bf.personalinfoservice.entity.User;
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
    public User updateUserProfile(@RequestBody User user){
        return service.update(user);
    }

}
