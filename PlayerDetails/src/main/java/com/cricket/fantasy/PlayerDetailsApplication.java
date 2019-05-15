package com.cricket.fantasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import brave.sampler.Sampler;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({"com.cricket.fantasy"})
public class PlayerDetailsApplication extends SpringBootServletInitializer {
	

	public static void main(String[] args) {
		SpringApplication.run(PlayerDetailsApplication.class, args);
	}
	
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(PlayerDetailsApplication.class);
	}
	

}
