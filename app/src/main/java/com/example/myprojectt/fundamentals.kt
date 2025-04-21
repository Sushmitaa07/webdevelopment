package com.example.myprojectt

fun main(args: Array<String>) {
    print("Hello World\n")

    var age = 20
    age = 25 // okay, since age is a var

    var roll = 15 // changed from val to var
    roll = 10

    var a: Boolean = true
    var b: Char = 'R'
    var c: Byte = 12
    var d: Short = -356
    var e: Int = 134354
    var f: Long = -51321354L
    var g: Float = 5.6451344F
    var h: Double = 7.32644564

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(g)
    println(h)

//TYpe conversation in kotlin
    var x: Double = 132.32
    var y: Int = x.toInt()
    var z: Byte = y.toByte()

    println(x)
    println(y)
    println(z)

    //String Data types in kotlin
    var p: String = "Hello World"
    var i: Int = p.length
    var q: Boolean = p.equals("Hello World")
    var username: String = "Softwarica"

    println(username.trim())
    println(p);
    println(i);
    println(p.isEmpty())
    println(p.lowercase())
    println(p.uppercase())
    println(q)
    print(p.plus(", How are you?"));



}
