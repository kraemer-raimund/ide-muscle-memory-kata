package org.example;

import java.time.LocalTime;

// Replace me with Javadoc.
// To access the context actions, press "Alt + Enter" or "Option + Enter".
public class QuickActions {

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

            // Invert the if statement so that the positive condition comes first.
            if (!LocalTime.now().isBefore(LocalTime.of(12, 0))) {
                System.out.println("Good afternoon!");
            } else {
                System.out.println("Good morning!");
            }

            // Add braces.
            if ("answer".equals("42"))
                System.out.println("obviously");
        }
    }
}
