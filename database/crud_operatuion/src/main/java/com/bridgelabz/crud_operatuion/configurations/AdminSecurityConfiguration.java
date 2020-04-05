package com.bridgelabz.crud_operatuion.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.www.DigestAuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.DigestAuthenticationFilter;

@Configuration
@Order(1)
public class AdminSecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.antMatcher("/employees/**")
			.addFilter(getAuthenticationFilter())
			.exceptionHandling()
			.authenticationEntryPoint(digestAuthenticationEntryPoint())
			.and()
			.authorizeRequests()
			.antMatchers(("/employees/admin/**"))
			.hasRole("ADMIN");
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
		.withUser("user")
			.password("password1")
			.roles("USER")
		.and()
		.withUser("admin")
			.password("password2")
			.roles("ADMIN");
	}

	private DigestAuthenticationFilter getAuthenticationFilter() throws Exception{
		DigestAuthenticationFilter filter = new DigestAuthenticationFilter();
		filter.setUserDetailsService(userDetailsServiceBean());
		filter.setAuthenticationEntryPoint(digestAuthenticationEntryPoint());	
		return filter;
	}

	private DigestAuthenticationEntryPoint digestAuthenticationEntryPoint() {
		DigestAuthenticationEntryPoint entryPoint = new DigestAuthenticationEntryPoint();
		entryPoint.setRealmName("admin-digest-realm");
//		used to generate nounce when req comes it chks whether it is valid and not expired.
		entryPoint.setKey("r20jc134");
		return entryPoint;
	}
	@Override
	@Bean
	public UserDetailsService userDetailsServiceBean() throws Exception {
		return super.userDetailsServiceBean();
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	

}
