package com.example.newsapp.request;
public class ForgotPasswordRequest {
    private String email;
    private String lastPassword;
    private String newPassword;

    // Default constructor
    public ForgotPasswordRequest() {}

    // Parameterized constructor
    public ForgotPasswordRequest(String email, String lastPassword, String newPassword) {
        this.email = email;
        this.lastPassword = lastPassword;
        this.newPassword = newPassword;
    }

    // Getters and Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastPassword() {
        return lastPassword;
    }

    public void setLastPassword(String lastPassword) {
        this.lastPassword = lastPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
}
