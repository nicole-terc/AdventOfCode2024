package benchmark

import withoutIndex

//@State(Scope.Benchmark)
class BenchmarkDay02 {

    val list = (0 until 1000).toList()
    val indexToFilter = 500

//    @Benchmark
    fun filterWithMutableList(): List<Int> {
        return list.withoutIndex(indexToFilter)
    }

//    @Benchmark
    fun filteredIndexed(): List<Int> {
        return list.filterIndexed { i, _ -> i != indexToFilter }
    }
}


/*
** Remove item form List **

-- 10 sized list --
main summary:
Benchmark                                  Mode  Cnt         Score        Error  Units
RemoveItemFromList.filterWithMutableList  thrpt    5  80161690.521 ± 511048.687  ops/s
RemoveItemFromList.filteredIndexed        thrpt    5  25694293.972 ± 174595.502  ops/s

-- 1000 sized list --
main summary:
Benchmark                                  Mode  Cnt        Score       Error  Units
RemoveItemFromList.filterWithMutableList  thrpt    5  7246553.830 ± 40207.907  ops/s
RemoveItemFromList.filteredIndexed        thrpt    5   319336.752 ±  4632.086  ops/s

 */
