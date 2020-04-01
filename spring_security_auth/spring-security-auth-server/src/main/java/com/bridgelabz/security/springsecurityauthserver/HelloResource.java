package com.bridgelabz.security.springsecurityauthserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Rest controller
 * 
 * @author Durgasankar Mishra
 * @created 2020-04-01
 * @version 1.8
 */
@RestController
@RequestMapping("/rest/hello")
public class HelloResource {

	@GetMapping("/principal")
	public Principal user(Principal principal) {
		return principal;
	}

}
