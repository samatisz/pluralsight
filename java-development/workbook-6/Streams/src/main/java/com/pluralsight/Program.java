package com.pluralsight;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> personList = createPeopleList();

        System.out.println("Enter a name to search: ");
        Scanner myScanner = new Scanner(System.in);
        String searchName = myScanner.nextLine();

        for (Person person : personList) {
            if (person.getFirstName().equalsIgnoreCase(searchName) ||
            person.getLastName().equalsIgnoreCase(searchName)) {

            }
        }
    }

       public static List<Person> createPeopleList() {
           List<Person> personList = new ArrayList<>();

           Person person1 = new Person("Ricky", "Shen", 20);
           Person person2 = new Person("Hongjoong", "Kim", 25);
           Person person3 = new Person("Yuta", "Nakamoto", 29);
           Person person4 = new Person("Mark", "Lee", 24);
           Person person5 = new Person("Eunkwang", "Seo", 33);
           Person person6 = new Person("Seonghwa", "Park", 26);
           Person person7 = new Person("Yejun", "Nam", 26);
           Person person8 = new Person("Eunho", "Do", 24);
           Person person9 = new Person("Peniel", "Shin", 32);
           Person person10 = new Person("Kun", "Qian", 29);

           return personList;
       }
}
