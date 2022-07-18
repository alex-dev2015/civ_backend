package com.smaak.tripcount.service;

import com.smaak.tripcount.entity.History;
import com.smaak.tripcount.entity.Movement;
import com.smaak.tripcount.entity.form.MovementFilterForm;
import com.smaak.tripcount.entity.form.MovementForm;

import java.util.List;

public interface IMovementService {
    Movement create(MovementForm form);

    Movement get(Long id);

    List<Movement> getAll(String carTrip);

    Movement updateStatus(Long id, String status);

    List<History> getAllHistoryId(Long id);

    List<Movement> filter(MovementFilterForm form);
}
