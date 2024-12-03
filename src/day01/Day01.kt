package day01

import readInput
import kotlin.math.abs

private const val DAY = "01"

fun main() {
    fun part1(input: List<String>): Long {
        val (left, right) = input.map { line ->
            val first = line.substringBefore(" ").toLong()
            val second = line.substringAfterLast(" ").toLong()
            first to second
        }.unzip()

        return left.sorted().zip(right.sorted()).sumOf { (l, r) -> abs(l - r) }
    }

    fun part2(input: List<String>): Long {
        val (left, right) = input.map { line ->
            val first = line.substringBefore(" ").toLong()
            val second = line.substringAfterLast(" ").toLong()
            first to second
        }.unzip()

        val mapRight = right.groupingBy { it }.eachCount()

        return left.sumOf { n -> n * mapRight.getOrDefault(n, 0) }
    }

    println("\n--- DAY $DAY ---\n")

    // TEST
    val testInput = readInput("day${DAY}/Day${DAY}_test")
    val testOutput = part1(testInput)
    println("TEST 1: $testOutput")
    check(testOutput == 11L)

    val testOutput2 = part2(testInput)
    println("TEST 2: $testOutput2")
    check(testOutput2 == 31L)

    // REAL INPUT
    val input = readInput("day${DAY}/Day$DAY")
    println("PART 1: " + part1(input))
    println("PART 2: " + part2(input))
}
