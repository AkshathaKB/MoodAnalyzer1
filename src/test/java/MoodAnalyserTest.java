import com.moodanalyser.Moodanalyser;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        Moodanalyser moodanalyser = new Moodanalyser();
       String mood = moodanalyser.analyseMood("This is a Sad Message");
        Assert.assertEquals("SAD",mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        Moodanalyser moodanalyser = new Moodanalyser();
        String mood = moodanalyser.analyseMood("This is a Happy Message");
        Assert.assertEquals("HAPPY",mood);

    }
}
