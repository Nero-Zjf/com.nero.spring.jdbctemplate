package com.nero.spring.jdbctempate.service.impl;

import com.nero.spring.jdbctempate.User;
import com.nero.spring.jdbctempate.UserRowMapper;
import com.nero.spring.jdbctempate.service.UserService;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Types;
import java.util.List;

public class UserServiceImpl implements UserService {
    JdbcTemplate jdbcTemplate;

    public UserServiceImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(User user) {
        jdbcTemplate.update("insert into user(name,age) values (?,?)",
                new Object[]{user.getName(), user.getAge()},
                new int[]{Types.VARCHAR, Types.INTEGER});
    }

    public List<User> getUsers() {
        return jdbcTemplate.query("select * from user", new UserRowMapper());
    }
}
