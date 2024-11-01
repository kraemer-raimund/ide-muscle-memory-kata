/*
KEYBOARD ONLY!
 */
package org.example;

public class KeyboardMotions {

    // Reorder the lines.
    final int second = 2;
    final int first = 1;

    // Add a third one.
    final int one = 1;
    final int two = 2;

    // Jump back and forth *between* the "|" pipe characters.
    final String lorem = """
            Lorem |ipsum| dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor
            """;

    // Jump back and forth *around* the "|" pipe characters.
    final String ipsum = """
            |Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor|
            """;

    // Delete the section marked with "[]" brackets.
    final String dolor = """
            Lorem ipsum dolor sit amet, [consectetur adipiscing elit, ]sed do eiusmod tempor
            """;

    // Cut the section within "[]" brackets and paste it between <>.
    final String consectetur = """
            Lorem ipsum dolor sit amet, consectetur adipiscing elit, [sed do eiusmod tempor
            incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, ]quis nostrud
            exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure
            dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.
            <>
            """;
}
