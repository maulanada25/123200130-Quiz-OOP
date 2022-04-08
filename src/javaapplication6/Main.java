/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author MYWINDOWS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y=1, writing, coding, interview;
//        char[] name;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("REGISTRATION FROM PT. JUAN");
        System.out.println("1. Android Development");
        System.out.println("2. Web Development");
        System.out.print("Choose form type : ");
        x = input.nextInt();
        
        if(x==1){
            System.out.println("\nREGISTRATION FORM");
            System.out.print("Input Student Number : ");
            String nim = input.next();
            input.nextLine();
            System.out.print("Input Name : ");
            String name = input.nextLine();
            System.out.print("Input Writing Exam Score : ");
            writing = input.nextInt();
            System.out.print("Input Coding Test Score : ");
            coding = input.nextInt();
            System.out.print("Input Interview Test Score : ");
            interview = input.nextInt();
//            y = 1;
            while(y!=3){
                System.out.println("\nMenu");
                System.out.println("1. Edit");
                System.out.println("2. Output");
                System.out.println("3. Exit");
                System.out.print("Choose : ");
                y = input.nextInt();

                if(y==1){
                    System.out.println("\nEDIT FORM");
                    System.out.print("Input Writing Exam Score : ");
                    writing = input.nextInt();
                    System.out.print("Input Coding Test Score : ");
                    coding = input.nextInt();
                    System.out.print("Input Interview Test Score : ");
                    interview = input.nextInt();
                    y = 1;
                }
                else if(y==2){
                    Android andro = new Android(name,writing,coding,interview);
                    
                    System.out.println("\nFinal Score : " + andro.finalScore());
                    if(andro.finalScore()>= 85){
                        System.out.println("INFORMATION : SUCCESS");
                        System.out.println("Congratulations to " + name + " has been accepted as Android Staff");
                    }else{
                        System.out.println("INFORMATION : FAILED");
                        System.out.println("Sorry to " + name + ", you are not accepted as Android Staff");
                    }
                }
            }
        }else if(x==2){
            System.out.println("\nREGISTRATION FORM");
            System.out.print("Input Student Number : ");
            String nim = input.next();
            input.nextLine();
            System.out.print("Input Name : ");
            String name = input.nextLine();
            System.out.print("Input Writing Exam Score : ");
            writing = input.nextInt();
            System.out.print("Input Coding Test Score : ");
            coding = input.nextInt();
            System.out.print("Input Interview Test Score : ");
            interview = input.nextInt();
//            y = 1;
            while(y!=3){
                System.out.println("\nMenu");
                System.out.println("1. Edit");
                System.out.println("2. Output");
                System.out.println("3. Exit");
                System.out.print("Choose : ");
                y = input.nextInt();

                if(y==1){
                    System.out.println("\nEDIT FORM");
                    System.out.print("Input Writing Exam Score : ");
                    writing = input.nextInt();
                    System.out.print("Input Coding Test Score : ");
                    coding = input.nextInt();
                    System.out.print("Input Interview Test Score : ");
                    interview = input.nextInt();
                    y = 1;
                }
                else if(y==2){
                    WebDev web = new WebDev(name,writing,coding,interview);
                    System.out.println("\nFinal Score : " + web.finalScore());
                    if(web.finalScore()>= 85){
                        System.out.println("INFORMATION : SUCCESS");
                        System.out.println("Congratulations to " + name + " has been accepted as Web Developer");
                    }else{
                        System.out.println("INFORMATION : FAILED");
                        System.out.println("Sorry to " + name + ", you are not accepted as Web Developer");
                    }
                }
            }
        }
    }
    
}
