package com.example.repository;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.domain.User;

@Repository
public class UserRepository {
	private static final RowMapper<User> USER_ROW_MAPPER =(rs,i)->{
		User user = new User();
		user.setMailAddress(rs.getString("mail_address"));
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		return user;
	};
	
	public User findByMailAddress() {
		return null;
	}
}
