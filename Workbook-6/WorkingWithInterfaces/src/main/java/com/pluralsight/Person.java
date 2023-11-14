package com.pluralsight;

public class Person implements Comparable<Person> {
    private String firstName;

    private String lastName;

    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int compareTo(Person p) {
        int lastNameComparison = this.lastName.compareTo(p.getLastName());
        return lastNameComparison == 0 ? this.firstName.compareTo(p.getFirstName()) : lastNameComparison;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + " | " + age;
    }
}
