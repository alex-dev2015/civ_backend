package com.smaak.tripcount.service.impl;

import com.smaak.tripcount.entity.Motorist;
import com.smaak.tripcount.repository.MotoristRepository;
import com.smaak.tripcount.service.IMotoristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoristServiceImpl implements IMotoristService {

    @Autowired
    private MotoristRepository motoristRepository;

    @Override
    public Motorist get(Long id) {
        return null;
    }

    @Override
    public List<Motorist> getAll(String name) {
        if (name == null){
           return motoristRepository.findByStatus(true);
        }else
        {
            return motoristRepository.findByNameAndStatus(name, true);
        }

    }
}
