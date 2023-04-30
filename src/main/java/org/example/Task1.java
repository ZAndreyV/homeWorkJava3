package org.example;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isDigit;

public class Task1 {
    //1. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа.
    // Пройти по списку, найти и удалить целые числа.
    //Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(List.of("Яблоко", "11", "13", "Апельсин", "Дыня", "17",
                "Яблоко", "11", "13", "Апельсин", "25", "65", "699", "Дыня", "17"));
        ArrayList<String> list1 = delNumbersFromArray(list);
        System.out.println(list1);
    }

    private static ArrayList<String> delNumbersFromArray(ArrayList<String> lst) {
        for (int i = 0; i < lst.size(); i++) {
            try {
                if (isDigit(Integer.parseInt(lst.get(i)))) {
                }
                else {
                    lst.remove(i);
                    i--;
                }

            } catch (NumberFormatException exception) {
            }
        }
        return lst;
    }
}
