package a_basic_program_java;

import java.util.Scanner;

public class c_area_of_rectrangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length ");
        int i = sc.nextInt();
        System.out.println("Enter hignt");
        int h = sc.nextInt();
        int area = i*h;
        System.out.println("The area of rectrangle is "  +area + "unit. sqr");
        sc.close();

    }
    
}
