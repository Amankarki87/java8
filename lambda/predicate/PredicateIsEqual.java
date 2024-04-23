package lambda.predicate;

import java.util.function.Predicate;

public class PredicateIsEqual {
    public static void main(String[] args) {
        Predicate<String> predicate = Predicate.isEqual("Hello");
        System.out.println(predicate.test("Welcome!"));
    }
}
