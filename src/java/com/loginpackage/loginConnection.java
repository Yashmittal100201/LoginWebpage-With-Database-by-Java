/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.loginpackage;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class loginConnection extends HttpServlet{
    
private String message;

    public void init() {
        message = "Hello World";
    }

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
//        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
//        out.println("<HTML>" + message + "</HTML>");
        String s1 = req.getParameter("userName");
        String s2 = req.getParameter("Password");
        
        String q = "Select * from login where name = 'Yash'";
//        q = q+s1;
//        q = q+" And Passowd = ";
//        q = q+s2;
        JdbcClass obj = new JdbcClass();
        String str = obj.JdbcMethodLogin(s1,s2,q);
       
        RequestDispatcher dis;
        dis = req.getRequestDispatcher("mainSite.html");
        dis.forward(req,res);
       
        
//        RequestDispatcher dis;
//        dis = (RequestDispatcher) req.getRequestDispatcher("afterLoginClass");
//        dis.forward(req,res);
//        int n1 = Integer.parseInt(s1);
//        int n2 = Integer.parseInt(s2);

//        int sum = n1 + n2;
//        
//        char s1 = 'Y';
//        int s2 = 1255;
//        JdbcClass obj = new JdbcClass();
        
        //    Query  variable
//        String q = ""; 
//        String str = obj.JdbcMethod(s1,s2,q);
          
//        System.out.println("hekllon");
//        int sum = 5;
//        out.println("<html><body>");  
//        out.println("<h1>" + message + "hegyebdhbcdbjbd</h1>");
//        out.println("<h1>" + message + "hegyebdhbcdbjbd</h1>");
//        out.printf("Sum of the %d & %d is: ",n1,n2);
//        out.println(sum);
        
       
//        out.println(str);
            
//        RequestDispatcher dis;
//        dis = req.getRequestDispatcher("new2");
        
        
        out.println("<h1> Welcome to servlet</h1>");  
        out.println("</body></html>"); 
    }

    public void destroy() {
    }
}
