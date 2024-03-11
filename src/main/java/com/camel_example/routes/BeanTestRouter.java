package com.camel_example.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class BeanTestRouter extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub
		from("timer://bean-test-time?period=5000")
		.bean("team", "inter")
		.to("log:bean-test-time");
	}

}

@Component
class Team {
	public String juventus() {
		return "Welcome to Juventus!!!";
	}
	public String inter() {
		return "Welcome to shit!!!";
	}
}