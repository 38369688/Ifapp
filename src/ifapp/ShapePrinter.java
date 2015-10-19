/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifapp;

import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class ShapePrinter {

    public static void printTriangle(int size) {
        for (int line = 1; line <= size; line++) {
            for (int star = 0; star < line; star++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void printRectangle(int size) {
        String word = JOptionPane.showInputDialog("What type of symbol");
        for (int line = 1; line <= size; line++) {
            for (int star = 0; star < size; star++) {
                System.out.print(word);

            }

            System.out.println("");
        }
    }

  
}
