/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.todolist;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author YiğitÇELİK
 */
public class UserInterFace {
    
    private TodoList list;
    private Scanner scanner;
    
    public UserInterFace(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() throws IOException{
        while(true){
            
            System.out.println("Command:");
            String command = scanner.nextLine();
            
            if(command.equalsIgnoreCase("stop")){
                break;
            }
            if(command.equalsIgnoreCase("add")){
                String task = this.scanner.nextLine();
                this.list.add(task);
            }
            if(command.equalsIgnoreCase("list")){
                list.print();
            }
            if(command.equalsIgnoreCase("remove")){
                int id = this.scanner.nextInt();
                list.remove(id);
            }  
      }
    }
   }

