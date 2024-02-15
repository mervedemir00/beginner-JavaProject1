package com.mycompan.bankproject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class first {
 
    private int idnumber;
    private int password;
    
    
  public int getidnumber(){
      return idnumber;
  }
    public void setidnumber(int idnumber){
        this.idnumber=idnumber;
    }
    
    
    public int getpassword(){
        return password;
    }
    
    public void setpassword(int password){
        this.password=password;
    }
    
    
    public boolean controlMethod(int gidnumber, int gpassword){
        
        int trueidnumber=987654;
        int truepassword=123789;
        
        
        return (trueidnumber==gidnumber && truepassword==gpassword);
     
    }    
}
