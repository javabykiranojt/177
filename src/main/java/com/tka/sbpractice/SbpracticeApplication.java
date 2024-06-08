package com.tka.sbpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.annotation.EnableAsync;

import com.tka.client.A;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")
@EnableAsync
@EnableAspectJAutoProxy
public class SbpracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbpracticeApplication.class, args);
	}

	@Bean
	@Scope("singleton")
	A getObjectA() {
		System.err.println("getObjectA inside ");
		A aa = new A();
		return aa;
	}

}
