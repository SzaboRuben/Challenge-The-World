package com.CTW.program;


import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Program {

    private int id;
    private String address;
    private String location;
    private ActivityType activityType;
    private String season;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String description;
    private BigDecimal price;
    private int candidateLimit;
    private ProgramStatus programStatus;

    public Program() {
    }

    public Program(int id , String location, String activityType, String season, LocalDateTime startDate,
                   LocalDateTime endDate, String description, BigDecimal price, int candidateLimit, String programStatus) {
        this.id = id;
        this.address = createAddress(location, activityType);
        this.location = location;
        this.activityType = ActivityType.valueOf(activityType);
        this.season = season;
        this.startDate = startDate;
        this.endDate = endDate;
        this.description = description;
        this.price = price;
        this.candidateLimit = candidateLimit;
        this.programStatus = ProgramStatus.valueOf(programStatus);
    }

    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public ActivityType getActivityType() {
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

    public ProgramStatus getProgramStatus() {
        return programStatus;
    }

    public String getAddress() {
        return address;
    }

    private String createAddress(String location, String activityType){
        return location.toLowerCase() + "-" + activityType.toLowerCase();
    }
}
