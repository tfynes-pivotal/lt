package com.fynesy.lt;

import javax.swing.text.Style;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LtApplication {

	public static void main(String[] args) {
		SpringApplication.run(LtApplication.class, args);
	}

	@RequestMapping("/")
	String index() {
		String s = "hi\n";
		System.out.println(s);
		return s;
	}
}
