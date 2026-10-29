fun median(values: List<Float>): Float
{
    require(values.isNotEmpty()) { "Cannot compute median of an empty list" }
    val sorted = values.sorted()
    val mid = sorted.size / 2
    return if (sorted.size % 2 == 1) sorted[mid]
           else (sorted[mid - 1] + sorted[mid]) / 2f
}

fun displayStats(values: List<Float>)
{
    println("Minimum: ${values.min()}")
    println("Maximum: ${values.max()}")
    println("Mean:    ${values.average()}")
    println("Median:  ${median(values)}")
}