package board.iteration4

interface SpotFormatter {
    fun format(index: Int): String
}

class NumberSpotFormatter: SpotFormatter {
    override fun format(index: Int): String {
        return index.toString()
    }
}

class CharacterSpotFormatter: SpotFormatter {
    override fun format(index: Int): String {
        return if (isEven(index)) {
            "x"
        } else {
            "o"
        }
    }

    private fun isEven(index: Int): Boolean {
        return index %2== 0
    }
}