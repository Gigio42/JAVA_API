package com.app;

import com.app.models.Task;
import com.app.controllers.TaskController;

public class Main {
    public static void main(String[] args) {
        TaskController taskController = new TaskController();

        Task task = new Task();
        task.setNome("Learn Java");
        task.setDescricao("Learn Java to be able to create applications");
        task.setDataCriacao("2021-09-01");
        task.setDataConclusao("");
        task.setConcluido(false);

        taskController.create(task);

        System.out.println("Funcionou carai!");
    }
}