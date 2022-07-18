package com.smaak.tripcount.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "movement")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Movement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name_motorist")
    private String name;

    @Column(name = "date_trip")
    private LocalDate dateTrip;

    @Column(name = "map")
    private String carTrip;

    private double money;

    private double coins;

    @Column(name = "money_two")
    private double moneyTwo;

    @Column(name = "money_five")
    private double moneyFive;

    @Column(name = "money_ten")
    private double moneyTen;

    @Column(name = "money_twenty")
    private double moneyTwenty;

    @Column(name = "money_fifty")
    private double moneyFifty;

    @Column(name = "money_onehundred")
    private double moneyOneHundred;

    @Column(name = "money_twohundred")
    private double moneyTwoHundred;

    private double pix;

    private double worth;

    private double card;

    private double receipt;

    private double expense;

    private double ticket;

    private double total;

    private String status;

    @OneToMany(mappedBy = "movement", fetch = FetchType.LAZY)
    @JsonIgnore
    private List<History> histories = new ArrayList<>();

    @Column(name = "date_created")
    private LocalDateTime created = LocalDateTime.now();

    @Column(name = "date_updated")
    private LocalDateTime updated = LocalDateTime.now();
}
