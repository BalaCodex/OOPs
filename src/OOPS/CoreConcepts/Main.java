package OOPS.CoreConcepts;

// 1. Abstraction using Abstract Class
abstract class Person {
    String name;
    int age;

    // 2. Constructor + this keyword
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method (must be overridden)
    abstract void work();

    // Concrete method
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// 3. Interface for multiple inheritance
interface Coder {
    void code();
}

// 4. Encapsulation - private fields + getters/setters
class Account {
    private String accountNumber;
    private double balance;

    public void setAccountNumber(String acc) {
        this.accountNumber = acc;
    }

    public void setBalance(double bal) {
        if (bal > 0) {
            this.balance = bal;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}

// 5. Inheritance + Polymorphism (Overriding) + super
class Developer extends Person implements Coder {
    String language;

    Developer(String name, int age, String language) {
        super(name, age); // super keyword
        this.language = language;
    }

    // Overriding abstract method
    void work() {
        System.out.println(name + " is developing software in " + language);
    }

    // From Interface
    public void code() {
        System.out.println("Coding in " + language);
    }

    // Static method
    static void welcome() {
        System.out.println("Welcome to the Developer Zone!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Class & Object
        Developer d1 = new Developer("Balu", 21, "Java");

        // Constructor + this
        d1.display();

        // Polymorphism (dynamic method dispatch)
        Person p = new Developer("Gokul", 22, "Python");
        p.work(); // Calls overridden method
        // Static method
        Developer.welcome();


        // Encapsulation
        Account acc = new Account();
        acc.setAccountNumber("12345");
        acc.setBalance(5000.75);

        System.out.println("Account No: " + acc.getAccountNumber());
        System.out.println("Balance: ₹" + acc.getBalance());

        // Interface usage
        d1.code();
    }
}
