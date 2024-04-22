package lambda.predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {
        Person person = new Person("Aman",26);
        Predicate<Person> predicate = p -> p.age > 18;

        boolean eligible = isPersonEligibleForVoting(person,predicate);
        System.out.println("Person is eligible for voting" + eligible);
    }

    static boolean isPersonEligibleForVoting(Person person, Predicate<Person> predicate) {
        return predicate.test(person);
    }

}

