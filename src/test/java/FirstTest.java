import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {

    @Test
    public void testAddition() {
        int expected = 5;
        int actual = 2 + 3;

        // Это проверка: если 2+3 не равно 5, тест упадет с ошибкой
        assertEquals(expected, actual, "Сумма должна быть равна 5");
    }
}