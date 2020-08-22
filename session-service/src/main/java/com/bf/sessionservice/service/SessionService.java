package com.bf.sessionservice.service;

import com.bf.sessionservice.entity.User;
import com.bf.sessionservice.repository.SessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SessionService {

    @Autowired
    SessionRepository sessionRepository;

    @Resource
    public void setSessionRepository(SessionRepository sr) {
        this.sessionRepository = sr;
    }

    public User findUserByUsernameAndPassowrd(String username, String password) {
        return sessionRepository.findByUsernameAndPassword(username, password);
    }

}
