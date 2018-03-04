package board.iteration2

class BoardShape {

    private val spots: List<String> = (0..8).map{ index -> index.toString()}

    fun firstRow(): List<String> {
        return spots.subList(0, 3)
    }

    fun secondRow(): List<String> {
        return spots.subList(3, 6)
    }

    fun thirdRow(): List<String> {
        return spots.subList(6, 9)
    }
}