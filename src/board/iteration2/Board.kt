package board.iteration2

/**
 * For backwards compatibility we need to keep supporting the Board class. However, we keep the complexity of
 * the interface "localized" by not making the entire system dependent on this class.
 */
class Board(private val boardDisplayer: BoardDisplayer = BoardDisplayerText(), private val boardShape: BoardShape = BoardShape()) {


    fun firstRow(): List<String> {
        return boardShape.firstRow()
    }

    fun secondRow(): List<String> {
        return boardShape.secondRow()
    }

    fun thirdRow(): List<String> {
        return boardShape.thirdRow()
    }

    fun display() {
        boardDisplayer.display(boardShape)
    }
}