package com.example.splitwiseapp.commands;

public interface Command {
    void execute(String input);

    boolean matches(String input);
}
