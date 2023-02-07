package com.example.jakarta.jakartaeerestendpoint;


import com.example.jakarta.jakartaeerestendpoint.beans.HelloBean;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

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