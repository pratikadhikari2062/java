package a_basic_program_java;

import java.util.Scanner;

public class b_user_input_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of a");
        int a = sc.nextInt();
        System.out.println("Enter the second number of b");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum of " + a +"and" + b + "=" +sum);
        sc.close();
    }
    
}
