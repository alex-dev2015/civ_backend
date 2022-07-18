package com.smaak.tripcount.service;

import com.smaak.tripcount.entity.Motorist;

import java.util.List;

public interface IMotoristService {
    Motorist get(Long id);

    List<Motorist> getAll(String name);
}
