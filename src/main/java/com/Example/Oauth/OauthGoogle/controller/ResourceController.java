package com.Example.Oauth.OauthGoogle.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController { 
    
	
	@GetMapping("/callback")
	public String getcallback() {
		return "index";
	}
	@GetMapping("/hello")
	public String gethello() {
		return "hello";
	}
	
	@GetMapping("/user")
	@ResponseBody
	public Principal user(Principal principal) {
		return principal;
	}
}
