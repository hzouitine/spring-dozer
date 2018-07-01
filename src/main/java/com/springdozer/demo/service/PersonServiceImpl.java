package com.springdozer.demo.service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springdozer.demo.dto.PersonDTO;
import com.springdozer.demo.model.Person;

@Service
public class PersonServiceImpl implements PersonService{

	List<Person> persons =  Stream
			.of(new Person(1L,"Hamza","Hamza"),new Person(2L,"Busi","Busi"))
			.collect(Collectors.toList());
	
	@Autowired
	Mapper mapper;
	
	@Override
	public List<PersonDTO> getPersonList() {
		// TODO Auto-generated method stub
		return  persons
				.stream()
				.map((Person item) -> mapper.map(item, PersonDTO.class,"PERSON_MAPPING"))
				.collect(Collectors.toList());
	}

}
