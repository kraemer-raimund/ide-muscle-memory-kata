package org.example

// Replace me with a ...
// ... block comment.

fun main() {
    // Replace with guard clause (early return).
    if (4 < 7) {
        // Flip the operands.
        val flip = 42 + 1337

        // Flip the arguments.
        val formattedArguments = String.format("%s, %s", "second argument", "first argument")
        println(formattedArguments)

        // Invert the if statement so that the positive condition comes first.
        if (1.toString() != "1") {
            println("Not equal!")
        } else {
            println("Equal!")
        }

        // Add braces.
        if (true)
            println("true")

        // Simplify the expression.
        val veryTrue = true == true

        // Replace for loop with forEach function call.
        // (In Java, you can replace some loops with streams in a similar way.)
        val items123 = listOf(1, 2, 3)
        for (i in items123) {
            println(i)
        }

        // Replace forEach with for loop.
        val items456 = listOf(4, 5, 6)
        items456.forEach { i -> println(i) }

        // Format with one argument per line.
        val longArguments = listOf("Some quite long string", "another decently long string", "and another one")

        // Format on a single line.
        val shortArguments = listOf(
            "Short",
            "also",
            "this as well"
        )

        // Remove unused variable.
        val asdf = 42
    }
}

private class Asdf {

    private val answer: Int

    // Convert to primary constructor.
    constructor(answer: Int = 42) {
        this.answer = answer
    }

    // Convert method to property.
    fun name() = "John Doe"

    // Convert to simple property initializer.
    val age get() = "75"
}
