package board.iteration3

@Deprecated(message = "Use the Board displayer and the BoardShape separately.")
class Board(
        private val boardDisplayer: BoardDisplayer = BoardDisplayerText(),
        private val boardShape: BoardShape = BoardShape()
) {

        @Deprecated(message = "Use the row(0) function")
        fun firstRow(): List<String> {
            return boardShape.firstRow()
        }

        @Deprecated(message = "Use the row(1) function")
        fun secondRow(): List<String> {
            return boardShape.secondRow()
        }

        @Deprecated(message = "Use the row(2) function")
        fun thirdRow(): List<String> {
            return boardShape.thirdRow()
        }

        fun display() {
            boardDisplayer.display(boardShape)
        }
}