package Assignment2;

import java.util.Random;
import java.util.Scanner;

public class MultiplicationGame {

    public static void main(String[] args) {
        System.out.println("enter -1 to logout the game");
        int stu = 0;
        while (stu != -1) {

            Random ran = new Random();
            int ran1 = Math.abs(ran.nextInt() % 10);
            int ran2 = Math.abs(ran.nextInt() % 10);

            System.out.print(ran1 + " X " + ran2 + " = ");

            Scanner scanner = new Scanner(System.in);
            stu = scanner.nextInt();
            if (stu != -1) {

                int awe = ran1 * ran2;

                while (stu != awe) {
                    System.out.println("No, please try again");
                    System.out.print(ran1 + " X " + ran2 + " = ");
                    stu = scanner.nextInt();
                }
                System.out.println("Very good");

            }
        }
    }
}
