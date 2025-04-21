package com.example.myprojectt

fun show(a: Int, b: Int): Unit {
    println("You entered $a and $b")
}

fun add(a: Int, b: Int): Int {
    val sum = a + b
    return sum
}

fun findMinimumNumber(a: Int, b: Int): Int {
    val minimum = if (a > b) b else a
    return minimum
}

fun main() {
    print("Enter first number: ")
    val a: Int = readln().toInt()

    print("Enter second number: ")
    val b: Int = readln().toInt()

    show(a, b)

    val sum = add(a, b)
    println("Sum of the two entered numbers is $sum")

    val minimum = findMinimumNumber(a, b)
    println("And the smallest between $a and $b is $minimum")
}
