package com.example.servlets;
 
import java.io.IOException; 
import javax.servlet.ServletException; 
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;
/**
 * A classe de implementa��o de servlet para o Servlet: HelloServlet
 *
 */
 public class HelloServlet extends javax.servlet.http.HttpServlet
     implements javax.servlet.Servlet {
    /* (non-Java-doc) 
     * @see javax.servlet.http.HttpServlet#HttpServlet()    
                       */ 
    public HelloServlet() {
        super(); 
    }  
    /* (non-Java-doc) 
     * @see javax.servlet.http.HttpServlet#doGet(HttpServletRequest request, 
         HttpServletResponse response) 
     */ 
    protected void doGet(HttpServletRequest request,  HttpServletResponse response) 
        throws ServletException, IOException { 
    response.getWriter().write("Hello, world!");
    } 
    /* (non-Java-doc) 
     * @see javax.servlet.http.HttpServlet#doPost(HttpServletRequest request,   
                              HttpServletResponse response) 
     */ 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
                          throws ServletException, IOException { 
        // Stub de m�todo TODO Auto-gerado  
                      }
}