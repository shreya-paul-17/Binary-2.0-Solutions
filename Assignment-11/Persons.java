// Use a private keyword for a variable and use setter and getter methods to initialize and print the values 

public class Persons {
    // Private variable
    private String name;
    private int age;

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        // Create an instance of Persons
        Persons person = new Persons();

        // Set values using setter methods
        person.setName("John Doe");
        person.setAge(30);

        // Get values using getter methods and print them
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

