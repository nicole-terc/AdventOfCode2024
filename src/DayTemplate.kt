private const val DAY = "00"

fun main() {
    fun part1(input: List<String>): Long {
        return input.size.toLong()
    }

    fun part2(input: List<String>): Long {
        return input.size.toLong()
    }

    println("\n--- DAY $DAY ---\n")

    // TEST
    val testInput = readInput("day${DAY}/Day${DAY}_test")
    val testOutput = part1(testInput)
    println("TEST 1: $testOutput")
    check(testOutput == 11L)

    val testOutput2 = part2(testInput)
//    println("TEST 2: $testOutput2")
//    check(testOutput2 == 31L)

    // REAL INPUT
//    val input = readInput("day${DAY}/Day$DAY")
//    println("PART 1: " + part1(input))
//    println("PART 2: " + part2(input))
}
