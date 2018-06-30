package com.springdozer.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdozer.demo.dto.PersonDTO;
import com.springdozer.demo.service.PersonService;

@RestController
public class MainController {

	@Autowired
	private PersonService personService;
	
	@RequestMapping({"/",""})
	public String index(){
		return "";
	}
	
	@RequestMapping("/persons")
	public List<PersonDTO> persons(){
		return personService.getPersonList();
	}
}
