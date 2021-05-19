package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @program: an
 * @description:监听器
 * @author: SANJIU HUANG
 * @create: 2021-05-18 10:50
 **/
public class ServletListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletListener 上下文创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletListener 上下文销毁");
    }
}
