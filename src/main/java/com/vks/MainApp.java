package com.vks;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class MainApp {


    public static void main(String[] args) {
    	System.out.println("STARTING");
        SimpleRouteBuilder routeBuilder = new SimpleRouteBuilder();
        CamelContext ctx = new DefaultCamelContext();
        try {
            ctx.addRoutes(routeBuilder);
            ctx.start();
            while(true) {
            Thread.sleep(100000 * 60 * 1000);
            }
           
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}