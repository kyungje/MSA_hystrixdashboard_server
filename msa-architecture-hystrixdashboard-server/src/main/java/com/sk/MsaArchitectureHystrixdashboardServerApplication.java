package com.sk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@EnableEurekaClient
@SpringBootApplication
public class MsaArchitectureHystrixdashboardServerApplication {

//	http://localhost:10004/turbine.stream
	public static void main(String[] args) {
		SpringApplication.run(MsaArchitectureHystrixdashboardServerApplication.class, args);
	}

}
