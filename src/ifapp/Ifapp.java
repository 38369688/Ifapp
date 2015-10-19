/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifapp;

/**
 *
 * @author user
 */
public class Ifapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        fizzTest();
//        testTable2();
//        testTable3();
//        testDrawTriangle();
        testDrawRectangle();
    }

    private static void fizzTest() {
        System.out.println(NumberChecker.checkNumber(200));
        System.out.println(NumberChecker.checkNumber(129));
        for (int i = 5; i <= 25; i++) {
            System.out.println(i + ") " + NumberChecker.checkNumber(i));
        }

    }

    public static void testTable2() {
        NumberChecker.multiplyTable(25, 30, 4);

    }

    public static void testTable3() {
        NumberChecker.dividingTable(20, 25, 5.0);
    }

    public static void testDrawTriangle() {
        ShapePrinter.printTriangle(4);
    }
    
    public static void testDrawRectangle() {
        ShapePrinter.printRectangle(6);
    }

}
