package com.smaak.tripcount.entity.form;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovementForm {

    private String name;

    private String dateTrip;

    private String carTrip;

    private double money;

    private double coins;

    private double moneyTwo;

    private double moneyFive;

    private double moneyTen;

    private double moneyTwenty;

    private double moneyFifty;

    private double moneyOneHundred;

    private double moneyTwoHundred;

    private double pix;

    private double worth;

    private double card;

    private double receipt;

    private double expense;

    private double ticket;

    private double total;

}
