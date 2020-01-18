package com.devengers.hacknight6.spider.b2bpayments.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;
import static com.google.common.base.Predicates.or;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
                .apiInfo(apiInfo()).select().paths(postPaths()).build();
    }

    private Predicate<String> postPaths() {
        return or(regex("/v1/adminservice.*"), regex("/v1/adminservice.*"));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Admin Service API")
                .description("Admin Service API is used for fetch the list of products")
                .termsOfServiceUrl("http://localhost:2020/")
                .contact("javafullstackdeveloper75@gmail.com").license("Admin Service License")
                .licenseUrl("javafullstackdeveloper75@gmail.com").version("1.0").build();
    }

}