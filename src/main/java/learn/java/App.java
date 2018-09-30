package learn.java;

import learn.java.entity.Address;
import learn.java.entity.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Person p1 = new Person();
        p1.setPersonId("101");
        p1.setFirstName("Aman");
        Address addr1 = new Address("69");
        p1.setPrimaryAddress(addr1);
        Person p2 = new Person();
        p2.setPersonId("101");
        p2.setFirstName("Man");
        Address addr2 = new Address("69");
        p2.setPrimaryAddress(addr2);
        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        //Duplicate key learn.java.entity.Person@16b98e56
        System.out.println(persons.stream().collect(Collectors.toMap(Person::getPersonId, t -> t)));
        //grouping by and then mapping to an association List
        System.out.println(persons.stream().collect(Collectors.groupingBy(Person::getPersonId,
                Collectors.mapping(Person::getPrimaryAddress, Collectors.toList()))));

    }
}
