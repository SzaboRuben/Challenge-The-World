package com.CTW.program;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProgramDao {


    JdbcTemplate jdbcTemplate;

    private RowMapper<Program> programRowMapper = (rs,i) ->
            new Program(
                    rs.getString("location"),
                    rs.getString("activityType"),
                    rs.getString("season"),
                    rs.getTimestamp("startDate").toLocalDateTime(),
                    rs.getTimestamp("endDate").toLocalDateTime(),
                    rs.getString("description"),
                    rs.getBigDecimal("price"),
                    rs.getInt("candidateLimit"),
                    rs.getString("programStatus")
            );


    public List<Program> listPrograms() {
//        jdbcTemplate.query("SELECT location, activityType,season  ")
        return null;
    }
}
