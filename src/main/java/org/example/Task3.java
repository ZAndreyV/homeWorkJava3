package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Neptune", "Uranus", "Pluto"};
        ArrayList<String> list = randomPlanets(planets, 10);
        System.out.println(list);
        ArrayList<String> list1 = removeRepeatPlanets(list);
        System.out.println(list1);
    }

    private static ArrayList<String> randomPlanets(String[] arr, int lengthArr) {
        ArrayList<String> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < lengthArr; i++) {
            list.add(arr[rnd.nextInt(arr.length)]);
        }
        for (String planet : arr) {
            int currentFrequency = Collections.frequency(list, planet);
            if (currentFrequency > 0) {
                System.out.println(planet + " : " + currentFrequency);
            }
        }
        return list;
    }
    private static ArrayList<String> removeRepeatPlanets(ArrayList<String> lst) {
        lst.sort(Comparator.naturalOrder());
        for (int i = 0; i < lst.size() - 1; i++) {
            String first = lst.get(i);
            String second= lst.get(i + 1);
            if (second.equals(first)) {
                lst.remove(i);
                i--;
            }
        }
        return lst;
    }

}
