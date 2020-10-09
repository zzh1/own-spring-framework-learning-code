package com.linkedbear.architecture.d_properties.servlet;

import com.linkedbear.architecture.d_properties.service.DemoService;
import com.linkedbear.architecture.d_properties.service.impl.DemoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo4")
public class DemoServlet extends HttpServlet {


    DemoService demoService=new DemoServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
//        response.getWriter().println("DemoServlet1 run ......");
        response.getWriter().println(demoService.findAll().toString());
    }
}
