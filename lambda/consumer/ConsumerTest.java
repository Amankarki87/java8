package lambda.consumer;

import java.util.function.Consumer;

// Consumer are functional interface that takes in a parameter and do not produce anything.

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = s -> System.out.println(s);
        stringConsumer.accept("Hello World.");
        System.out.println(stringConsumer);
    }
}
