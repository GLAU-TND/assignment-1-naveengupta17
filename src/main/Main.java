package main;

import method.SearchMethod;
import personDefination.Person;
import singlyLinkedList.SinglyLinkedListDefination;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int flag = 1;
        SinglyLinkedListDefination<Person> linkesList = new SinglyLinkedListDefination<>();
        SearchMethod searchMethod = new SearchMethod();
        do {
            System.out.println("Welcome to Naveen's Contact App");
            System.out.println("Press 1 to add a new Contact");
            System.out.println("Press 2 to view all contacts");
            System.out.println("Press 3 to search for a contact");
            System.out.println("Press 4 to delete a contact");
            System.out.println("Press 5 to exit the programe");
            int choice = scanner.nextInt();
            scanner.nextLine();


        } while (flag == 1);


    }
}
