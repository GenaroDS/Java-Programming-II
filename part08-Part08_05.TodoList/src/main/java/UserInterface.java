/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author -G
 */
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner){
        this.scanner = scanner;
        this.list = list;
    }

    public void start(){
        while(true){
            System.out.print("Command: ");
            String command = scanner.nextLine();
            if (command.equals("add")){
                System.out.print("To add: ");
                String toAdd = scanner.nextLine();
                this.list.add(toAdd);
            }
            if (command.equals("remove")){
                System.out.print("Which one is removed? ");
                int toRemove = Integer.parseInt(scanner.nextLine());
                this.list.remove(toRemove);
            }
            if (command.equals("list")){
                this.list.print();
            }
            if (command.equals("stop")) {
                break;
            }
        }
    }
}