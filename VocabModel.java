
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author s235065
 */
public class VocabModel {
    Connection connection;
    Statement statement;
    ResultSet resultset;
    VocabController control;
    
    
    public void connenctDB(){
    
    }
    
    public void closeDB(){
    
    }
    
    public boolean add(String entry, String meaning){
        return true;
    }
    
    public boolean delete(String entry){
        return true;
    }
    
    public String lookup(String entry){
        return "";
    }
}
