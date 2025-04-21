fun main() {
    var num1: Double = 10.6
    var num2: Double = 5.0
    var result: Double = 0.0

    result = num1 + num2
    println("num1 + num2 is $result") // Output: num1 + num2 is 15.6

    result = num1 - num2
    println("num1 - num2 is $result") // Output: num1 - num2 is 5.6

    result = num1 * num2
    println("num1 * num2 is $result") // Output: num1 * num2 is 53.0

    result = num1 / num2
    println("num1 / num2 is $result") // Output: num1 / num2 is 2.12

    result = num1 % num2
    println("num1 % num2 is $result") // Output: num1 % num2 is 0.6

    //Assignment Operator

    var x: Int = 20
    var y: Int = 10
    var z: Int = 0

    z = x + y
    println("z = x + y = $z") // Output: z = x + y = 30

    z += x // Equivalent to z = z + x
    println("z += x = $z")   // Output: z += x = 50

    z -= x // Equivalent to z = z - x
    println("z -= x = $z")   // Output: z -= x = 30

    z *= x // Equivalent to z = z * x
    println("z *= x = $z")   // Output: z *= x = 600

    z /= x // Equivalent to z = z / x
    println("z /= x = $z")   // Output: z /= x = 30

    z %= x // Equivalent to z = z % x
    println("z %= x = $z")   // Output: z %= x = 10

    //Unary Operator

    var number: Double = 7.6
    var isCheck: Boolean = true

    println("+number = ${+number}")   // Output: +number = 7.6
    println("-number = ${-number}")   // Output: -number = -7.6
    println("++number = ${++number}") // Output: ++number = 8.6
    println("--number = ${--number}") // Output: --number = 7.6
    println("!isCheck = ${!isCheck}") // Output: !isCheck = false

    println("-----------------------------")

    var result1: Double = 4.7
    println("result1 : $result1")       // Output: result : 4.7

    println("result1++ : ${result1++}") // Output: result++ : 4.7 (value before increment)
    println("result1 : $result1")       // Output: result : 5.7 (value after increment)

    result = 4.7 // Reset result for the next demonstration
    println("++result1 : ${++result1}") // Output: ++result : 5.7 (value after increment)
    println("result1 : $result1")       // Output: result : 5.7

    println("--result1 : ${--result1}") // Output: --result : 4.7 (value after decrement)
    println("result1 : $result1")       // Output: result : 4.7

    result = 4.7 // Reset result for the next demonstration
    println("result1-- : ${result1--}") // Output: result-- : 4.7 (value before decrement)
    println("result1 : $result1")       // Output: result : 3.7 (value after decrement)
}