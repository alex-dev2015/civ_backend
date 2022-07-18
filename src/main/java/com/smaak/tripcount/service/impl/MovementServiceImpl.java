package com.smaak.tripcount.service.impl;

import com.smaak.tripcount.entity.History;
import com.smaak.tripcount.entity.Movement;
import com.smaak.tripcount.entity.form.MovementFilterForm;
import com.smaak.tripcount.entity.form.MovementForm;
import com.smaak.tripcount.repository.MovementRepository;
import com.smaak.tripcount.service.IMovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class MovementServiceImpl implements IMovementService {

    @Autowired
    private MovementRepository movementRepository;

    @Override
    public Movement create(MovementForm form) {
        Movement mov = new Movement();
        mov.setName(form.getName());

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate data = LocalDate.parse(form.getDateTrip(), formato);

        mov.setDateTrip(data);


        mov.setCarTrip(form.getCarTrip());
        mov.setMoney(form.getMoney());
        mov.setCoins(form.getCoins());
        mov.setMoneyTwo(form.getMoneyTwo());
        mov.setMoneyFive(form.getMoneyFive());
        mov.setMoneyTen(form.getMoneyTen());
        mov.setMoneyTwenty(form.getMoneyTwenty());
        mov.setMoneyFifty(form.getMoneyFifty());
        mov.setMoneyOneHundred(form.getMoneyOneHundred());
        mov.setMoneyTwoHundred(form.getMoneyTwoHundred());
        mov.setPix(form.getPix());
        mov.setWorth(form.getWorth());
        mov.setCard(form.getCard());
        mov.setReceipt(form.getReceipt());
        mov.setExpense(form.getExpense());
        mov.setTicket(form.getTicket());
        mov.setTotal(form.getTotal());
        mov.setStatus("Aberto");

        return movementRepository.save(mov);
    }

    @Override
    public Movement get(Long id) {

        return movementRepository.getById(id);
    }

    @Override
    public List<Movement> getAll(String carTrip) {
        if (carTrip == null){
            return  movementRepository.findAll();
        }else
        {
            return movementRepository.findByCarTrip(carTrip);
        }
    }

    @Override
    public Movement updateStatus(Long id, String status) {
        
        Movement movement = movementRepository.getById(id);
        movement.setStatus(status);

        return movementRepository.save(movement);
    }

    @Override
    public List<History> getAllHistoryId(Long id) {
        Movement movement = movementRepository.findById(id).get();

        return movement.getHistories();
    }

    @Override
    public List<Movement> filter(MovementFilterForm form) {

        return null;
    }
}
