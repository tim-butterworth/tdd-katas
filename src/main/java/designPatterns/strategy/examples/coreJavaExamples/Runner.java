package designPatterns.strategy.examples.coreJavaExamples;

import java.util.Optional;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        Optional.ofNullable("a string")
                .map(String::toUpperCase);

        Optional.<String>ofNullable(null)
                .map(String::toUpperCase);

        Stream<Integer> stream = Stream.of(1, 2, 3);

        // Functional interfaces/lambdas are strategy pattern
        stream.map((i) -> i * 5).forEach((i) -> System.out.println(i));
    }
}
