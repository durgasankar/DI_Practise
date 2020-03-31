package com.bridgelabz.collections.predicatelambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Implementation of lambda predicate with stream. map example using stream, filtering a string.
 * comparable interface.
 *
 * @author Durgasankar Mishra
 * @version 1.8
 * @created 2020-03-30
 */
public class PredicateLambdaImpl {


    public static void main(String[] args) {

        List<Person> personList = Arrays.asList(new Person(10, "Ramesh", "IN", "Karnataka"),
                new Person(30, "Durgasankar", "IN", "Goa"),
                new Person(20, "John", "USA", "New York"),
                new Person(55, "Mic", "USA", "Chicago"),
                new Person(20, "Stanley", "USA", "Alaska"),
                new Person(50, "Jack", "AUS", "Sydney"),
                new Person(40, "Chang", "CHI", "Wuhan"));

        List<Person> workerList = Arrays.asList(new Person(25, "Significance", "UGA", "Uganda"),
                new Person(30, "Raj", "IN", "Bangalore"),
                new Person(25, "Iss", "Pak", "Karachi"));

        List<Person> yahooWorkersList = Arrays.asList(new Person(10, "Sam", "AUS", "Melbourne"),
                new Person(25, "Zack", "RSA", "South Africa"));

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


//        Reduced map example using stream api. Calculate average age of the people
        System.out.println("GEt average age of the persons : " + personList.stream()
                .mapToInt(Person :: getAge)
                .average()
                .getAsDouble());

//         Reduced map example using stream api.and with filter Calculate average age of the people age greater than 30
        System.out.println("Get average age of the persons age above 30 : " + personList.stream()
                .mapToInt(Person :: getAge)
                .filter(value -> value > 30)
                .average()
                .getAsDouble());

//        Sorting and printing the person'S list using comparable interface
        Collections.sort(personList, (person1, person2) -> person1.getName().compareTo(person2.getName()));
        personList.forEach(System.out :: println);
        System.out.println("After sorting the person list using comparable interface" + personList);

//    List of String by using filter and printing

        System.out.println("filtering the name length greater than 5 characters and age less than 30 : " + personList.stream()
                .filter(person -> person.getName().length() > 5 && person.getAge() < 30)
                .collect(Collectors.toList()));

        /*********************************************************************************************************/
//        List of all 3 companies and their workers list embedded in one list.

        List<OfficeInfo> officeInfoList = Arrays.asList(new OfficeInfo("Blab", personList),
                new OfficeInfo("Google", workerList),
                new OfficeInfo("Yahoo", yahooWorkersList));

//        Suppose we need to collect information of all the companies which is just a simple parameter of a list we use map
        System.out.println("List of all companies : " + officeInfoList.stream()
                .map(OfficeInfo :: getOfficeName)
                .collect(Collectors.toList()));

       /*Suppose we want to collect name of all workers work in all companies then we have to use flatMap as
         transforming data from Stream<Stream<T>> to Stream<T>*/
        System.out.println("List of all workers working in all three companies : " + officeInfoList.stream()
                .flatMap(officeInfo -> officeInfo.getWorkersList()
                        .stream()
                        .map(Person :: getName))
                .collect(Collectors.toList()));

        System.out.println("Average age of all workers above age 25 and below age 50 in all industry : " + officeInfoList.stream()
                .flatMap(officeInfo -> officeInfo.getWorkersList()
                        .stream()
                        .map(Person :: getAge)
                        .filter(age -> age >= 25 && age <= 50)
                ).mapToInt(value -> value)
                .average()
                .getAsDouble());

    }


}
