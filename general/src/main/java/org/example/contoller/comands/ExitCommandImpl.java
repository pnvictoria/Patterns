package org.example.contoller.comands;

import org.example.patterns.command.Command;

public class ExitCommandImpl implements Command {
    @Override
    public void execute() {
        System.exit(0);
    }
}

