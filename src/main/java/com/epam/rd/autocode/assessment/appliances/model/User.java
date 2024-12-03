package com.epam.rd.autocode.assessment.appliances.model;

public class User {
    private long id;
    private String name;
    private String email;
    private String password;

    public User(long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User() {
        this.id = 0;
        this.name = "";
        this.email = "";
        this.password = "";
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

    public String getPassword() {
        return password;
    }

    public long setId(long id) {
        return this.id = id;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public String setEmail(String email) {
        return this.email = email;
    }

    public String setPassword(String password) {
        return this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
