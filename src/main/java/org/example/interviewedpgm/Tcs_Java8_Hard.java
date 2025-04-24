package org.example.interviewedpgm;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Tcs_Java8_Hard {

    public static Map<String, List<String>> groupContactsByType(List<Person> persons) {
        return persons.stream()
                .flatMap(person -> person.getContacts().stream()) // flatten all contacts
                .collect(Collectors.groupingBy(
                        Contact::getType,
                        Collectors.mapping(
                                Contact::getValue,
                                Collectors.collectingAndThen(
                                        Collectors.toSet(), // remove duplicates
                                        set -> set.stream()
                                                .sorted()
                                                .collect(Collectors.toList()) // sort alphabetically
                                )
                        )
                ));
    }

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Alice", Arrays.asList(
                        new Contact("email", "alice@gmail.com"),
                        new Contact("phone", "12345"),
                        new Contact("email", "alice.work@gmail.com")
                )),
                new Person("Bob", Arrays.asList(
                        new Contact("email", "bob@gmail.com"),
                        new Contact("phone", "12345") // duplicate number
                )),
                new Person("Charlie", Arrays.asList(
                        new Contact("phone", "67890"),
                        new Contact("email", "alice@gmail.com") // duplicate email from Alice
                ))
        );
        Map<String, List<String>> result = groupContactsByType(persons);

        result.forEach((type, values) -> {
            System.out.println(type + " -> " + values);
        });
    }


}

class Contact {
    private String type;   // e.g., email, phone
    private String value;

    public Contact(String type, String value) {
        this.type = type;
        this.value = value;
    }

    public String getType() { return type; }
    public String getValue() { return value; }
}

class Person {
    private String name;
    private List<Contact> contacts;

    public Person(String name, List<Contact> contacts) {
        this.name = name;
        this.contacts = contacts;
    }

    public List<Contact> getContacts() { return contacts; }
}
