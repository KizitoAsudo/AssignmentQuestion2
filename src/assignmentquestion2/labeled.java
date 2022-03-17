/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentquestion2;

import java.util.Scanner;

/**
 *
 * @author Kizito Asudo
 */
public class labeled {
    static void Meth() {
        Scanner input=new Scanner(System.in);
        int ans2;
        int ans;


        outer:
        for (int i = 0; i >-1; i++) {
            System.out.println("Outer loop");

            inner:
            for (int j = 0; j >-1; j++) {
                System.out.println("Guess a number... any number: ");
            ans=input.nextInt();
            if (ans==3) {
                System.out.println("finally");

                break inner;
            } else {
                System.out.println("Here we go again...");

            }
            }
            System.out.println("Inner loop terminated \n Enter 0 to terminate outer loop");
            ans2=input.nextInt();
            if (ans2==0) {
                break outer;
            }
            System.out.println("Outer loop not terminated");

            

        }
      }
}