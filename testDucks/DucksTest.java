import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DucksTest
{
    @Test
    void initialToString()
    {
        Ducks duck1 = new Ducks("white", 2);
        String expected = "Duck: \nColor = white\nAge = 2";
        assertEquals(expected, duck1.toString());
    }
}