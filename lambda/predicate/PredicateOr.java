package lambda.predicate;

import java.util.function.Predicate;

public class PredicateOr {
    public static void main(String[] args) {
        NewPerson person = new NewPerson("AMAN",20,20);
        Predicate<NewPerson> greaterThanSixty = (p) -> p.age > 60;
        Predicate<NewPerson> serviceMoreThanThirty = (p) -> p.yearsOfService > 30;
        Predicate<NewPerson> predicate  = greaterThanSixty.or(serviceMoreThanThirty);
        boolean eligible = isPersonEligibleForRetirement(person,predicate);
        System.out.println("Is person eligible" + eligible);
    }

    static boolean isPersonEligibleForRetirement(NewPerson person, Predicate<NewPerson> predicate){
        return predicate.test(person);
    }
}

class NewPerson {
    String name;
    int age;
    int yearsOfService;

    NewPerson(String name, int age, int yearsOfService){
        this.name = name;
        this.age = age;
        this.yearsOfService = yearsOfService;
    }
}
