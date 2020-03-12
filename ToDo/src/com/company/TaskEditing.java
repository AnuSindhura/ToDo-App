package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskEditing {
    List<DisplayTemp> toDoList;
    int taskNo = 1;

    //constructor
    public TaskEditing() {
        toDoList = new ArrayList<DisplayTemp>();

    }

    // In Progress
    public void addList(DisplayTemp objIo) {
        int taskNumber = 1;
        int arraySize = toDoList.size();

        if (taskNumber == arraySize) {
            toDoList.add(taskNumber, objIo);
        }
        System.out.println(" The arry is ready");
    }

    // This methos reads the file and list in terminal
    public void readTaskFromFile() throws IOException {
        FileReader fileReader = new FileReader(fileName "TaskEditing.txt");
        BufferedReader br1 = new BufferedReader(fileReader);
        String line = br1.readLine();
        while (line != null) {
            System.out.println(line);
            line = br1.readLine();
        }
        br1.close();
    }

    public void viewList() {
        for (DisplayTemp displayTemp : toDoList) {
            System.out.println("all tasks");
            System.out.println(displayTemp.category);
            System.out.println(displayTemp.taskDescription);
        }
    }
}

































