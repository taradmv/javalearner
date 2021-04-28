import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Person {

    private String name;
    private int phoneNumber;
    private String emailAddress;
    private Address address = new Address();

    public Person(String myName, int myPhoneNumber, String myEmailAddress) {
        String name = myName;
        int phoneNumber = myPhoneNumber;
        String emailAddress = myEmailAddress;
        System.out.println("name: " + name);
        System.out.println("phone number: " + phoneNumber);
        System.out.println("email address: " + emailAddress);
    }

    static void PurchaseParkingPass() {

    }
}