package com.realestate.site.models.user;


import com.realestate.site.models.new_building.Apartment;
import com.realestate.site.utils.FormatDateTime;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "customer_id")
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "date_time")
    private String dateTime;
    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "comment")
    private String comment;

    @Column(name = "mortgage")
    private boolean mortgage;

    @Column(name = "agree_to_data_processing")
    private boolean agreeToDataProcessing;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "apartment_id")
    private Apartment apartment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isMortgage() {
        return mortgage;
    }

    public void setMortgage(boolean mortgage) {
        this.mortgage = mortgage;
    }

    public boolean isAgreeToDataProcessing() {
        return agreeToDataProcessing;
    }

    public void setAgreeToDataProcessing(boolean agreeToDataProcessing) {
        this.agreeToDataProcessing = agreeToDataProcessing;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }

    public String getDateTime() {
        return FormatDateTime.getInstance().formattedDateTime(dateTime);
    }

    @Override
    public String toString() {
        return "Customer{" +

                ", username='" + username + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", comment='" + comment + '\'' +
                ", mortgage=" + mortgage +
                ", agreeToDataProcessing=" + agreeToDataProcessing +
                ", apartment=" + apartment +
                '}';
    }
}
