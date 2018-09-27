package learn.java;

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
        Person p2 = new Person();
        p2.setPersonId("101");
        p2.setFirstName("Man");
        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        System.out.println(persons.stream().collect(Collectors.toMap(Person::getPersonId, t -> t)));

    }
}
