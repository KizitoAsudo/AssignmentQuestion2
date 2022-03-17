/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignmentquestion2;

import java.util.Scanner;

/**
 *
 * @author Kizito Asudo
 */
public class AssignmentQuestion2 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner input=new Scanner(System.in);
        int ans;

        System.out.println("Unlabeled: \n");
        for (int i = 0; i >-1; i++) {
            System.out.println("Guess a number... any number: ");
            ans=input.nextInt();
            if (ans==3) {
                System.out.println("finally");

                break;
            } else {
                System.out.println("Here we go again...");

            }

        }

        System.out.println("Labeled: \n");
        labeled L=new labeled();
        labeled.Meth();
    }
    
}
