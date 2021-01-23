package ru.geekbrains.hometask;
//1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
//        при подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//
//        2. Далее метод должен пройтись по всем элементам массива, преобразовать в int, и просуммировать.
//        Если в каком-то элементе массива преобразование не удалось
//        (например, в ячейке лежит символ или текст вместо числа),
//        должно быть брошено исключение MyArrayDataException,
//        с детализацией в какой именно ячейке лежат неверные данные.
//
//        3. В методе main() вызвать полученный метод,
//        обработать возможные исключения MySizeArrayException и MyArrayDataException,
//        и вывести результат расчета.

import ru.geekbrains.hometask.tools.Converter;

public class Main {

    public static void main(String[] args) {
        String[][] correctMatrix = {
                {"3", "2", "3", "3"},
                {"3", "6", "1", "4"},
                {"0", "2", "7", "2"},
                {"0", "2", "7", "2"}
        };
        String[][] wrongSizeMatrix = {
                {"3", "2", "3", "3"},
                {"6", "1", "5", "2"},
                {"0", "2", "7", "3"},
                {"0", "2", }
        };
        String[][] wrongChar = {
                {"3", "2", "3", "3"},
                {"6", "1", "2", "3"},
                {"0", "2", "7", "3"},
                {"0", "$", "7", "3"}
        };

        try {
            System.out.println(Converter.strConverter(correctMatrix));
        } catch (CustomException e) {
            e.getMessage();
        }

        try {
            System.out.println(Converter.strConverter(wrongSizeMatrix));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }

        try {
            System.out.println(Converter.strConverter(wrongChar));
        } catch (CustomException e) {
            System.err.println(e.getMessage());
        }
    }
}