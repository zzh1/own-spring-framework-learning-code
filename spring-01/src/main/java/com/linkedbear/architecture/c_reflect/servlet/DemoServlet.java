package com.linkedbear.architecture.c_reflect.servlet;

import com.linkedbear.architecture.c_reflect.service.DemoService;
import com.linkedbear.architecture.c_reflect.service.impl.DemoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo3")
public class DemoServlet extends HttpServlet {


    DemoService demoService=new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
//        response.getWriter().println("DemoServlet1 run ......");
        response.getWriter().println(demoService.findAll().toString());
    }
}
