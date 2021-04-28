import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {

    private String name;
    private int phoneNumber;
    private String emailAddress;
    private Address address = new Address();

    public Person(String name, int phoneNumber, String emailAddress) {
        String fName = name;
        int phNumber = phoneNumber;
        String eAddress = emailAddress;
        System.out.println("name: " + fName);
        System.out.println("phone number: " + phNumber);
        System.out.println("email address: " + eAddress);
    }

    static void PurchaseParkingPass() {

    }
}