package com.smaak.tripcount.repository;

import com.smaak.tripcount.entity.Movement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface MovementRepository extends JpaRepository<Movement, Long> {
    List<Movement> findByCarTrip(String carTrip);

}
