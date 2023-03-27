package rikkei.academy;

import java.util.Scanner;

public class IllegalTriangleExceptionDemo {
//    private int a;
//    private int b;
//    private int c;
//
//    public Triangle() {
//    }
//
//    public Triangle(int a, int b, int c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter side length a: ");
            double side_a = scanner.nextDouble();
            System.out.println("Enter side length b: ");
            double side_b = scanner.nextDouble();
            System.out.println("Enter side length c: ");
            double side_c = scanner.nextDouble();

            if (side_a <= 0 || side_b <= 0 || side_c <= 0 || side_a + side_b <= side_c || side_a + side_c <= side_b || side_b + side_c <= side_a) {
                throw new IllegalTriangleException();
            }

            System.out.println("The lengths of the three sides of the triangle are: " + side_a + " ," + side_b + "," + side_c);
        } catch (IllegalTriangleException ex) {
            System.out.println("Lỗi: " + ex.getMessage());
        } catch (Exception ex){
            System.out.println("Lỗi: " + ex.getMessage());
        }
    }
}

class IllegalTriangleException extends Exception{
    public IllegalTriangleException(){
        super("Tam giác không hợp lệ! ");
    }
}