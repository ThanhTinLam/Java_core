import java.util.Scanner;

public class Assignment {
    static void integer() {
        //public static void main(String[] args){
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number:");
        x = sc.nextInt();
        if (x > 0) {
            System.out.print("This is integer number");
        } else {
            System.out.print("This is negative integer number");
        }
    }

    static void numbertoletter() {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a integer number:");
        x = sc.nextInt();
        if (x < 10) {
            switch (x) {
                case 1:
                    System.out.print("one");
                    break;
                case 2:
                    System.out.print("two");
                    break;
                case 3:
                    System.out.print("three");
                    break;
                case 4:
                    System.out.print("four");
                    break;
                case 5:
                    System.out.print("five");
                    break;
                case 6:
                    System.out.print("six");
                    break;
                case 7:
                    System.out.print("seven");
                    break;
                case 8:
                    System.out.print("eight");
                    break;
                case 9:
                    System.out.print("nine");
                    break;
            }
        } else {
            System.out.print("You should go tot school");
        }
    }

    static void Pytago() {
        float x, y, z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the first number:");
        x = sc.nextFloat();
        System.out.print("Type the second number:");
        y = sc.nextFloat();
        System.out.print("Type the third number:");
        z = sc.nextFloat();
        if (x * x == y * y + z * z) {
            System.out.print("These are the 3 sides of a triangle");
        } else if (y * y == x * x + z * z) {
            System.out.print("These are the 3 sides of a triangle");
        } else if (z * z == x * x + y * y) {
            System.out.print("These are the 3 sides of a triangle");
        } else {
            System.out.print("These are not the 3 sides of a triangle");
        }
    }

    static void Triangle() {
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the first number:");
        a = sc.nextFloat();
        System.out.print("Type the second number:");
        b = sc.nextFloat();
        System.out.print("Type the third number:");
        c = sc.nextFloat();
        if (a + b > c) {
            if (a + c > b) {
                if (b + c > a) {
                    System.out.print("These are the 3 sides of a triangle");
                } else {
                    System.out.print("These are not the 3 sides of a triangle");
                }

            } else {
                System.out.print("These are not the 3 sides of a triangle");
            }
        } else {
            System.out.print("These are not the 3 sides of a triangle");
        }

    }

    static void checkStudentCode() {
        String a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type the student code:");
        a = sc.nextLine();
        if (a.matches("B\\d{7}")) {
            System.out.print("This is a student code");
        } else {
            System.out.print("undefined");
        }
    }

    static void sumInteger() {
        int a, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a integer:");
        a = sc.nextInt();
        for (int i = 0; i < a; i = i + 2) {
            sum += i;
        }
        System.out.print(sum);
    }

    static void mutiplyInteger() {
        int a, result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number:");
        a = sc.nextInt();
        for (int b = 1; b <= 20; b += 1) {
            result = a * b;
            System.out.println(result);
        }

    }

    static void primeNumber() {
        int a, d;
        boolean prime = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number smaller than 1000:");
        a = sc.nextInt();
        for (int b = 2; b < a; b += 1) {
            prime = true;
            for (int c = 2; c < b; c += 1) {
                if (b % c == 0) {
                    prime = false;
                }
            }
            if (prime == true) {
                System.out.println(b);
            }
        }
    }

    static void Fabonacci() {
        int a,b, n,sum,i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Type a number smaller than 20:");
        n = sc.nextInt();
        a=1;
        b=1;
        sum=0;
        for(i=1;i<=n;i++){
            if(i==1||i==2){
                sum+=1;
            }else{
                int c=a+b;
                a=b;
                b=c;
                sum=c;
            }
        }
        System.out.print(sum);

    }
}









