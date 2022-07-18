package com.smaak.tripcount.entity.form;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovementFilterForm {

    private String name;

    private LocalDate dateTrip;

    private String carTrip;

    private String Status;
}
