package streamsapi;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Streams API was introduced from version 8. it is part of the java.util.stream
 * package.
 * Provides a powerful and declarative way of precessing sequence of elements.
 * Also contains operations like filter, map, reduce etc.
 *
 * A stream can be defined as a sequence of elements that support aggregate
 * operations in a sequential or parellal manner.
 * A stream supports terminal operations and intermediary operations.
 * Terminal operation closes the stream once it is complete, eg: forEach()
 * Intermediary operations returns a new stream with the result of the previous
 * operation. eg: filter()
 */
public class WorkWithStreams {

    static Stream<Integer> getNumberStream() {
        return Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

    static Stream<String> getStringStream() {
        return Stream.of("John", "Jane", "Ashish", "Anmol", "Amritha");
    }

    public static void main(String[] args) {

        // Create a Stream with a set of integer values
        Stream<Integer> numbers = getNumberStream();
        Stream<String> names = getStringStream();

        // Print the elements in a stream
        Consumer<Integer> printNumbers = (val) -> System.out.print(val + " ");
        numbers.forEach(number -> System.out.print(number + " "));
        System.out.println();

        names.forEach(name -> System.out.print(name + " "));
        System.out.println();

        numbers = getNumberStream();
        Predicate<Integer> checkForEvenNumber = (number) -> number % 2 == 0;
        numbers.filter(checkForEvenNumber).forEach(printNumbers);
        System.out.println();

        // Checking for odd number
        numbers = getNumberStream();
        numbers.filter(num -> num % 2 != 0).forEach(num -> System.out.print(num + " "));


    }
}

