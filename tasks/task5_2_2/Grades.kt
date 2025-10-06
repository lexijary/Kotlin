// Task 5.2.2: conversion of marks into grades, using a function

fun grade(mark: Int) = when (mark) {
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
}

fun main(args: Array<String>) {
    var i = 0
    for (arg in args) {
        var userInput = args[i]
        var Grade = grade(userInput.toInt())
        print("${userInput} is a ${Grade}\n")
        i = i + 1
    } 
}