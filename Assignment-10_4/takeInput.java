// Write a simple program in Java to take a string input from the user

import java.util.*;

public class takeInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        
        String str = sc.nextLine();
        sc.close();

        System.out.println("The given string: "+str);
    }
}