package com.example.myprojectt

fun main() {
    // If-Else Statement
    print("Please enter a number: ")
    val number = readlnOrNull()?.toIntOrNull()
    if (number != null) {
        if (number % 2 == 0) {
            println("$number is even")
        } else {
            println("$number is odd")
        }
    } else {
        println("Invalid input! Please enter a valid number.")
        return
    }

    // If-Else If Ladder Statement
    print("Please enter your age: ")
    val yourAge = readlnOrNull()?.toIntOrNull()
    if (yourAge != null) {
        if (yourAge < 13) {
            println("You are a child")
        } else if (yourAge < 19) {
            println("You are a teenager")
        } else if (yourAge < 50) {
            println("You are an adult")
        } else {
            println("You are a senior")
        }
    } else {
        println("Invalid input! Please enter a valid age.")
        return
    }

    // Nested If - Finding Largest of 3 Numbers
    println("Please enter 3 numbers:")

    val number1 = readlnOrNull()?.toIntOrNull()
    val number2 = readlnOrNull()?.toIntOrNull()
    val number3 = readlnOrNull()?.toIntOrNull()

    if (number1 != null && number2 != null && number3 != null) {
        val largestNumber = if (number1 >= number2) {
            if (number1 >= number3) number1 else number3
        } else {
            if (number2 >= number3) number2 else number3
        }

        println("The largest number is $largestNumber")
    } else {
        println("Invalid input! Please enter 3 valid numbers.")
    }

    //when statement
    print("Please enter a day number of the week (1-7): ")
    val dayNumber: Int = readln().toInt()
    val day: String = when(dayNumber) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid day choice"
    }

    println(day)

    // For Loop
        var sum: Int = 0
        for (x in 0..10) {
            if (x % 2 == 0) {
                println(x)
                sum += x

            }
        }

        println("The sum of even numbers is $sum")

    //While loop

        var num = 1
        var sum1 = 0

        while (num <= 10) {
            sum1 += num
            num++
        }

        println("The sum of numbers from 1 to 10 is $sum")

    //Do-while loop
    var number4: Int

    do {
        print("Enter a number (0 to exit): ")
        number4 = readln().toInt()
        println("You entered: $number4")
    } while (number4 != 0)

    println("Loop ended because you entered 0.")

}
