package board.iteration4

fun main(args: Array<String>) {
    val board = Board()

    //Display as text. Note that we have not changed the signature at all. No breaking changes to the code.
    board.display()

    // Display as JSON
    val boardJsonDisplay = Board(BoardDisplayerJson(), BoardShape(5, CharacterSpotFormatter()))
    boardJsonDisplay.display()
}