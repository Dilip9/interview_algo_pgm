package org.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.nullable;

public class OptionalPgm {
    public static void main(String[] args) {
        // Optional is a container object which may or may not contain a non-null value.
        // If a value is present, isPresent() will return true and get() will return the value.
        // Additional methods that depend on the presence or absence of a contained value are provided, such as orElse()
        // (return a default value if value not present) and ifPresent() (execute a block of code if the value is present).
        // Optional is a value-based class; use of identity-sensitive operations (including reference equality (==),
        // identity hash code, or synchronization) on instances of Optional may have unpredictable results and should be avoided.
        // Optional is primarily intended for use as a method return type where there is a clear need to represent "no result,"
        // and where using null is likely to cause errors.
        // A Stream should not be used as a method return type where there is a clear need to represent "no result,"
        // if the method is intended to return a sequence of elements.
        // Use Optional instead of null as a return type for methods that may or may not return a value.
        // Use Optional instead of null as a field type where there is a clear need to represent "no result."
        // Use OptionalInt, OptionalLong, or OptionalDouble instead of null where there is a clear need to represent "no result"
        // for a primitive value.
        // Use Optional as a return type for factory methods that may or may not create an instance.
        // Use Optional as a return type for methods that may return a value that is computationally expensive to create.
        // Use Optional as a return type for methods that may return a value that is expensive to store.
        // Use Optional as a return type for methods that may return a value that is not always present.
        // Use Optional as a return type for methods that may return a value that is not always present, to represent errors.
        // Use Optional as a return type for methods that may return a value that is not always present, to represent errors, and
        // where the error is not exceptional.
        // Use Optional as a return type for methods that may return a value that is not always present, to represent errors, and
        // where the error is not exceptional, and the method is not expected to throw an exception.
        // Use Optional as a return type for methods that may return a value that is not always present, to represent errors, and
        // where the error is not exceptional, and the method is not expected to throw an exception, and the method is not expected
        // to throw a checked exception.
        // Use Optional as a return type for methods that may return a value that is not always present, to represent errors, and
        // where the error is not exceptional, and the method is not expected to throw an exception, and the method is not expected
        // to throw a checked exception, and the method is not expected to throw a checked exception that is a subclass of
        // RuntimeException.
        List<Integer> numbers = Arrays.asList(10, 25, 30, 5, 100, 45);
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println("Max value: " + max.get());
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println("Min value: " + min.orElse(-1));
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        System.out.println("Sum of numbers: " + sum.isPresent()); // true


    }

}
