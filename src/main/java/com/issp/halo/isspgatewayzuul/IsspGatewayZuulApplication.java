package com.issp.halo.isspgatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class IsspGatewayZuulApplication {



	public static void main(String[] args) {
		SpringApplication.run(IsspGatewayZuulApplication.class, args);
	}
}
