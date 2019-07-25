package com.CTW.user;

public class User {

    private long id;
    private String name;
    private String email;
    private String userName;
    private String password;
    private int enabled;
    private String role;
    private String userStatus;


    public User() {
    }

    public User(long id, String name, String email, String userName, String password, int enabled, String role, String userStatus) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
        this.role = role;
        this.userStatus = userStatus;
    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getEnabled() {
        return enabled;
    }

    public String getRole() {
        return role;
    }

    public String getUserStatus() {
        return userStatus;
    }
}
