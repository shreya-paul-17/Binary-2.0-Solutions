// WAP in Java to reverse a string without using the inbuilt method

public class reversedString {
    public static void main(String[] args) {
        String str = "Hello", nstr = "";
        char ch;

        System.out.println("Original String: "+str);
        
        for(int i=0; i<str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }

        System.out.println("Reversed String: "+nstr);
    }        
}
