package com.example.countries.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.countries.dao.CountryDAO;
import com.example.countries.model.User;

@Service
public class CountryServiceImpl implements CountryService{
	@Autowired
	private CountryDAO countryDAO; 
	
	@Transactional
	@Override
	public List<User> get() {
		return countryDAO.get();
	}
 
	@Transactional
	@Override
	public User get(int id) {
		return countryDAO.get(id);
	}
 
	@Transactional
	@Override
	public void save(User user) {
		countryDAO.save(user);
	}
 
	@Transactional
	@Override
	public void delete(int id) {
		countryDAO.delete(id);
	}

}
