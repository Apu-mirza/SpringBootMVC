package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.model.programmer;

@Controller
public class maincontroller {

	@ModelAttribute
	public void welcome(Model m) {
		m.addAttribute("msg", "Welcome to my spring boot app");
	}
	@GetMapping("/home")
	public String homePage() {
		System.out.println("Get method is called perfectly");
		return "homepage";
	}

	@PostMapping("addProgrammer")
	public String addProgrammer(@ModelAttribute programmer programmer) {

		return "programmerInfo.html";
	}
	
	@GetMapping("/allProgrammers")
	public String allProgrammers(Model m) {
		
		List<programmer> p = new ArrayList<programmer>();
		p.add(new programmer(101, "Mirza Opu", "Java"));
		p.add(new programmer(102, "Monna", "c++"));
		p.add(new programmer(103, "Emon", "Machine Learning"));
		
		m.addAttribute("programmers", p);
		
		return "allProgrammers.html";
	}
}
