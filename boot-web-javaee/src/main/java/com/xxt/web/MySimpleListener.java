package com.xxt.web;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MySimpleListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("starting.........................");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("closing..........................");
    }
}
