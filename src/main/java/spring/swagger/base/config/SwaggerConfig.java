package spring.swagger.base.config;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	ApiInfo apiInfo() {
		ApiInfo apiInfo = new ApiInfo("SpringSwaggerBaseProject", // Title -> projectName, Microservice name
				"API Description", // Description
				"1.0.0", // Version -> API, REST service version
				"Terms of service", // termsOfServiceUrl
				new Contact("ContactName", "urlContact", "emailContact"), // Contact Info
				"License of API", "API license URL", Collections.emptyList());
		return apiInfo;
	}

    @Bean
    Docket productApi() {

		//List<VendorExtension> vendorExtension = Collections.emptyList();

		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
				.tags(new Tag("ProjectPurpose", "Project Description"))
				// .tags(new Tag("ProjectPurpose", "Project Description", vendorExtension))
				.select()
				.paths(PathSelectors.any())
				.apis(RequestHandlerSelectors.basePackage("spring.swagger.base")).build();
	}

}
