package com.example.myprojectt

// LIST
fun displayList() {
    val numbers: List<String> = listOf("one", "two", "three", "four")

    println("Number of elements: ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("Fourth element: ${numbers[3]}")
    println("Index of element \"two\": ${numbers.indexOf("two")}")
}

// Mutable and Immutable List
fun main() {
    displayList()
    set()
    map()

    // Immutable List
    val lst = listOf("one", "two", "three")
    println("\nImmutable List:")
    for (i in lst.indices) {
        println(lst[i])
    }

    // Mutable List
    val mutableLst = mutableListOf("one", "two", "three")
    mutableLst.add("four")
    println("\nMutable List:")
    for (i in mutableLst.indices) {
        println(mutableLst[i])
    }
}

//SET
fun set() {
    val numbers = setOf(1, 2, 3, 4)
    for (element in numbers) {
        println(element)
    }

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("The sets are equal: ${numbers == numbersBackwards}")
}

//MAP
fun map() {
    val countriesCapitals = mapOf(
        "Nepal" to "Kathmandu",
        "China" to "Beijing",
        "India" to "New Delhi"
    )

    println("All keys: ${countriesCapitals.keys}")
    println("All values: ${countriesCapitals.values}")

    println("Capital of Nepal is: ${countriesCapitals["Nepal"]}")
}


