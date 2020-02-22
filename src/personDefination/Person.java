package personDefination;

import java.util.ArrayList;

public class Person {
    ArrayList<Long> numberList = new ArrayList<>();
    private String firstName;
    private String lastName;
    private String email;

    public Person() {
    }

    public Person(String firstName, String lastName, String email, ArrayList<Long> numberList) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.numberList = numberList;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Long> getNumberList() {
        return numberList;
    }


}
