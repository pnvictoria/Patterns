package org.example.controller.command;

import org.example.controller.Command;

public class ExitCommandImpl implements Command {
    @Override
    public void execute() {
        System.exit(0);
    }
}
