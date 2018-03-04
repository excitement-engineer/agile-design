package board.iteration4

class BoardShape(val size: Int = 3, private val spotFormatter: SpotFormatter = NumberSpotFormatter()) {

    private val spots: List<String> = (0 until (size * size)).map { spotFormatter.format(it) }

    @Deprecated(message = "Use the row(0) function")
    fun firstRow(): List<String> {
        return spots.subList(0, size)
    }

    @Deprecated(message = "Use the row(1) function")
    fun secondRow(): List<String> {
        return spots.subList(3, size * 2)
    }

    @Deprecated(message = "Use the row(2) function")
    fun thirdRow(): List<String> {
        return spots.subList(6, size * 3)
    }

    fun row(index: Int): List<String> {
        return spots.subList(index * size, size * (index + 1))
    }


}