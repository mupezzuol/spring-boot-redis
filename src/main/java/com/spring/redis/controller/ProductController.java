package com.spring.redis.controller;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cache")
public class ProductController {
	
	@GetMapping("/hello")
	@Cacheable("hello")
	public String hello() {
		System.out.println("Without cache");
		return "Hello World!";
	}
	
	@GetMapping("/update")
	@CacheEvict("hello")
	public String updateCache() {
		System.out.println("Clearing the cache");
		return "Clearing the cache";
	}

}
