package com.example.splitwiseapp.controllers;

import org.springframework.stereotype.Controller;

import com.example.splitwiseapp.dtos.*;
import com.example.splitwiseapp.models.Expense;
import com.example.splitwiseapp.services.SettleUpService;

import java.util.List;

@Controller
public class SettleUpController {
    private SettleUpService settleUpService;

    public SettleUpController(SettleUpService settleUpService) {
        this.settleUpService = settleUpService;
    }

    /*
    settle up functionality should return the list of transactions
    which when executed will make the net amount of a user to be ZERO.
     */
    public SettleUpResponseDto settleUpUser(SettleUpUserRequestDto requestDto) {
        SettleUpResponseDto responseDto = new SettleUpResponseDto();
        try {
            List<Expense> expenses = settleUpService.settleUpUser(
                    requestDto.getUserId()
            );

            responseDto.setExpenses(expenses);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }


    public SettleUpGroupResponseDto settleUpGroup(SettleUpGroupRequestDto requestDto) {
        return null;
    }
}
