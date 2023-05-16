package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent sce)  { 
    	sce.getServletContext().getAttribute("counter");
    	System.out.println("Servlet Context Destroyed");
    }
    public void contextInitialized(ServletContextEvent sce)  { 
    	sce.getServletContext().getAttribute("counter");
    	System.out.println("Servlet Context Initialized");
    }
	
}
