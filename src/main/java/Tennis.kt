class Tennis {

    private var champ = 0
    private var pond = 0

    fun tennisScore(): String = if (champ == 0 && pond == 0) "love"
    else if (champ == 1 && pond == 1) "fifteen-fifteen"
    else if (champ == 2 && pond == 1) "thirty-fifteen"
    else if (champ == 3 && pond == 3) "deuce"
    else "fifteen-love"

    fun champWin() = champ++

    fun pondWin() = pond++
}