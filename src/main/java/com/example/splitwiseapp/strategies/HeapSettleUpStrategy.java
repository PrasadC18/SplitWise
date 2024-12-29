package com.example.splitwiseapp.strategies;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.splitwiseapp.models.Expense;

import java.util.List;

@Component
public class HeapSettleUpStrategy implements SettleUpStrategy {
    @Override
    public List<Expense> settleUp(List<Expense> expenses) {
        //TODO
        return null;
    }
}
