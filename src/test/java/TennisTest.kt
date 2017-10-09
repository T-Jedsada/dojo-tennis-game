import org.junit.Assert
import org.junit.Before
import org.junit.Test

class TennisTest {

    private lateinit var tennis: Tennis

    @Before
    fun setup() {
        tennis = Tennis()
    }

    @Test
    fun zero_zero_should_be_love() {
        Assert.assertEquals("love", tennis.tennisScore())
    }

    @Test
    fun one_zero_should_be_fifteen_love() {
        tennis.champWin()
        Assert.assertEquals("fifteen-love", tennis.tennisScore())
    }

    @Test
    fun one_one_should_be_fifteen_fifteen() {
        tennis.champWin()
        tennis.pondWin()
        Assert.assertEquals("fifteen-fifteen", tennis.tennisScore())
    }

    @Test
    fun two_one_should_be_thirty_fifteen() {
        tennis.champWin()
        tennis.champWin()
        tennis.pondWin()
        Assert.assertEquals("thirty-fifteen", tennis.tennisScore())
    }

    @Test
    fun deuce_should_be_deuce() {
        tennis.champWin()
        tennis.champWin()
        tennis.champWin()
        tennis.pondWin()
        tennis.pondWin()
        tennis.pondWin()
        Assert.assertEquals("deuce", tennis.tennisScore())
    }
}