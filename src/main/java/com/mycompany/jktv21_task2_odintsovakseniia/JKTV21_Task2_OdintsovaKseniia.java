/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.jktv21_task2_odintsovakseniia;

import static java.lang.Double.sum;
import static java.lang.Float.sum;
import static java.lang.Integer.sum;
import java.util.Scanner;


/**
 *
 * @author Admin
 */
public class JKTV21_Task2_OdintsovaKseniia {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
        System.out.print("Put three-digit number : ");
        int number = input.nextInt();
        
        System.out.println("Sum of digit-numbers : " + sumDigits(number));
        
    }
    public static int sumDigits(int number){
        int sum =0;
        while (number !=0){
            sum+= number %10;
            number /= 10;
            
        }
        return sum;
        
       

       }
  }
    

