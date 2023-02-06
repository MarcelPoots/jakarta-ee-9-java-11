package com.example.jakarta.jakartaeerestendpoint;

import com.example.jakarta.jakartaeerestendpoint.beans.HelloBean;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;


@Path("/hello-world")
public class HelloResource {

    @Inject
    HelloBean helloBean;

    @GET
    @Produces("text/plain")
    public String hello() {
        return helloBean.sayHello();
    }
}