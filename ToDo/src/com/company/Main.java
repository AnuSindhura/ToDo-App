package com.company;

import jdk.jfr.Category;

import java.io.*;
import java.util.Scanner;

public class Main {
    // Welcome Message when the application is started.
    public void Welcome()
    {
        System.out.println(">> Welcome to the ToDoLy");
        System.out.println(">> You have x tasks todo and y tasks are done!");
        System.out.println(">> Pick an option:");
        System.out.println(">> (1) Show Task List (by date orc project)");
        System.out.println(">> (2) Add New Task");
        System.out.println(">> (3) Edit Task (update , mark as done, remove)");
        System.out.println(">> (4) Save and Quit");
        System.out.println(">> ");
    }

    // This is view, add, edit , delete the task
    public void userChoice() throws IOException
    {
        InputStreamReader ir2 = new InputStreamReader(System.in);
        BufferedReader br2 = new BufferedReader(ir2);
        System.out.println("please amke a choice between 1,2,3,4");

        int choice = Integer.parseInt(br2.readLine());
        if (choice ==1)
        {
            System.out.println("check the task");
            System.out.println("----------");
            System.out.println("Created Date: " +"|" + "Task Description: "+"|" +  " Category: "+" ");
            listTask();
            System.out.println("----------");
        }
        else if (choice==2)
        {
            System.out.println("provide name,details ");
            addTask();
        }
        else if (choice==3)
        {
            System.out.println("task number to edit ");
            editTask();
        }
        else
            System.out.println("save and quit");

    }
    public void addTask()
    {
        DisplayTemp displayTemp = new DisplayTemp();

        //object is stored in Arraylist and data in a file.
        FileAccess fileOutput = new FileAccess();
        fileOutput.accessFile(displayTemp);

        System.out.println("Task information is saved in the file");
    }

    public void listTask()
    {
        TaskEditing t1 = new TaskEditing();

        try
        {
            t1.readTaskFromFile();
        }
        catch ()
    }


}

