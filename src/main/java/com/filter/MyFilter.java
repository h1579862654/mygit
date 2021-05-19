package com.filter;


import javax.servlet.*;
import java.io.IOException;

/**
 * @program: an
 * @description:过滤器
 * @author: SANJIU HUANG
 * @create: 2021-05-18 09:52
 **/
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("MyFilter -->init方法");
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter -->doFilter方法");
        filterChain.doFilter(req,resp);
    }

    @Override
    public void destroy() {
        System.out.println("MyFilter --> destroy方法");
    }
}
