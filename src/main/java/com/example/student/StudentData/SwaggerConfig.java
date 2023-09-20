package com.example.student.StudentData;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.student"))
                .paths(PathSelectors.any())
                .build().apiInfo(metaData());
    }
    private ApiInfo metaData(){
        return new ApiInfoBuilder()
                .title("Student details- Swagger Description")
                .description("/ Swagger configuration for the Student Application / ")
                .version("2.7.0")
                .license("Apache 2.0")
                .licenseUrl(" https://www.apache.org/licenses/LICENSE-2.0")
                .contact(new Contact("Student", "https://github.com/ushareddyr/student_api", "ushareddyr84@gmail.com"))
                .build();
    }


}
