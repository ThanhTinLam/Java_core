import java.util.Scanner;

public class Sum {
    static void sumArray(){
        int a,b, sum,c ;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of numbers to check: ");
        a = sc.nextInt();
        int number[]= new int [a];
        for( int i=0; i<a; i++){
            b = sc.nextInt();
            number[i]=b;
        }
        sum = number[0];
        for( int i= 0; i<number.length; i++){
            sum = sum +number[i];
        }
        System.out.print("Sum of array= "+ sum);
    }
}
