package com.dao.impl;

import com.dao.Ilogin;
import org.springframework.stereotype.Repository;

/**
 * @program: an
 * @description:
 * @author: SANJIU HUANG
 * @create: 2021-05-18 09:11
 **/
@Repository
public class loginDao implements Ilogin {
    @Override
    public void login() {
        System.out.println("loginDao-->login");
    }
}
