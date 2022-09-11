import java.util.Scanner;

public class Evennumber {
    static void evenNumber() {
        int a, b, find, c, d ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of numbers to check: ");
        a = sc.nextInt();
        int number[] = new int[a];
        for (int i = 0; i < a; i++) {
            b = sc.nextInt();
            number[i] = b;
        }
        d = 0;
        for (int i = 0; i < number.length; i++) {
            c = number[i];
            if (c % 2 == 0) {
                d = d + 1;
            }
        }
        System.out.println("Total number of even numbers:" + d);
    }
}