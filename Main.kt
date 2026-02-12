// --- Classes (hors main) ---
class Player(val name: String, val surName: String) {

    var totalScore: Int = 0
    var personalBestScore: Int = 0

    fun fullName(): String {
        return name + " " + surName
    }
}

class Scores {

    fun updateBest(best: Int, current: Int): Int {
        if (current > best) {
            return current
        }
        return best
    }
}

// --- Main ---
fun main() {

    val p1 = Player("Marie", "Curie")
    val p2 = Player("Albert", "Einstein")

    val scoring = Scores()
    var lvlScore = 0

    lvlScore = 18
    p1.totalScore += lvlScore
    p1.personalBestScore = scoring.updateBest(p1.personalBestScore, lvlScore)

    lvlScore = 40
    p1.totalScore += lvlScore
    p1.personalBestScore = scoring.updateBest(p1.personalBestScore, lvlScore)

    lvlScore = 22
    p1.totalScore += lvlScore
    p1.personalBestScore = scoring.updateBest(p1.personalBestScore, lvlScore)

    lvlScore = 25
    p2.totalScore += lvlScore
    p2.personalBestScore = scoring.updateBest(p2.personalBestScore, lvlScore)

    lvlScore = 15
    p2.totalScore += lvlScore
    p2.personalBestScore = scoring.updateBest(p2.personalBestScore, lvlScore)

    lvlScore = 30
    p2.totalScore += lvlScore
    p2.personalBestScore = scoring.updateBest(p2.personalBestScore, lvlScore)

    val winner: Player
    if (p1.totalScore >= p2.totalScore) {
        winner = p1
    } else {
        winner = p2
    }

    println("Winner " + winner.fullName() + " with a combined score of " + winner.totalScore)
    println("Personal Best Score is = " + winner.personalBestScore)
}
