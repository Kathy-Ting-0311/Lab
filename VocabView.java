/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author s235065
 */
public class VocabView {
    private VocabController control;
    private Scanner input = new Scanner(System.in);
    
    public void setController(){
    
    }
    
    
    public void processCommand(){
        boolean end = false;
        while (!end) {
            System.out.println("Please enter your command");
            System.out.print(">");
            String command = input.next();
            switch (command) {
                case "add":
                    doAdd();
                    break;
                case "lookup":  
                    doLookup();
                    break;
                case "delete":
                    doDelete();
                    break;
                case "exit":
                    end = true;
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
    
    public void doAdd(){
    
    }
    
    public void doDelete(){
    
    }
    
    public void doLookup(){
    
    }
    
    public void showMessage(String msg){
    
    }
}

