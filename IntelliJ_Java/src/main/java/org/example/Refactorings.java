/*
OPTIONAL CHALLENGE: Keyboard only!
 */
package org.example;

import java.time.DayOfWeek;
import java.util.List;

public class Refactorings {

    // Remove the "List" suffixes (numbers, names, etc.) all at once using multiple cursors.
    final List<Integer> numbersList = List.of(1, 2, 3);
    final List<String> namesList = List.of("Jack", "John", "Jim", "Joe");
    final List<DayOfWeek> weekendDaysList = List.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);

    public static void examples() {
        // Rename.
        var renameMe = "I want to be named `iHaveBeenRenamed`";
        System.out.println(renameMe);

        // Extract a method.
        var answer = 42;
        System.out.println(answer);

        // Inline variable.
        var inlineMe = 1;
        var three = inlineMe + 2;
        System.out.println(three);
    }

    /**
     * Move this method to "QuickActions".
     */
    public static void moveMe() {
        System.out.println("I feel out of place!");
    }
}
