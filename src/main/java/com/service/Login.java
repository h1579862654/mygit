package com.service;

import com.alibaba.fastjson.JSONObject;
import com.beans.User;
import com.dao.Ilogin;
import com.dao.impl.loginDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServlet;

/**
 * @program: an
 * @description:
 * @author: SANJIU HUANG
 * @create: 2021-05-17 09:35
 **/
@Controller
public class Login {
    @Autowired
    loginDao ig;
    @RequestMapping(value = "lg",method = {RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public String Login(User u){
        ig.login();
        System.out.println("666"+u);
        JSONObject j = new JSONObject();
        j.put("k1","v1");
        j.put("k2","v2");
        return j.toString();
    }


}
