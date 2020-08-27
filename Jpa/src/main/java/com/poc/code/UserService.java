package com.poc.code;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserService {
	private static String svnUrl;

	@Autowired
	public UserService(@Value("${SVN_URL}") String svnUrl) {
		this.svnUrl = svnUrl;
	}

	@GetMapping("/test")
	public static String myUrl() {
		return svnUrl;
	}
}