package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DBConnection.getConnection();
        DBConnection.createTable("person");

        Person p1 = new Person("Sam", "Sharma", 25);
        Person p2 = new Person("Samar", "Sharma", 30);
        DBConnection.insertPerson(p1);
        DBConnection.insertPerson(p2);

        System.out.println("\nAll Persons:");
        List<Person> persons = DBConnection.getAllPerson();
        for (Person p : persons) {
            System.out.println(p);
        }

        System.out.println("\nPerson with ID 1:");
        Person person = DBConnection.getPersonbyId(1);
        System.out.println(person);

        System.out.println("\nDeleting person with ID 1:");
        DBConnection.deletePersonBYId(1);

        System.out.println("\nAfter Deletion:");
        persons = DBConnection.getAllPerson();
        for (Person p : persons) {
            System.out.println(p);
        }

        System.out.println("Updating person with ID 2:");
        Person updated = new Person("Rubez", "Mahajan", 20);
        DBConnection.updatePersonById(2, updated);

        System.out.println("\nAfter Update:");
        for (Person p : DBConnection.getAllPerson()) {
            System.out.println(p);
        }

        DBConnection.closeConnection();
    }
}
