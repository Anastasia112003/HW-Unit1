import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main {
    public static String newStrings() {
        String string = "анна, андрей, александр, пётр";
        String newString = string.toUpperCase(Locale.ROOT);
        return newString;
    }

    public static boolean isTrue() {
        int first = 567;
        int second = 22;
        return first == second;
    }

    public static List<String> newStringArray() {
        List<String> list = new ArrayList<>(Arrays.asList("Анастасия Дмитриевна", "Пётр Олегович", "Юлия Петровна"));
        list.add("Иванов Иван");
        return list;
    }

    public static int howMany() {
        int first = 675;
        int second = 85;
        int resulting = (first - second) * second;
        return resulting;

    }

    public static double howManyDouble() {
        int first = 3;
        int second = 7;
        int third = 34;
        double resulting = (first + second + third) / first;
        return resulting;

    }
}