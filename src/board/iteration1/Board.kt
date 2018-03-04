package board.iteration1

class Board {

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

    fun display() {

        val formattedRows = this.spots.get(0) + " | " + this.spots.get(1) + " | " + this.spots.get(2) + "\n" + this.spots.get(3) + " | " + this.spots.get(4) + " | " + this.spots.get(5) + "\n" + this.spots.get(6) + " | " + this.spots.get(7) + " | " + this.spots.get(8)
        println(formattedRows)
    }
}