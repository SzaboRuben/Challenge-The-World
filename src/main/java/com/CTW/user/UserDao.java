package com.CTW.user;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class UserDao {


    private JdbcTemplate jdbcTemplate;


    public UserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final RowMapper<User> USER_ROW_MAPPER = ((rs, i) -> new User(
            rs.getLong("id"),
            rs.getString("name"),
            rs.getString("email"),
            rs.getString("user_name"),
            rs.getString("password"),
            rs.getInt("enabled"),
            rs.getString("role"),
            rs.getString("user_status")));

    public List<User> listUsers() {
        return jdbcTemplate.query(
                "SELECT id, name, email, user_name, password, enabled, role, user_status FROM users",
                USER_ROW_MAPPER);
    }

    public User getUserByUserName(String userName) {
        return jdbcTemplate.queryForObject(
                "SELECT id, name, email, user_name, password, enabled, role, user_status FROM users WHERE user_name = ? ",
                USER_ROW_MAPPER,
                userName);
    }
}
