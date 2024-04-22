package lambda.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Aman",25,"Nepal"));
        persons.add(new Person("Christina",26,"Nepal"));
        persons.add(new Person("karki",26,"Nepal"));
        persons.add(new Person("Amrit",26,"Nepal"));

        Collections.sort(persons,(p1,p2) -> p1.getName().compareTo(p2.getName()));

        for (Person person: persons) {
            System.out.println(person.getName());
        }

        // Output
        // Aman
        // Amrit
        // Christina
        // Karki
    }
}
