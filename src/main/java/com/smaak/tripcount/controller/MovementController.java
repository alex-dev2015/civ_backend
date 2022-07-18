package com.smaak.tripcount.controller;

import com.smaak.tripcount.entity.History;
import com.smaak.tripcount.entity.Movement;
import com.smaak.tripcount.entity.form.MovementFilterForm;
import com.smaak.tripcount.entity.form.MovementForm;
import com.smaak.tripcount.service.impl.MovementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimento")
public class MovementController {

    @Autowired
    private MovementServiceImpl movementService;

    @GetMapping
    public List<Movement> getAll(@RequestParam(value = "carTrip", required = false)
                                 String carTrip){
        return movementService.getAll(carTrip);
    }

    @GetMapping("/get/{id}")
    public Movement get(@PathVariable Long id){
        return movementService.get(id);
    }

    @PostMapping
    public Movement create(@RequestBody MovementForm form) {
        return movementService.create(form);
    }

    @PutMapping("atualizar/{id}")
    public Movement updateStatus(@PathVariable Long id, @RequestParam(value = "status", required = true)
            String status){
        return movementService.updateStatus(id, status);
    }

    @GetMapping("histories/{id}")
    public List<History> getAllHistoryId(@PathVariable Long id){
        return movementService.getAllHistoryId(id);
    }
}
