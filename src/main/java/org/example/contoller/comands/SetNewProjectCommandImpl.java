package org.example.contoller.comands;

import org.example.entety.Project;
import org.example.entety.Task;
import org.example.patterns.command.Command;

import java.util.ArrayList;
import java.util.List;

import static org.example.CommandMenu.department;

public class SetNewProjectCommandImpl implements Command {
    @Override
    public void execute() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Task #11"));
        tasks.add(new Task("Task #22"));

        Project project = new Project("New main project", tasks);

        System.out.println("Old project - " + department.getProject());
        department.setProject(project);
        System.out.println("New project - " + department.getProject());
    }
}
