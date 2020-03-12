// implementing the user interface.

package com.company;
import java.util.Scanner;

public class DisplayTemp {
    Scanner userInput;
    String category;
    String taskDescription;

    // constructor of the class input
    public DisplayTemp(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Task Description");
        taskDescription = userInput.nextLine();
        System.out.println("Enter the category of the task");
        category = userInput.nextLine();
    }
}

