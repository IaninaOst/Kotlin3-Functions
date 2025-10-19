package ru.otus.homework.homework

fun main() {
    testConcatStrings()
}

fun concatStrings(vararg strings: String, char: Char = ' '): String {
    return strings.joinToString(separator = char.toString())
}

fun testConcatStrings() {
    val str1 = "str1"
    val str2 = "str2"
    val str3 = "str3"

    val resultDefault = concatStrings(str1, str2, str3)
    check(resultDefault == "str1 str2 str3") { "Expected 'str1 str2 str3', but got '$resultDefault'" }

    val resultComma = concatStrings(str1, str2, str3, char = ',')
    check(resultComma == "str1,str2,str3") { "Expected 'str1,str2,str3', but got '$resultComma'" }
}

