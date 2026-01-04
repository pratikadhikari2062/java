package a_basic_program_java;

import java.util.Scanner;

public class d_two_number_user_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of a ");
        int a = sc.nextInt();
        System.out.println("Enter the number of b ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum = " +a+ "And" +b+ "=" +sum);
        sc.close();
    }
}
