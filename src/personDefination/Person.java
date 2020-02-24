package personDefination;

import java.util.ArrayList;
import java.util.Objects;

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

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumberList(ArrayList<Long> numberList) {
        this.numberList = numberList;
    }

    private StringBuilder printContact() {
        StringBuilder stringBuilder = new StringBuilder();
        int k = 0;
        for (long i : numberList) {
            stringBuilder.append(i);
            k++;
            stringBuilder.append((k < numberList.size()) ? "," : "");

        }
        return stringBuilder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return firstName.compareTo(person.firstName) >= 1;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberList, firstName, lastName, email);
    }

    @Override
    public String toString() {
        return "-------- * -------- * -------- * --------" + "\n" +
                "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                (numberList.size() == 1 ? "Contact Number: " : "Contact Number(s): ") + printContact() + "\n" +
                "Email address: " + email + "\n" +
                "-------- * -------- * -------- * --------" + "\n";
    }


}
