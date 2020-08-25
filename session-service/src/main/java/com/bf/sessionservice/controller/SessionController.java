package com.bf.sessionservice.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.bf.sessionservice.entity.User;
import com.bf.sessionservice.service.SessionService;
import com.bf.sessionservice.util.JwtUtil;
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
        String token = JwtUtil.generateToken(signingKey, username);
//        System.out.println(token);
//        try {
//            Algorithm algorithm = Algorithm.HMAC256("secret");
//            JWTVerifier verifier = JWT.require(algorithm)
//                    .withIssuer("auth0")
//                    .build(); //Reusable verifier instance
//            DecodedJWT jwt = JWT.decode(token);
//            System.out.println(jwt.getIssuedAt());
//        } catch (JWTVerificationException exception){
//            //Invalid signature/claims
//            System.out.println("invalid");
//        }

        User user = service.findUserByUsernameAndPassowrd(username, password);
        if (user == null) {
            return new User();
        } else {
            user.setToken(token);
            return user;
        }

    }

}
