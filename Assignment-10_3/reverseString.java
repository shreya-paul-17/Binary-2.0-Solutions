// WAP in Java to reverse a String

public class reverseString {
    public static void main(String[] args) {
        String str = "PWSKILLS", nstr = ""; //str->Assigning the given string, nstr->Taking an empty string
        char ch; 

        System.out.println("Original String: "+str);
        
        for(int i=0; i<str.length(); i++) {
            ch = str.charAt(i); //ch->Counting characters in a string at a specified index
            nstr = ch + nstr; //Forming the string by reversing the characters
        }
        
        System.out.println("Reversed String: "+nstr);
    }        
}
        

