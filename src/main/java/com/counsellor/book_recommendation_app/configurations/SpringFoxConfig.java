package com.counsellor.book_recommendation_app.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
@EnableJpaAuditing
public class SpringFoxConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com/counsellor/book_recommendation_app/controllers"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "HiCounsellor Project",
                "API For Book Review Application",
                "1.0",
                "https://www.termsofservice",
                new Contact("Ojo Victor", "linkedin.com/osamudiamenojo", "victorojo007@gmail.com"),
                "License", "github.com/osamudiamenojo/", Collections.emptyList());
    }


}
