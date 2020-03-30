package com.bridgelabz.collections.predicatelambda;

/**
 * Model class for Person
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-03-30
 */
public class Person {

    private int age;
    private String name;
    private String countryCode;
    private String state;

    public Person(int age, String name, String countryCode, String state) {
        this.age = age;
        this.name = name;
        this.countryCode = countryCode;
        this.state = state;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
