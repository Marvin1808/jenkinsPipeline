import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    public FizzBuzz fB;

    @BeforeEach
    public void setUp() {
        fB = new FizzBuzz();
    }

    @DisplayName("Play FizzBuzz with number = 1")
    @Test
    public void testNumber() {
        String fizzBuzz = fB.play(1);
        Assertions.assertEquals(fizzBuzz, "1");
    }

    @DisplayName("Play FizzBuzz with number = 3")
    @Test
    public void testFizz() {
        String fizzBuzz = fB.play(3);
        Assertions.assertEquals(fizzBuzz, "Fizz");
    }

    @DisplayName("Play FizzBuzz with number = 5")
    @Test
    public void testBuzz() {
        String fizzBuzz = fB.play(5);
        Assertions.assertEquals(fizzBuzz, "Buzz");
    }

    @DisplayName("Don't
