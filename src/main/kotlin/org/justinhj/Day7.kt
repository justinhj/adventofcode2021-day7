package org.justinhj

fun load(filename: String): List<Int> {
    val res = {}::class.java.getResource(filename)
    val content = res.readText()
    return content.lines().flatMap {
        line ->
            line.split(',').map{it.toInt()}
    }
}

fun solve(input: List<Int>): Int {


    return 0
}

fun main() {

    val exampleData = load("example.txt")
    val day7Data = load("day7.txt")

    println("${exampleData.size} ${day7Data.size}")
}