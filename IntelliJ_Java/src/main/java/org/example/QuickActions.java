/*
OPTIONAL CHALLENGE: Keyboard only!
 */
package org.example;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

// Replace me with Javadoc.
// To access the context actions, press "Alt + Enter" or "Option + Enter".
public class QuickActions {

    // Remove unused variable.
    int asdf = 42;

    // Make immutable and initialize in constructor.
    String name;

    // Replace me with a ...
    // ... block comment.

    public void example() {

        // Replace with guard clause (early return).
        if (4 < 7) {
            // Flip the operands.
            // (Tip: Type "flip" while the list of context actions is open.)
            var flip = 42 + 1337;

            // Flip the arguments.
            var formatted = String.format("%s, %s", "second argument", "first argument");

            // Simplify constant expression.
            var four = 2 + 2;

            // Invert the if statement so that the positive condition comes first.
            if (!LocalTime.now().isBefore(LocalTime.of(12, 0))) {
                System.out.println("Good afternoon!");
            } else {
                System.out.println("Good morning!");
            }

            // Add braces.
            if ("answer".equals("42"))
                System.out.println("obviously");

            // Simplify the expression.
            var absolutelyTrue = true == true;

            // Replace for loop with forEach method call.
            var items123 = List.of(1, 2, 3);
            for (var i : items123) {
                System.out.println(i);
            }

            // Replace for loop with stream.
            List<Integer> numbers = List.of(3, 6, 8, 9, 11, 14);
            List<Integer> evenNumbers = new ArrayList<>();
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    evenNumbers.add(number);
                }
            }

            // Replace non-conditional StringBuilder with simple string expression.
            // Discuss which version is more readable and why there's no difference
            // in performance.
            var couldSimplyBeJoined = new StringBuilder();
            couldSimplyBeJoined.append("It is ");
            couldSimplyBeJoined.append(LocalTime.now());
            couldSimplyBeJoined.append(" o'clock. Today is ");
            couldSimplyBeJoined.append(LocalDate.now().getDayOfWeek());
            couldSimplyBeJoined.append(", ");
            couldSimplyBeJoined.append(LocalDate.now());
            System.out.println(couldSimplyBeJoined);

            // Format with one argument per line.s
            var longArguments = List.of("Some quite long string", "another decently long string", "and another one");

            // Format on a single line.
            var shortArguments = List.of(
                    "Short",
                    "also",
                    "this as well"
            );
        }
    }
}
