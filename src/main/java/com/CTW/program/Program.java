package com.CTW.program;

import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {

    private int id;
    private String location;
    private String activityType;
    private String season;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String description;
    private BigDecimal price;
    private int candidateLimit;
    private String programStatus;

    public Program() {
    }

    public Program(String location, String activityType, String season, LocalDateTime startDate,
                   LocalDateTime endDate, String description, BigDecimal price, int candidateLimit, String programStatus) {
        this.location = location;
        this.activityType = activityType;
        this.season = season;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.price = price;
        this.candidateLimit = candidateLimit;
        this.programStatus = programStatus;
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public String getActivityType() {
        return activityType;
    }

    public String getSeason() {
        return season;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public int getCandidateLimit() {
        return candidateLimit;
    }

    public String getProgramStatus() {
        return programStatus;
    }
}
