import kotlin.math.abs

private const val DAY = "01"

fun main() {
    fun part1(input: List<String>): Long {
        return input.size.toLong()
    }

    fun part2(input: List<String>): Long {
        return input.size.toLong()
    }

    println("\n--- DAY $DAY ---\n")

    // TEST
    val testInput = readInput("Day${DAY}_test")
    val testOutput = part1(testInput)
    val testOutput2 = part2(testInput)
    println("TEST 1: $testOutput")
    check(part1(testInput) == 11L)
//    println("TEST 2: $testOutput2")
//    check(part2(testInput) == 31L)

    // REAL INPUT
//    val input = readInput("Day$DAY")
//    println("PART 1: " + part1(input))
//    println("PART 2: " + part2(input))
}
