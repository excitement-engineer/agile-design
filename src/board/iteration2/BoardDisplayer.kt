package board.iteration2

interface BoardDisplayer {
    fun display(board: BoardShape)
}

class BoardDisplayerText: BoardDisplayer {

    private fun displayRow(row: List<String>): String {
        return "${row[0]} | ${row[1]} | ${row[2]}"
    }

    override fun display(board: BoardShape) {

        val formattedFirstRow = displayRow(board.firstRow())
        val formattedSecondRow = displayRow(board.secondRow())
        val formattedThirdRow = displayRow(board.thirdRow())

        val formattedRow = "$formattedFirstRow\n$formattedSecondRow\n$formattedThirdRow"
        println(formattedRow)
    }
}

class BoardDisplayerJson: BoardDisplayer {

    override fun display(board: BoardShape) {
        val rows = listOf(board.firstRow(), board.secondRow(), board.thirdRow())
        println(rows)
    }
}