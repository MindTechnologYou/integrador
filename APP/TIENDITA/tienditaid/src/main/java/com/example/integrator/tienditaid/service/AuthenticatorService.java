package com.example.integrator.tienditaid.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.integrator.tienditaid.model.User;

@Service
public class AuthenticatorService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public boolean authenticateUser(User user) {
		String SQL="select * from Usuarios where usuario.email =? and usuario.password=?";
		jdbcTemplate.execute(SQL);
		
		/**
		 * if(user !=null){
		 * return true;
		 * }else{
		 * return false;
		 * }
		 */
		 return true;
	}
	
	public User createUser(User usuario) {
		String SQL="INSERT INTO USUARIO.USER (EMAIL,PASWORD)VALUES(?,?)";
		//User user =jdbcTemplate.execute(SQL);
		//return user
		return null;
	}
}
