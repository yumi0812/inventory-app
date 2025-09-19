package com.example.demo;

public class AuthResponse {
  private String role;
  private String token;

  public AuthResponse(String role, String token) {
    this.role = role;
    this.token = token;
  }

  public String getRole() {
    return role;
  }

  public String getToken() {
    return token;
  }
}