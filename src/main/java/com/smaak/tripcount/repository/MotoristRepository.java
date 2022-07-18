package com.smaak.tripcount.repository;

import com.smaak.tripcount.entity.Motorist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MotoristRepository extends JpaRepository<Motorist, Long> {
    List<Motorist> findByNameAndStatus(String name, Boolean status);

    List<Motorist> findByStatus(Boolean status);
}
