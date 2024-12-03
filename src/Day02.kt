import kotlin.math.abs

private const val DAY = "02"

fun main() {
    // PART 1
    fun Long.isValidChange() = abs(this) in 1..3

    fun sameDirection(changeOne: Long, changeTwo: Long): Boolean =
        (changeOne < 0 && changeTwo < 0) || (changeOne > 0 && changeTwo > 0)

    fun isReportSafe(levels: List<Long>): Boolean {
        levels.windowed(3).forEach {
            val changeOne = it[1] - it[0]
            val changeTwo = it[2] - it[1]

            if ((changeOne.isValidChange() && changeTwo.isValidChange() && sameDirection(changeOne, changeTwo)).not()) {
                return false
            }
        }
        return true
    }

    fun part1(input: List<String>): Long {
        var safeReportsCount = 0L
        input.forEach { line ->
            if (isReportSafe(line.split(" ").map { it.toLong() })) {
                safeReportsCount++
            }
        }
        return safeReportsCount
    }

    // PART 2
    fun isReportSafeV2(levels: List<Long>): Boolean {
        if (isReportSafe(levels)) {
            return true
        }

        for (i in levels.indices) {
            if (isReportSafe(levels.withoutIndex(i))) {
                return true
            }
        }

        return false
    }

    fun part2(input: List<String>): Long {
        var safeReportsCount = 0L
        input.forEach { line ->
            if (isReportSafeV2(line.split(" ").map { it.toLong() })) {
                safeReportsCount++
            }
        }
        return safeReportsCount
    }

    println("\n--- DAY $DAY ---\n")

    // TEST
    val testInput = readInput("Day${DAY}_test")
    val testOutput = part1(testInput)
    val testOutput2 = part2(testInput)
    println("TEST 1: $testOutput")
    println("TEST 2: $testOutput2")
    check(part1(testInput) == 2L)
    check(part2(testInput) == 4L)

    // REAL INPUT
    val input = readInput("Day$DAY")
    println("PART 1: " + part1(input))
    println("PART 2: " + part2(input))
}
