package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Log4j
@RequestMapping("/sample/*")
@Controller
public class SampleController {

	@GetMapping("/all")
	public void doAll() {
		log.info("do all can");
	}
	
	@GetMapping("/member")
	public void doMember() {
		log.info("login");
	}
	
	@GetMapping("/admin")
	public void doAdmin() {
		log.info("admin");
	}
}
