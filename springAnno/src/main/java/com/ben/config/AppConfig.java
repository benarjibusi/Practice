package com.ben.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.ben.model.Student;

@Configuration
@ComponentScan("com.ben")
public class AppConfig {
	@Bean
public Student student() {
	
	student().setsId(12);
	student().setsName("Ben");
	return student();
	
}
	

}
