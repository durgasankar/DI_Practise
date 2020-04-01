package com.bridgelabz.security.springsecurityclient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.servlet.config.annotation.*;

/**
 * Web MVC configuration class as it follows thinLeaf frontend.
 * 
 * @author Durgasankar Mishra
 * @created 2020-04-01
 * @version 1.8
 * @see {@link PropertySourcesPlaceholderConfigurer}
 * @see {@link RequestContextListener}
 * @see {@link ResourceHandlerRegistry}
 */
@EnableWebMvc
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		super.addViewControllers(registry);

		registry.addViewController("/").setViewName("forward:/index");

		registry.addViewController("/index");
		registry.addViewController("/secure");

	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}

	@Bean
	public RequestContextListener requestContextListener() {
		return new RequestContextListener();
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
}
