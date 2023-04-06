import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static sun.util.calendar.CalendarSystem.names;

public class Exemplo12 {
    private static List<String> names;

    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();
        list.add(new Produto("Tv", 900.00));
        list.add(new Produto("Mouse", 50.00));
        list.add(new Produto("Table", 350.00));
        list.add(new Produto("HD Case", 80.90));

        List.<String> names = list.stream() .map(new UpperCaseName()) .collect(Collectors.toList());
        names.forEach(System.out::println);
    }
}
