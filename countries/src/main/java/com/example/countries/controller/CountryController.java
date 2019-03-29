package com.example.countries.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.countries.model.User;
import com.example.countries.service.CountryService;


@RestController
@RequestMapping("/user")
public class CountryController {
	@Autowired
	private CountryService countryService;
	
	@CrossOrigin(origins = "*", allowedHeaders ="*")
	@PostMapping("/save")
	@ResponseBody
	public User save(@RequestBody User userObj) {
		countryService.save(userObj);
		return userObj;
	}
	
	@GetMapping("/user")
	public List<User> get(){
		return countryService.get();
	}
	
	@GetMapping("/user/{id}")
	public User get(@PathVariable int id) {
		User userObj = countryService.get(id);
		if(userObj == null) {
			throw new RuntimeException("User not found for the Id:"+id);
		}
		return userObj;
	}
	
	@PutMapping("/update")
	public User update(@RequestBody User userObj) {
		countryService.save(userObj);
		return userObj;
	}
	
	@DeleteMapping("/user/{id}")
	public String delete(@PathVariable int id) {
		countryService.delete(id);
		return "User has been deleted with id:"+id;
	}
}
