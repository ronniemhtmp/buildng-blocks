package com.stacksmplify.restservices.sprngbootbuildingblocks.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

import org.springframework.hateoas.ResourceSupport;

/**
 * Order
 */
@Entity
@Table(name = "orders")
public class Order extends ResourceSupport{

    @Id
    @GeneratedValue
    @JsonView(Views.Internal.class)
    private Long orderId;

    @JsonView(Views.Internal.class)
    private String orderDescription;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

    //Constructor
    public Order() {
    }

    //Getters and setters
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    
}