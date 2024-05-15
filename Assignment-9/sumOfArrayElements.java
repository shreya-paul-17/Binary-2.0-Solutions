// A Java program to calculate the sum of all elements in an integer array

public class sumOfArrayElements {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            sum = sum + arr[i];
        } 
        System.out.println("The sum of the array elements in the integer array:"+sum);
    }
}


