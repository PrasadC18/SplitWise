package com.example.splitwiseapp.commands;

import org.springframework.stereotype.Component;

import com.example.splitwiseapp.controllers.SettleUpController;
import com.example.splitwiseapp.dtos.SettleUpResponseDto;
import com.example.splitwiseapp.dtos.SettleUpUserRequestDto;

import java.util.List;

@Component
public class SettleUpUserCommand implements Command {
    private SettleUpController settleUpController;

    public SettleUpUserCommand(SettleUpController settleUpController) {
        this.settleUpController = settleUpController;
    }


    @Override
    public void execute(String input) {
        List<String> words = List.of(input.split(" "));

        Long userId = Long.valueOf(words.get(0));

        SettleUpUserRequestDto requestDto = new SettleUpUserRequestDto();
        requestDto.setUserId(userId);

        SettleUpResponseDto responseDto = settleUpController.settleUpUser(requestDto);
    }

    @Override
    public boolean matches(String input) {
        List<String> words = List.of(input.split(" "));

        return words.size() == 2 && words.get(1).equals(CommandKeywords.settleUp);
    }
}
