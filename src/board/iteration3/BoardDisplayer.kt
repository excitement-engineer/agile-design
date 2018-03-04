package board.iteration3

interface BoardDisplayer {
    fun display(board: BoardShape)
}

class BoardDisplayerText: BoardDisplayer {

    private fun displayRow(row: List<String>): String {

        val formattedRow = row.fold("") {
            sum, element -> "$sum| $element "
        }

        return formattedRow.replaceFirst("| ", "").dropLast(1)
    }

    override fun display(board: BoardShape) {

        val formattedRows = (0 until board.size).map { displayRow(board.row(it)) }

        var formattedBoard = formattedRows.fold("") {
            sum, element -> "$sum\n$element"
        }

        formattedBoard = formattedBoard.replaceFirst("\n", "")

        println(formattedBoard)
    }
}

class BoardDisplayerJson: BoardDisplayer {

    override fun display(board: BoardShape) {

        val formattedRows = (0 until board.size).map { board.row(it)}

        println(formattedRows)
    }
}