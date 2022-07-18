package com.smaak.tripcount.controller;

import com.smaak.tripcount.entity.Motorist;
import com.smaak.tripcount.service.impl.MotoristServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/motorists")
public class MotoristController {

    @Autowired
    private MotoristServiceImpl service;

    @GetMapping
    public List<Motorist> getAll(@RequestParam(value = "name", required = false) String name){
        return service.getAll(name);

    }
}
