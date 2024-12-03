package benchmark

import kotlinx.benchmark.Benchmark
import kotlinx.benchmark.Scope
import kotlinx.benchmark.State
import readInput
import readInputAsString

@State(Scope.Benchmark)
class BenchmarkDay03 {

    val day = "03"
    val inputFileName = "day$day/Day$day"

    @Benchmark
    fun joinStrings(): String {
        return readInput(inputFileName).joinToString()
    }

    @Benchmark
    fun readAsString(): String {
        return readInputAsString(inputFileName)
    }
}


/*
** Read string input **

main summary:
Benchmark                Mode  Cnt      Score     Error  Units
ReadInput.joinStrings   thrpt    5  32878.485 ± 765.085  ops/s
ReadInput.readAsString  thrpt    5  48296.185 ± 708.021  ops/s

 */
