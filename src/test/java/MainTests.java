import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class MainTests {
    Main sut;

    @Test
    public void testNewStrings() {
        //arrange
        String expected = "АННА, АНДРЕЙ, АЛЕКСАНДР, ПЁТР";
        //act
        var result = sut.newStrings();
        //assert
        Assertions.assertEquals(expected, result);

    }

    @Test
    public void testIsTrue() {
        //arrange
        boolean expected = false;
        // act
        var result = sut.isTrue();
        //assert
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void testNewStringArray() {
        //arrange
        List<String> expected = Arrays.asList("Анастасия Дмитриевна", "Пётр Олегович", "Юлия Петровна", "Иванов Иван");
        //act
        var result = sut.newStringArray();
        //assert
        Assertions.assertEquals(expected, result);
    }
}
