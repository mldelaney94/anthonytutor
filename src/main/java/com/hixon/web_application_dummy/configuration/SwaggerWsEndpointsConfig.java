package com.hixon.web_application_dummy.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import springfox.documentation.swagger.web.InMemorySwaggerResourcesProvider;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

@Configuration
public class SwaggerWsEndpointsConfig { //currently commented out as to not conflict with yaml to code generation

	/*@Primary
	@Bean
	public SwaggerResourcesProvider swaggerResourcesProvider(
			final InMemorySwaggerResourcesProvider defaultResourcesProvider) {
		return () -> {
			SwaggerResource wsResource = new SwaggerResource();
			wsResource.setName("ws endpoints");
			wsResource.setSwaggerVersion("2.0");
			wsResource.setLocation("swaggerspec.yaml");

			List<SwaggerResource> resources = new ArrayList<SwaggerResource>(defaultResourcesProvider.get());
			resources.add(wsResource);
			return resources;
		};
	}*/
}
