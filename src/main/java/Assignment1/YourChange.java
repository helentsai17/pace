package Assignment1;

import java.util.Scanner;

public class YourChange {
    public static void main(String[] args) {
        int number =0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number:");
        number = scan.nextInt();

        if (number <= 100) {
            int chan = 100 - number;
            System.out.println("the change is: "+chan);

            int quarter = (int)(chan/25);
            int left1 = chan%25;
            System.out.println(quarter+" Quarters");

            int dime = left1/10;
            int left2 = left1%10;
            System.out.println(dime+" Dimes");

            int nickel = left2/5;
            int left3 = left2%5;
            System.out.println(nickel +" Nickels");
            System.out.println(left3 +" Pennies");
        }else{
            System.out.print("purches error");
        }
    }

}

