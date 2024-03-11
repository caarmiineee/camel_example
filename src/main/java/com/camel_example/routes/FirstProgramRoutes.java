package com.camel_example.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class FirstProgramRoutes extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("timer://test?period=5000")
		.setBody(simple("Hello World!!"))
		.to("log:test");
	}

}
