// WAP in Java to delete all consonants from the given string "Hello, have a good day"

public class deleteConsonants {
    public static void main(String[] args) {
        String str = "Hello, have a good day", nstr="";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
                nstr = nstr + ch;
            }
        }
        System.out.println("The new string after deleting the consonants: "+nstr);
    }        
}
