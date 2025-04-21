package com.example.myprojectt

fun main() {
    val dictionary = mapOf(
        "apple" to "A red coloured fruit",
        "bottle" to "A container, typically made of glass or plastic, used for storing liquids like water, juice, or medicine.",
        "perfume" to "A fragrant liquid made from essential oils and aroma compounds, used to give a pleasant scent to the body or surroundings.",
        "bag" to "A container made of flexible material used for carrying personal items, groceries, or other belongings.",
        "fan" to  "A device with rotating blades that creates airflow to cool people or ventilate a space."
    )

    print("Enter a word to look up its meaning: ")
    val input = readLine()?.lowercase()

    if (input != null && dictionary.containsKey(input)) {
        println("Meaning of \"$input\": ${dictionary[input]}")
    } else {
        println("Sorry, the word \"$input\" is not in the dictionary.")
    }
}
