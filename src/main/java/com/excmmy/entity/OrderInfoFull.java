package com.excmmy.entity;

import java.math.BigDecimal;
import java.util.Date;

public class OrderInfoFull {
    private Long id;

    private Long series;

    private Long customerId;

    private String customerName;

    private Long receiveId;

    private String name;

    private String phone;

    private String address;

    private String postcode;

    private Long productId;

    private String productSeries;

    private String productName;

    private String productDescription;

    private Integer number;

    private String unit;

    private BigDecimal total;

    private String type;

    private String status;

    private BigDecimal price;

    private String startDate;

    private String endDate;

    public OrderInfoFull() {
    }

    public OrderInfoFull(Long id, Long series, Long customerId, String customerName, Long receiveId, String name, String phone, String address, String postcode, Long productId, String productSeries, String productName, String productDescription, Integer number, String unit, BigDecimal total, String type, String status, BigDecimal price, String startDate, String endDate) {
        this.id = id;
        this.series = series;
        this.customerId = customerId;
        this.customerName = customerName;
        this.receiveId = receiveId;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.postcode = postcode;
        this.productId = productId;
        this.productSeries = productSeries;
        this.productName = productName;
        this.productDescription = productDescription;
        this.number = number;
        this.unit = unit;
        this.total = total;
        this.type = type;
        this.status = status;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "OrderInfoFull{" +
                "id=" + id +
                ", series=" + series +
                ", customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", receiveId=" + receiveId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                ", productId=" + productId +
                ", productSeries='" + productSeries + '\'' +
                ", productName='" + productName + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", number=" + number +
                ", unit='" + unit + '\'' +
                ", total=" + total +
                ", type='" + type + '\'' +
                ", status='" + status + '\'' +
                ", price=" + price +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSeries() {
        return series;
    }

    public void setSeries(Long series) {
        this.series = series;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(Long receiveId) {
        this.receiveId = receiveId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductSeries() {
        return productSeries;
    }

    public void setProductSeries(String productSeries) {
        this.productSeries = productSeries;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
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
