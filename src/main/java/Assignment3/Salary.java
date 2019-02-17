package Assignment3;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int hour = 0;

        while (hour != -1) {
            System.out.println("How many hours of work:");
            hour = scan.nextInt();
            System.out.println("tap -1 to exit.");

            int pay1;
            float pay2 = 0;
            if (hour != -1) {
                int doubleThePay = 0;

                pay1 = hour * 10;
                System.out.println("10 dollar per hour: " + pay1);

                while (doubleThePay != hour) {
                    pay2 = pay2 + (float) (0.1 * (Math.pow(2, doubleThePay)));
                    doubleThePay++;

                }
                System.out.println("0.1 dollar double every hours: " + pay2);
            }
        }
    }
}


