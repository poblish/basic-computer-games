import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

import static java.util.stream.Collectors.joining;
import static java.util.stream.IntStream.range;

@SuppressWarnings("SpellCheckingInspection")
public class StarTrek {

    private final PrintStream out;

    public static void main(String[] args) {
        new Instructions().instruct(System.out);
    }

    public StarTrek(PrintStream out) {
        this.out = out;
    }
}