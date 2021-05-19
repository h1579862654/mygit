package com.beans;

/**
 * @program: an
 * @description: 用户
 * @author: SANJIU HUANG
 * @create: 2021-05-17 09:32
 **/
public class User {
    private String name;
    private String pass;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
