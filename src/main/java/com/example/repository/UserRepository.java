package com.example.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.User;

@Repository
public class UserRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<User> USER_ROW_MAPPER =(rs,i)->{
		User user = new User();
		user.setMailAddress(rs.getString("mail_address"));
		user.setName(rs.getString("name"));
		user.setPassword(rs.getString("password"));
		return user;
	};
	
	public User findByMailAddress(String mailAddress) {
		String sql = "select mail_address,name,password from User where mailddress=:mailAddress";
		SqlParameterSource param = new MapSqlParameterSource().addValue("mailAddress", mailAddress);
		User user = template.queryForObject(sql, param, USER_ROW_MAPPER);
		return user;
	}
	
	
}
