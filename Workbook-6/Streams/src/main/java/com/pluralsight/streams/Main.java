package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name: ");
        String input = scanner.nextLine();

        List<Person> matchingPeople = new ArrayList<>();
        for (Person person : people) {
            if (person.getFirstName().equalsIgnoreCase(input) ||
                    person.getLastName().equalsIgnoreCase(input)) {
                matchingPeople.add(person);
            }
        }

        System.out.println("Matching names: ");
        for (Person person : people) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

        double averageAge = calculateAverageAge(people);
        System.out.println("Average age: " + averageAge);

        int oldestAge = oldestAge(people);
        System.out.println("Oldest person's age: " + oldestAge);

        int youngestAge = youngestAge(people);
        System.out.println("Youngest person's age: " + youngestAge);

    }

    public static List<Person> createPeopleList() {
        List<Person> people = new ArrayList<>();
        Person p1 = new Person("Tom", "Smith", 43);
        Person p2 = new Person("Stacy", "Pike", 23);
        Person p3 = new Person("Luis", "Pierce", 33);
        Person p4 = new Person("Diana", "Bradley", 26);
        Person p5 = new Person("Fred", "Hurley", 15);
        Person p6 = new Person("Liz", "Conway", 55);
        Person p7 = new Person("Erika", "Jacobs", 32);
        Person p8 = new Person("Hector", "Donnelly", 21);
        Person p9 = new Person("Raymond", "Potato", 28);
        Person p10 = new Person("Claudia", "Chase", 27);

        return people;
    }

    private static double calculateAverageAge(List<Person> people) {
        int totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }
        return (double) totalAge / people.size();
    }

    private static int oldestAge(List<Person> people) {
        int maxAge = Integer.MIN_VALUE;
        for (Person person : people) {
            if (person.getAge() > maxAge) {
                maxAge = person.getAge();
            }
        }
        return maxAge;
    }

    private static int youngestAge(List<Person> people) {
        int minAge = Integer.MAX_VALUE;
        for (Person person : people) {
            if (person.getAge() > minAge) {
                minAge = person.getAge();
            }
        }
        return minAge;
    }
}