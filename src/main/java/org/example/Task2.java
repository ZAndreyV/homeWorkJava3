package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // 2. Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
        // что на 0й позиции каждого внутреннего списка содержится название жанра,
        // а на остальных позициях - названия книг.
        // Напишите метод для заполнения данной структуры(можно через консоль).
        //Пример:
        //"Классика", "Преступление и наказание", "Война и мир", "Анна Каренина".
        //"Научная фантастика", "Солярис", "Ночной дозор", "Братья Стругацкие".
        //"Детектив", "Десять негритят".
        //"Фантастика", "Хроники Нарнии", "Гарри Поттер и философский камень", "Грозовой перевал".

        List<ArrayList<String>> arr = listBooks();
        System.out.println(arr);
    }


        private static List<ArrayList<String>> listBooks() {
            Scanner scanner = new Scanner(System.in);
            String scan;
            String scan1;
            List<ArrayList<String>> books = new ArrayList<>();
            boolean isWorking = true;
            int count = 0;
            while (isWorking) {
                System.out.println("Enter stop to exit, to continue enter any button: ");
                scan = scanner.nextLine();
                if (scan.equals("stop")) {
                    break;
                }
                System.out.println("Enter genre name: ");
                scan = scanner.nextLine();
                books.add(new ArrayList<>());
                books.get(count).add(scan);
                boolean isWorkingbooks = true;
                while (isWorkingbooks) {
                    System.out.println("Enter name of book ");
                    scan = scanner.nextLine();
                    books.get(count).add(scan);
                    System.out.println("If you want to stop adding books enter 1, to continue enter any button?");
                    scan1 = scanner.nextLine();
                    if (scan1.equals("1")) {
                        isWorkingbooks = false;
                    }
                }
                count++;
            }
            return books;
        }
    }
