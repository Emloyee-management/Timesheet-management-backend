package com.bf.gateway.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:
 * @author: Yang Yuan
 * @Time: 2020/8/23
 */
public class JWTUtil {

    static SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");//2016-08-10 20:40

    public static boolean isValid(String token) {
    try {
            Algorithm algorithm = Algorithm.HMAC256("secret");
            JWTVerifier verifier = JWT.require(algorithm)
                    .withIssuer("auth0")
                    .build(); //Reusable verifier instance
//        verifier.verify(token);
        DecodedJWT jwt = JWT.decode(token);
            Date issueAt = jwt.getIssuedAt();
            System.out.println(issueAt);
        String fromDate = simpleFormat.format(issueAt);
        String toDate = simpleFormat.format(new Date());
        long from = simpleFormat.parse(fromDate).getTime();
        long to = simpleFormat.parse(toDate).getTime();
        int minutes = (int) ((to - from)/(1000 * 60));
        System.out.println(minutes);
        if(minutes > 30)
            return false;
        } catch (JWTVerificationException | ParseException exception){
            //Invalid signature/claims
//            System.out.println("invalid");
            return false;
        }

    return true;
    }
}
