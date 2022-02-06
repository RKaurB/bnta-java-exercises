import org.junit.jupiter.api.Test;
// import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MyFirstTest {

    // Method

    // These are our tests

    @Test
    void hello1() {
        // Given
        int numberOne = 4;
        int numberTwo = 4;
        // When
        int result = numberOne + numberTwo;
        // Then
        assertThat(result).isEqualTo(8);

    }

    @Test
    void hello2() {

    }
}
