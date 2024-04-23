package lambda.supplier;

import java.util.function.IntSupplier;
import java.util.function.Supplier;


// Suppplier is an interface that does not take in any argument and produces a value when the get() function is invoked.

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Person> supplier = () -> new Person("Alex",23);
        System.out.println("Supplier is" +supplier.get());

        // Integer supplier
        IntSupplier intSupplier = () -> (int)(Math.random() * 10);
        System.out.println(intSupplier.getAsInt());
    }
}
