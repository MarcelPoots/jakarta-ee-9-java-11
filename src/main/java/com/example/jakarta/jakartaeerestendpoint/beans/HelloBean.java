package com.example.jakarta.jakartaeerestendpoint.beans;



import jakarta.ejb.Stateless;

import java.util.Date;

@Stateless
public class HelloBean {

    public String sayHello() {
        return "Hello from " + this.getClass().getCanonicalName() + " at " + new Date();
    }
}
