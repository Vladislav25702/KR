package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "users", schema = "users30", catalog = "")
public class UsersEntity {

    @Id
    @Column(name = "user_id")
    private int userId;
    @Basic
    @Column(name = "auth_token")
    private String authToken;
    @Basic
    @Column(name = "user_name")
    private String userName;
    @Basic
    @Column(name = "position_on_starship")
    private String positionOnStarship;
    @Basic
    @Column(name = "age")
    private int age;
    @Basic
    @Column(name = "sex")
    private String sex;
    @Basic
    @Column(name = "balance")
    private int balance;
    @Basic
    @Column(name = "background")
    private String background;
    @Basic
    @Column(name = "public_background")
    private String publicBackground;
    @Basic
    @Column(name = "photo")
    private String photo;
    @Basic
    @Column(name = "security_background")
    private String securityBackground;
    @Basic
    @Column(name = "medical_background")
    private String medicalBackground;
    @Basic
    @Column(name = "psychology_background")
    private String psychologyBackground;
    @Basic
    @Column(name = "last_available")
    private int lastAvailable;
    @Basic
    @Column(name = "user_settings")
    private int userSettings;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPositionOnStarship() {
        return positionOnStarship;
    }

    public void setPositionOnStarship(String positionOnStarship) {
        this.positionOnStarship = positionOnStarship;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getPublicBackground() {
        return publicBackground;
    }

    public void setPublicBackground(String publicBackground) {
        this.publicBackground = publicBackground;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getSecurityBackground() {
        return securityBackground;
    }

    public void setSecurityBackground(String securityBackground) {
        this.securityBackground = securityBackground;
    }

    public String getMedicalBackground() {
        return medicalBackground;
    }

    public void setMedicalBackground(String medicalBackground) {
        this.medicalBackground = medicalBackground;
    }

    public String getPsychologyBackground() {
        return psychologyBackground;
    }

    public void setPsychologyBackground(String psychologyBackground) {
        this.psychologyBackground = psychologyBackground;
    }

    public int getLastAvailable() {
        return lastAvailable;
    }

    public void setLastAvailable(int lastAvailable) {
        this.lastAvailable = lastAvailable;
    }

    public int getUserSettings() {
        return userSettings;
    }

    public void setUserSettings(int userSettings) {
        this.userSettings = userSettings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return userId == that.userId && age == that.age && balance == that.balance && lastAvailable == that.lastAvailable && userSettings == that.userSettings && Objects.equals(authToken, that.authToken) && Objects.equals(userName, that.userName) && Objects.equals(positionOnStarship, that.positionOnStarship) && Objects.equals(sex, that.sex) && Objects.equals(background, that.background) && Objects.equals(publicBackground, that.publicBackground) && Objects.equals(photo, that.photo) && Objects.equals(securityBackground, that.securityBackground) && Objects.equals(medicalBackground, that.medicalBackground) && Objects.equals(psychologyBackground, that.psychologyBackground);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, authToken, userName, positionOnStarship, age, sex, balance, background, publicBackground, photo, securityBackground, medicalBackground, psychologyBackground, lastAvailable, userSettings);
    }
}
