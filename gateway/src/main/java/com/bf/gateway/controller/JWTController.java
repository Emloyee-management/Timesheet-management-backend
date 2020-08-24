package com.bf.gateway.controller;

import com.bf.gateway.util.JWTUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: Yang Yuan
 * @Time: 2020/8/24
 */
@RestController
public class JWTController {
    @RequestMapping("/validate")
    boolean validJWT(@RequestParam("token") String token)
    {
        if(JWTUtil.isValid(token))
            return true;
        else
            return false;
    }

}
