package com.sujithtom.springconfigurationpropertiesexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringConfigurationPropertiesExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigurationPropertiesExampleApplication.class, args);
	}

}
