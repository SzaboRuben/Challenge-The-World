package com.CTW.program;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProgramDao {


    private static final RowMapper<Program> programRowMapper = (rs, i) ->
            new Program(
                    rs.getInt("id"),
                    rs.getString("address"),
                    rs.getString("programCode"),
                    rs.getString("location"),
                    rs.getString("activityType"),
                    rs.getString("season"),
                    rs.getDate("startDate").toLocalDate(),
                    rs.getDate("endDate").toLocalDate(),
                    rs.getString("description"),
                    rs.getBigDecimal("price"),
                    rs.getInt("candidateLimit"),
                    rs.getString("programStatus")
            );
    private static final String SQL_SELECT_ALL_PROGRAMS = "SELECT id, address, programCode, location, activityType,season,startDate,endDate ,description,price, candidateLimit ,programStatus FROM program";
    JdbcTemplate jdbcTemplate;

    public ProgramDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Program> listPrograms() {
        return jdbcTemplate.query(SQL_SELECT_ALL_PROGRAMS, programRowMapper);
    }

    public void saveProgramAndGetId(Program program) {
        jdbcTemplate.update("INSERT INTO program(address, programCode, location, activityType, season, startDate, endDate, description, price, candidateLimit, programStatus)" +
                        "VALUES (?,?,?,?,?,?,?,?,?,?)",
                program.getAddress(),
                program.getProgramCode(),
                program.getLocation(),
                program.getActivityType(),
                program.getSeason(),
                program.getStartDate(),
                program.getEndDate(),
                program.getDescription(),
                program.getPrice(),
                program.getCandidateLimit(),
                program.getProgramStatus());
    }
}
