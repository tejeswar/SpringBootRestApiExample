package com.websystique.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//https://github.com/paulc4/mvc-exceptions

//@SpringBootApplication(scanBasePackages={"com.websystique.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
@SpringBootApplication
public class SpringBootRestApiApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApiApp.class, args);
	}
}
/*
https://spring.io/blog/2013/11/01/exception-handling-in-spring-mvc


What to Use When?

//https://www.youtube.com/watch?v=1jV338r0MDI
 * 
 * https://github.com/paulc4/mvc-exceptions   = official site

*/
