package labSession2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int denomination[] = new int[size];
        for(int i=0; i<size; i++) {
            System.out.println("Enter the denomination");
            denomination[i] = sc.nextInt();
        }
        System.out.println("Enter the target price");
        int target = sc.nextInt();

    }
}
