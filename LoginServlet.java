package com.demo0;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet{
    protected void doPost(HttpServletRequest req,HttpServletResponse res)
            throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        
        req.getRequestDispatcher("link.html").include(req,res);
        
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        
        if(password.equals("anu02")){
            out.print("You are successfully logged in!");
            out.print("<br>Welcome, "+name);
            
            Cookie ck=new Cookie ("name",name);
            res.addCookie(ck);
        }
        else{
            out.print("Sorry,Username or Password error!");
            req.getRequestDispatcher("login.html").include(req,res);
        }
        out.close();
    }
    
}
