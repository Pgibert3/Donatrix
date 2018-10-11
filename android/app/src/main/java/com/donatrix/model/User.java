package com.donatrix.model;

public class User {

    private String email;
    private String password;
    private String name;
    private boolean accountState;
    private UserType userType;

    public User(String email, String password, String name, boolean accountState, UserType userType) {
        this.email = email;
        this.password = password;
        this.name = name;
        this.accountState = accountState;
        this.userType = userType;
    }

    public User(String email, String password) {
        this(email, password, "Anonymous", false, UserType.USER);
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return this.password;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void setAccountState(boolean accountState) {
        this.accountState = accountState;
    }
    public boolean getAccountState() {
        return this.accountState;
    }
    public void setUserType(UserType userType) {
        this.userType = userType;
    }
    public UserType getUserType() {
        return userType;
    }
}
