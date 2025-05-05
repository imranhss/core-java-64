/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testexception;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        try {

            System.out.println("Enter 1st Number ");
            int n1 = s.nextInt();
            System.out.println(n1);

        } catch (Exception e) {

            System.out.println(e);
        }

    }

}
