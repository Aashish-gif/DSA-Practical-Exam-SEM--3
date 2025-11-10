// SET A

// Q-1 Create a class Box with multiple constructor:
// No-argument
// One-argument
// Parameterized constructor
// Calculate and the print the volume

class Box {
    double length, width, height;

    Box() {
        length = 1;
        width = 1;
        height = 1;
    }

    Box(double side) {
        length = width = height = side;
    }

    Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }

    double volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(5);
        Box b3 = new Box(2, 3, 4);
        System.out.println("Volume (No-arg constructor): " + b1.volume());
        System.out.println("Volume (One-arg constructor): " + b2.volume());
        System.out.println("Volume (Parameterized constructor): " + b3.volume());
    }
}




// Q-2 Write a Java Programe to find the sum of all factors(divisor) of a given number
// Input:12
// Factor:1,2,3,4,6,12
// Output:28

import java.util.Scanner;

class SumOfFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        System.out.print("Factors: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nSum of factors: " + sum);
    }
}
