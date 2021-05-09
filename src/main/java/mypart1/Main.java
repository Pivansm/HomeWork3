package mypart1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * Текст класса Main
 * Создать метод, который принимает массив строк и предикат. И возвращает коллекцию, которая состоит из
 * элементов отфильтрованных предикатом.
 * @author Ivan
 */
public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"Winter", "Spring", "Summer", "Autumn", "Bub"};

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean isValid(String value) {
                return value.length() > 3;
            }
        };

        List<String> stringList = predicateSort(array, predicate);
        stringList.forEach(System.out::println);
    }

    /**
     *
     * @param array массив строк
     * @param filter предикат
     * @return коллекция строк
     */
    static List<String> predicateSort(String[] array, Predicate filter) {
        List<String> stringList = new ArrayList<>();
        for(String s : array) {
            if (filter.isValid(s)) {
                stringList.add(s);
            }
        }
        Collections.sort(stringList);
        return stringList;
    }

}
