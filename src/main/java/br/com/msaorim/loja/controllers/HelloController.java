package br.com.msaorim.loja.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	@GetMapping(value = "/hello")
	public String hello(HttpServletRequest request) {
		request.setAttribute("nome", "Mundo");
		return "hello";
	}

}
