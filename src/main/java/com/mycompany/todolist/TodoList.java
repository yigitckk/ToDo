/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.todolist;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import java.util.ArrayList;

/**
 *
 * @author YiğitÇELİK
 */
public class TodoList {
    ArrayList<String> list = new ArrayList();
    public TodoList(){
        
    }
    
    
    
    public void add(String task) throws IOException{
        list.add(task);
        
    }
    
    public void print() throws IOException{
        int number = 1;
        
        for(int i=0; i<list.size(); i++){
            System.out.println( number + ":" + list.get(i));
           
            
            number++;
        }
        
    }
    
    public void remove(int numb){
        list.remove(numb-1);
        
    }
    
    
    
    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        TodoList list = new TodoList();
        
        list.add("hey");
        list.add("yo");
        
        
       
        list.print();
        UserInterFace ui = new UserInterFace(list, scanner);
        ui.start();
        
        
    }
}
