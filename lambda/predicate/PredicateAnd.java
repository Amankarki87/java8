package lambda.predicate;

import java.util.function.Predicate;

public class PredicateAnd {
    public static void main(String[] args) {
        Person person = new Person("AJK",20);
        Predicate<Person> greaterThanEighteen = (p) -> p.age > 18;
        Predicate<Person> lessThanSixty = (p) -> p.age < 60;
        Predicate<Person> predicate = greaterThanEighteen.and(lessThanSixty);
        boolean eligible = isPersonEligibleForMembership(person,predicate);
        System.out.println("Person is eligible for membership: " + eligible);
    }

    static boolean isPersonEligibleForMembership(Person person, Predicate<Person> predicate){
        return predicate.test(person);
    }
}
