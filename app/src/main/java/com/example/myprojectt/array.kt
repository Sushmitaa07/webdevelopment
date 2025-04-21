package com.example.myprojectt

fun main(args: Array<String>){
    var age = arrayOf(1,2,3)
    println(age)
    println("The first element of age is "+ age[0])
    println("The second element of age is "+ age[0])
    println("The third element of age is "+ age[0])

    println("*************")

    var name = arrayOf("ram", "shyam", "Hari")
    name[1]="Sushmita"
    println("The first element of name is "+ name[0])
    println("The second element of name is "+ name[0])
    println("The third element of name is "+ name[0])

    println(name.size)

    //ArrayList

    var age1 = ArrayList<Int>()
    age1.add(1)
    age1.add(1, 20)
    age1.add(5)

    var age2 = arrayListOf<Int>(1,20,5)

    var name1 = arrayListOf<String>("Sushmita", "Sujata", "Sita")
    name1.add("Gita")
    name1.add(4, "Hari")

    name1.remove("Sita")
    name1.removeAt(0)

    println(name1)

    var mixArrayList = arrayListOf<Any>("hello",5,2.0)
    println(mixArrayList[0])
    println(mixArrayList[1])
    println(mixArrayList[2])




}