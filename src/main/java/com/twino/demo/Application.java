package com.twino.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
//
//    @Bean
//    public TestRestTemplate testRestTemplate(
//            ObjectProvider<RestTemplateBuilder> builderProvider,
//            Environment environment) {
//        RestTemplateBuilder builder = builderProvider.getIfAvailable();
//        TestRestTemplate template = builder == null ? new TestRestTemplate()
//                : new TestRestTemplate(builder.build());
//        template.setUriTemplateHandler(new LocalHostUriTemplateHandler(environment));
//        return template;
//    }
}
