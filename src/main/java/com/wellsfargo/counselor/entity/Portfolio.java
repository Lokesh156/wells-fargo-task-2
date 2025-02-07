package com.wellsfargo.counselor.entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioID;

    @ManyToOne
    @JoinColumn(name="clientID")
    private Client client;

    @Column(nullable = false)
    private Date creationDate;

    protected Portfolio(){

    }

    public Portfolio(Client client, Date creationDate){
        this.client=client;
        this.creationDate=creationDate;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
