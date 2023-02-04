package com.example.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableWebMvc
@SpringBootApplication
@EnableSwagger2
public class StudentMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentMicroserviceApplication.class, args);
	}

	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.enable(true)
				.apiInfo(new ApiInfoBuilder()
						.title("Swagger Super")
						.description("Swagger Description details")
						.version("1.0").build())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example"))
				.paths(PathSelectors.any()).build();
	}

}
