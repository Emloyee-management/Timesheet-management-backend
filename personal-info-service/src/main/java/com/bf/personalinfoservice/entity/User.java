package com.bf.personalinfoservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "user_collection")
public class User {
    @Id
    private String id;

    private String username;

    private String password;

    private String phone;

    private String email;

    private String address;

    private String emergency1Name;

    private String emergency1Phone;

    private String emergency2Name;

    private String emergency2Phone;

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    private String scope;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    private String token;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmergency1Name() {
        return emergency1Name;
    }

    public void setEmergency1Name(String emergency1Name) {
        this.emergency1Name = emergency1Name;
    }

    public String getEmergency1Phone() {
        return emergency1Phone;
    }

    public void setEmergency1Phone(String emergency1Phone) {
        this.emergency1Phone = emergency1Phone;
    }

    public String getEmergency2Name() {
        return emergency2Name;
    }

    public void setEmergency2Name(String emergency2Name) {
        this.emergency2Name = emergency2Name;
    }

    public String getEmergency2Phone() {
        return emergency2Phone;
    }

    public void setEmergency2Phone(String emergency2Phone) {
        this.emergency2Phone = emergency2Phone;
    }
}
