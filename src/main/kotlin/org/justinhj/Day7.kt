package org.justinhj

import kotlin.math.abs

fun load(filename: String): List<Int> {
    val res = {}::class.java.getResource(filename)!!
    val content = res.readText()
    return content.lines().flatMap {
        line ->
            line.split(',').map{it.toInt()}
    }
}

// Part 1

fun cost(input: List<Int>, moveTo: Int): Int {
    return input.sumOf {
        abs(it - moveTo)
    }
}

fun solve(input: List<Int>): Int {
    val costs = (input.indices).map { Pair(it, cost(input, it)) }
    val minimum = costs.minByOrNull { it.second }
    return minimum?.second ?: 0
}

// Part 2 we provide a different cost function

// cost is now 1 + 2 + 3 + 4 + .. + n
// which can be calculated as n = n(n+1) / 2

fun cost2(input: List<Int>, moveTo: Int): Int {
    return input.sumOf {
        val n = abs(it - moveTo)
        (n * (n+1)) / 2
    }
}

fun solve2(input: List<Int>): Int {
    val costs = (input.indices).map { Pair(it, cost2(input, it)) }
    val minimum = costs.minByOrNull { it.second }
    return minimum?.second ?: 0
}

fun main() {

    val exampleData = load("example.txt")
    val day7Data = load("day7.txt")

    println(solve(exampleData))
    println(solve(day7Data))

    println(solve2(exampleData))
    println(solve2(day7Data))
}