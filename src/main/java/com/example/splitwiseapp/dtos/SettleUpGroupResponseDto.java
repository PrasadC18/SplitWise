package com.example.splitwiseapp.dtos;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

import com.example.splitwiseapp.models.Expense;

@Getter
@Setter
public class SettleUpGroupResponseDto {
    private List<Expense> expenses;
    private ResponseStatus responseStatus;
}
