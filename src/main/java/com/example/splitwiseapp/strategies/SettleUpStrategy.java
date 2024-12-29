package com.example.splitwiseapp.strategies;

import java.util.List;

import com.example.splitwiseapp.models.Expense;

public interface SettleUpStrategy {
    List<Expense> settleUp(List<Expense> expenses);
}
