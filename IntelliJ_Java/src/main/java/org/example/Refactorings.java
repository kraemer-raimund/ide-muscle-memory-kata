/*
OPTIONAL CHALLENGE: Keyboard only!
 */
package org.example;

public class Refactorings {

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
