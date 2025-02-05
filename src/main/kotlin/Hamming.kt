object Hamming {

    fun compute(leftStrand: String, rightStrand: String): Int {
        if (leftStrand.indices != rightStrand.indices) {
            throw IllegalArgumentException("left and right strands must be of equal length")
        } else {
            var count = 0
            leftStrand.zip(rightStrand).forEachIndexed { index, pair ->
                if (pair.first != pair.second) count++
            }
            return count
        }
    }

    // Optimized solution
    fun bestSolution(leftStrand: String, rightStrand: String): Int {
        require(leftStrand.indices == rightStrand.indices) { "left and right strands must be of equal length" }
        return leftStrand.zip(rightStrand).count { (left, right) -> left != right }
    }
}
