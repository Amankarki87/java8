package lambda.predicate;
import java.util.function.BiPredicate;

public class BiPredicateTest {
    public static void main(String[] args) {
        Person person = new Person("Aman",25);

        boolean eligible = isPersonEligibleForVoting(
                person,
                18,
                (p,minAge) -> {
                    return p.age > minAge;
                }
        );

        System.out.println("Person eligible for voting" + eligible);
    }

    static boolean isPersonEligibleForVoting(Person person, Integer minAge, BiPredicate<Person,Integer> predicate) {
        return predicate.test(person,minAge);
    }
}
