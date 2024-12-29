package com.example.splitwiseapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ScopeMetadata;

import com.example.splitwiseapp.commands.CommandExecutor;
import com.example.splitwiseapp.commands.SettleUpUserCommand;

import java.util.Scanner;

@SpringBootApplication
public class SplitwiseApplication {
    @Autowired
    private static CommandExecutor commandExecutor;

    public static void main(String[] args) {
        SpringApplication.run(SplitwiseApplication.class, args);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.next();

            commandExecutor.execute(input);
        }
    }

}

/*

Settle Up requirement


Controller -> Service -> Repository

SettleUpController
SettleUpService
 */
