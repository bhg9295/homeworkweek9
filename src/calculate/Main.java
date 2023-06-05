package calculate;

import java.util.Scanner;

public class Main  extends Calculator{
    public static void main(String[] args) {


Scanner scanner = new Scanner(System.in);
boolean repeat = true;
     while (repeat)  {
            System.out.println("Enter First Number:");
            int num1 = scanner.nextInt();
            System.out.println("Enter Second Number:");
            int num2 = scanner.nextInt();
            System.out.println("Please enter one of symbol +,-,*,/:");
            char symbol = scanner.next().charAt(0);

            Main cal = new Main();
            cal.calculateResult(num1, num2, symbol);
            System.out.println("Would you like todo more calculation plese enter y or n :");
            char continueProcess = scanner.next().charAt(0);
            if (continueProcess == 'y' || continueProcess == 'Y') {
                repeat = true;

            } else {
                repeat = false;
            }


        }

    }
}
