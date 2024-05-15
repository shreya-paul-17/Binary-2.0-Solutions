// A program to demonstrate method overloading with 3 different parameters

public class methodOverloading {
    static int sum(int a, int b, int c){
        return a+b+c;
    }
    static double sum(double a, double b, double c){
        return a+b+c;
    }
    public static void main(String[] args) {
        int result1 = sum(10, 20, 30);
        double result2 = sum(10.5, 20.4, 30.6);

        System.out.println(" Summation of the integer numbers: "+result1);
        System.out.println(" Summation of the double numbers: "+result2);
    }
}
