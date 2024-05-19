// WAP in Java to sort a string alphabetically

import java.util.Arrays;

public class sortString {
    public static void main(String[] args) {
        String str = "shreya"; //Input string str
        char array[] = str.toCharArray(); //Converting string into char array
        Arrays.sort(array);//Now sort the array using array.sort() method without passing any comparator 
        str = new String(array);//Making the string from the array
        System.out.println("The sorted array: "+str);
    }
}
