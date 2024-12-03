package benchmark

import kotlinx.benchmark.Benchmark
import kotlinx.benchmark.Scope
import kotlinx.benchmark.State
import withoutIndex

@State(Scope.Benchmark)
class DayBenchmark {

    val list = (0 until 10).toList()
    val indexToFilter = 5

    @Benchmark
    fun filterWithMutableMap(): List<Int> {
        return list.withoutIndex(indexToFilter)
    }

    @Benchmark
    fun filteredIndexed(): List<Int> {
        return list.filterIndexed { i, _ -> i != indexToFilter }
    }
}
