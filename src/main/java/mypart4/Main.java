package mypart4;

import java.util.HashMap;
import java.util.Map;

/**
 * Текст класса Main
 * Используя массив из упражнения 3 создать Map в которой поместить в качестве ключа длину,
 * а в качестве значения количество слов с этой длинной
 * @author Ivan
 */
public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"Winteraaaa", "Springggg", "Summerrr", "Autumnn", "Bub", "Event", "Log"};
        Map<Integer, Integer> map = mapper(array);
        System.out.println(map);
    }

    /**
     *
     * @param array массив строк
     * @return Map
     */
    public static Map<Integer, Integer> mapper(String[] array) {
        // todo implement
        Map<Integer, Integer> map = new HashMap<>();
        for (String s : array) {
            int stringLen = s.length();
            if (map.containsKey(stringLen)) {
                int pr = map.get(stringLen);
                map.put(stringLen, pr + 1);
            } else map.put(stringLen, 1);
        }
        return map;
    }

}
