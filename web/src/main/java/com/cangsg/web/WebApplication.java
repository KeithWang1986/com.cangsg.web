package com.cangsg.web;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@ServletComponentScan(basePackages = { "com.cangsg.web", "com.cangsg.common" })
@ComponentScan(basePackages = { "com.cangsg.web", "com.cangsg.common" })
@EnableCaching
@EnableRabbit
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 3600)
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
}
