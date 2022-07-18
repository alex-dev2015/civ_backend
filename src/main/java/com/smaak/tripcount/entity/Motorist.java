package com.smaak.tripcount.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "motorist")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Motorist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cod_motorist")
    private Integer codigo;

    private String name;

    @Column(name = "date_created")
    private LocalDateTime created = LocalDateTime.now();

    private Boolean status;
}
