package com.excmmy.entity;

import java.io.Serializable;
import java.util.Date;

public class Logs implements Serializable {
    private Long userId;
    private String username;
    private Date loginTime;
    private String city;
    private String ip;

    public Logs() {
    }

    public Logs(Long userId, String username, Date loginTime, String city, String ip) {
        this.userId = userId;
        this.username = username;
        this.loginTime = loginTime;
        this.city = city;
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Logs{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", loginTime=" + loginTime +
                ", city='" + city + '\'' +
                ", ip='" + ip + '\'' +
                '}';
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
}
