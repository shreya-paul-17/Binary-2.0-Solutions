// WAP in Java to check if the letter 'e' is present in the word 'Umbrella'

public class checkLetter {
    public static void main(String[] args) {
        String str = "Umbrella";
        char ch, targetCharacter = 'e';
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if(targetCharacter == ch) {
                System.out.println("The letter is found in the given string");
                break;
            } 
        } 
    }
}
