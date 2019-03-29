package com.example.countries.dao;

import java.util.List;

import com.example.countries.model.User;

public interface CountryDAO {

	List<User> get();

	User get(int id);

	void save(User user);

	void delete(int id);

}
