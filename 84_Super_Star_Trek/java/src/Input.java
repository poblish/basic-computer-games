import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Predicate;

public class Input {
    final static String YES_NO_REMINDER = "(ANSWER YES OR NO)";
    final static Predicate<String> YES_NO_CHECKER = i -> isYes(i) || isNo(i);

    static String inputString(Predicate<String> validator, String reminder) {
        while (true) {
            try {
                var input = new Scanner(System.in).nextLine();
                if (validator.test(input)) {
                    return input;
                }
            } catch (InputMismatchException e) {
                // Ignore
            }
            System.out.println(reminder);
        }
    }

     static boolean isYes(String s) {
        if (s == null) {
            return false;
        }
        var uppercase = s.toUpperCase();
        return uppercase.equals("Y") || uppercase.equals("YES");
    }

     static boolean isNo(String s) {
        if (s == null) {
            return false;
        }
        var uppercase = s.toUpperCase();
        return uppercase.equals("N") || uppercase.equals("NO");
    }
}
