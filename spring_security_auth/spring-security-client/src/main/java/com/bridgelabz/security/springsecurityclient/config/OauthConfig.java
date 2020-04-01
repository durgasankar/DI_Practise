package com.bridgelabz.security.springsecurityclient.config;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Configuration class which allows access to all authenticated request else
 * redirect to login page .
 * 
 * @author Durgasankar Mishra
 * @created 2020-04-01
 * @version 1.8
 */
@EnableOAuth2Sso
@Configuration
public class OauthConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.antMatcher("/**").authorizeRequests().antMatchers("/", "/login**").permitAll().anyRequest()
				.authenticated();

	}
}
