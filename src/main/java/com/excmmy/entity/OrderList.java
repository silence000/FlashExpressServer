package com.excmmy.entity;

import java.util.Date;

public class OrderList {
    private long id; // order_info id
    private String name; // 客户名
    private String mobile; // 手机号
    private String series; // 商品编号
    private String productName; // 商品名
    private Integer number; // 购买数量
    private String type; // 订单类型
    private String status; // 订单状态
    private Integer customerId; // 客户 id
    private String startDate; // 订单开始日期
    private String endDate; // 订单结束日期

    public OrderList() {
    }

    public OrderList(long id, String name, String mobile, String series, String productName, Integer number, String type, String status, Integer customerId, String startDate, String endDate) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.series = series;
        this.productName = productName;
        this.number = number;
        this.type = type;
        this.status = status;
        this.customerId = customerId;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "OrderList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", series='" + series + '\'' +
                ", productName='" + productName + '\'' +
                ", number=" + number +
                ", type=" + type +
                ", status=" + status +
                ", customerId=" + customerId +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
}
