import java.util.Scanner;

public class Feature2ver2 {
    static void maxArray2() {
        int a, max, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of numbers to check: ");
        a = sc.nextInt();
        int number[] = new int[a];

        for (int i = 0; i < a; i++) {
            c = sc.nextInt();
            number[i] = c;
        }
        max = number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("Max of array ="+ max);
    }
}