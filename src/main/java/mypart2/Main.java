package mypart2;

import java.util.stream.Stream;

/**
 * Текст класса Main
 * Сгенерировать стрим - возрастающую бесконечную последовательность(1,2,3,4...) и
 * распечатать из нее первые 10 чисел, которые делятся нацело на 27.
 * @author Ivan
 */
public class Main {
    public static void main(String[] args) {
        infinity();
    }

    /**
     *
     */
    static void infinity() {
        Stream<Integer> s = Stream.iterate(1, n -> n + 1);
            s.filter(f -> f % 27 == 0)
                    .limit(10)
                    .forEach(System.out::println);
    }

}
