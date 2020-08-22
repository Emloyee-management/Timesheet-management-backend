package com.bf.sessionservice.controller;

import com.bf.sessionservice.entity.User;
import com.bf.sessionservice.service.SessionService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class SessionController {
    private static final String jwtTokenCookieName = "JWT-TOKEN";
    private static final String signingKey = "signingKey";

    @Resource
    private SessionService service;

    @Resource
    private HttpServletRequest request;

    @RequestMapping("/login/{username}/{password}")
    public @ResponseBody
    User login(@PathVariable(value = "username") String username, @PathVariable(value = "password") String password) {
        User user = service.findUserByUsernameAndPassowrd(username, password);
        return user;

    }

}
