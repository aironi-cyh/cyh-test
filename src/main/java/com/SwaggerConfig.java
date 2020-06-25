package com;

import com.cyh.entity.common.Swagger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    /**
     * 以下参考百度Spring boot整合 security
     * @author aironi_cyh
     * @return
     */
    @Bean
    public Docket createRestApi(){
        List<Parameter> parameters = new ArrayList<Parameter>();
        ParameterBuilder parameterBuilder1 = new ParameterBuilder();
        ParameterBuilder parameterBuilder2 = new ParameterBuilder();
        ParameterBuilder parameterBuilder3 = new ParameterBuilder();
        parameterBuilder1.name("certificate").description("凭证").modelRef(new ModelRef("String")).parameterType("header").required(false).build();
        parameterBuilder2.name("username").description("用户名").modelRef(new ModelRef("String")).parameterType("header").required(false).build();
        parameterBuilder3.name("password").description("密码").modelRef(new ModelRef("String")).parameterType("header").required(false).build();
        parameters.add(parameterBuilder1.build());
        parameters.add(parameterBuilder2.build());
        parameters.add(parameterBuilder3.build());
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select().apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any()).build().globalOperationParameters(parameters);
    }

    private List<Swagger> getSwaagerConfig(){
        List<Swagger> list = new ArrayList<Swagger>();

        return list;
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("Aironi_cyh api doc")
                .description("aironi_cyh study use")
                .termsOfServiceUrl("localhost:8080/swagger-ui.html")
                .version("1.0")
                .build();
    }

}
