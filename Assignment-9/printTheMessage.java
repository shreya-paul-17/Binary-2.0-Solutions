// A Java program to create an object of an class which contain a method and call that class method in main method

class printMessage {
    void displayMessage() {
        System.out.println("Hello Java");
    }
}

public class printTheMessage {
    public static void main(String[] args) {
        printMessage obj = new printMessage();
        obj.displayMessage();
    }
}
