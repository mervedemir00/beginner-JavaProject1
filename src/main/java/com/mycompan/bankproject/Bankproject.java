/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompan.bankproject;
import java.util.Scanner;
/**
 *
 * @author merve
 */
public class Bankproject {

    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
       first a = new first();
       
       
      
       
     System.out.println("Please enter your id number");
       
     
     int idnumber= scanner.nextInt();
     
     a.setidnumber(idnumber);
     
        System.out.println("Please enter yout password");
     
     int password=scanner.nextInt();
     
     a.setpassword(password);
     
     
     
     
     boolean verificationResult=a.controlMethod(idnumber, password);
             
      if(verificationResult){
            System.out.println("Login successful");
        }
        else{
            System.out.println(" ID number or password is incorrect");
        }
     
    }
}
