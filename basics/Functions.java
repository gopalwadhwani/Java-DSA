package basics;

import java.util.Scanner;

public class Functions {
    // Function 1
    public static void printMyName(String name) {
        System.out.println("name is" + name);
    }

    // funtion 2
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    // function 3
    public static int calculateProduct(int x, int y) {
        return x * y;
    }

    // function 4
    public static int printFactorial(int n) {
        int factorial = 1;
        ;

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.next();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter first number for product: ");
        int x = sc.nextInt();

        System.out.print("Enter second number for product: ");
        int y = sc.nextInt();

        System.out.print("Enter number for factorial: ");
        int n = sc.nextInt();
        printMyName(name);
        int sum = calculateSum(a, b);
        System.out.println("sum is:"+sum);

        System.out.println("product is:" + calculateProduct(x, y));
        System.out.println("Factorial of " + n + " is " + printFactorial(n));
        sc.close();
    }
}