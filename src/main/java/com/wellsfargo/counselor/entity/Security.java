package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;


import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityID;

    @ManyToOne
    @JoinColumn(name="portfolioID")
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private BigDecimal purchasePrice;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private  BigDecimal quantity;

    protected Security(){

    }
    public Security(Portfolio portfolio, String name, String category, BigDecimal purchasePrice, Date purchaseDate, BigDecimal quantity){
        this.portfolio=portfolio;
        this.name=name;
        this.category=category;
        this.purchasePrice=purchasePrice;
        this.purchaseDate=purchaseDate;
        this.quantity=quantity;

    }

    public long getSecurityID() {
        return securityID;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public BigDecimal getQuantity() {
        return quantity;
    }

    public void setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
    }

}
