import java.util.Scanner;

public class Findvalue {
    static void findValue() {
        int a, b, find, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of numbers to check: ");
        a = sc.nextInt();
        int number[] = new int[a];
        for (int i = 0; i < a; i++) {
            b = sc.nextInt();
            number[i] = b;
        }
        System.out.print("Enter the value to be checked: ");
        c = sc.nextInt();

        for (int i = 0; i < number.length; i++) {
            if (c == number[i]) {
                d= i+1;
                System.out.println("number" + d);
            }
        }
    }
}
