package com.TFI.ClinicaOdontologica;
import org.apache.log4j.*;

import org.apache.log4j.PropertyConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ClinicaOdontologicaApplication {

	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");

		SpringApplication.run(ClinicaOdontologicaApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/*").allowedOrigins("*").allowedMethods("*").allowedHeaders("*");
			}
		};
	}

}
