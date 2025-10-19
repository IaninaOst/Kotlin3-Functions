package ru.otus.homework.homework
import kotlin.system.measureTimeMillis

fun main() {
    val time = measureTime(::longRunningTask)
    println("Measured time: $time ms")
}

fun longRunningTask() {
    Thread.sleep(1000)
}

fun measureTime(function: () -> Unit): Long {
    return measureTimeMillis {
        function()
    }
}