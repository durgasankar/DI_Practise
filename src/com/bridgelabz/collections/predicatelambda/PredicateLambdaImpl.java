package com.bridgelabz.collections.predicatelambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Implementation of lambda predicate with stream.
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-03-30
 */
public class PredicateLambdaImpl {

    public static void main(String[] args) {

        List<Person> personList = Stream.of(new Person(10, "Ramesh", "IN", "Karnataka"),
                new Person(30, "Durgasankar", "IN", "Goa"),
                new Person(20, "John", "USA", "New York"),
                new Person(55, "Mic", "USA", "Chicago"),
                new Person(20, "Stanley", "USA", "Alaska"),
                new Person(50, "Jack", "AUS", "Sydney"),
                new Person(40, "Chang", "CHI", "Wuhan")).collect(Collectors.toList());

//        Separate people based on country USA
        Predicate<Person> usPeopleOnly = person -> person.getCountryCode().equals("USA");
        System.out.println("USA people only :  " + personList.stream()
                .filter(usPeopleOnly)
                .collect(Collectors.toList()));

//        Adding more than one filter like country "USA" and state "New York"
        Predicate<Person> usPeopleStateNewYork = person -> person.getState().equals("New York");
        System.out.println("People with country : USA and state : New York" + personList.stream()
                .filter(usPeopleOnly.and(usPeopleStateNewYork))
                .collect(Collectors.toList()));

    }
}
