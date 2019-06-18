package com.CTW.applicant;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class ApplicantDao {

    private JdbcTemplate jdbcTemplate;

    public ApplicantDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private static final RowMapper<Applicant> APPLICANT_ROW_MAPPER = ((rs, i) ->
            new Applicant(
                    rs.getLong("id"),
                    rs.getString("name"),
                    rs.getString("prefFirstName"),
                    rs.getString("address"),
                    rs.getString("email"),
                    rs.getTimestamp("dateOfBirth").toLocalDateTime(),
                    rs.getString("sex"),
                    rs.getString("phone")

            ));

    private static final String SQL_SELECT_ALL_APPLICANTS = "SELECT id, name, prefFirstName, address, email, dateOfBirth, sex, phone FROM applicant";

    public List<Applicant> listAllApplicants() {
        return jdbcTemplate.query(SQL_SELECT_ALL_APPLICANTS, APPLICANT_ROW_MAPPER);
    }
}
