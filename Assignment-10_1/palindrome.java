// WAP in Java to check whether the given string is palindrome or not

public class palindrome {
 public static void main(String[] args) {
    String str = "Madam", nstr = "";
    char ch;
    for(int i=0; i<str.length(); i++){
        ch = str.charAt(i);
        nstr = ch + nstr;
    }
    if(str.toLowerCase().equals(nstr.toLowerCase())) {
        System.out.println("The given string is palindromic");
    } else {
        System.out.println("The given string is not palindromic");
    }
 }   
}
