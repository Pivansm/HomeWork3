package mypart3;

import java.util.*;

/**
 * Текст класса Main
 * Объявить произвольный массив строк, отсортировать его по длине слова( от меньшего к большему) и
 * вывести на экран.
 * @author Ivan
 */
public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"Winteraaaa", "Springggg", "Summerrr", "Autumnn", "Bub"};

        Arrays.sort(array, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) {
                    return 1;
                } else {
                    if(o1.length() < o2.length()) {
                        return -1;
                    }
                }
                return 0;
            }
        });

        for(String s : array) {
          System.out.println(s);
        }

    }


}
