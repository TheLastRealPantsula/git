package com.example.countries.service;

import java.util.List;

import com.example.countries.model.User;

public interface CountryService {

	void save(User user);

	List<User> get();

	User get(int id);

	void delete(int id);

}
