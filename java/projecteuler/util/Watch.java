package projecteuler.util;

import java.time.LocalDateTime;
import java.util.function.Function;

import static java.lang.IO.println;
import static java.time.Duration.*;

public class Watch {
    public static <T> void timed(Function<T, String> function, T input) {
        var start = LocalDateTime.now();
        println("Execution started at: " + start);
        println("Result: " + function.apply(input));
        var end = LocalDateTime.now();
        println("Execution completed at: " + end);
        println("Execution time: " + between(start, end).toMillis() + " ms.");
    }
}
