package ru.avalon.java.j20.labs.tasks;

import java.util.Arrays;
import ru.avalon.java.j20.labs.Task;

import java.util.Iterator;
import ru.avalon.java.j20.labs.models.Fibonacci;

/**
 * Задание №3
 *
 * <p>Тема: "Изучение интерфейсов {@link Iterable} и {@link Iterator}".
 */
public class Task3 implements Task {

    @Override
    public void run() {
        /*
         * TODO(Студент): Выполнить задание №3
         *
         * 1. Завершить описание класса Fibonacci так, чтобы класс
         *    возвращал заданное количество чисел последовательности
         *    Фибоначчи.
         *
         *    Количество чисел последовательности можно указывать
         *    при создании экземпляра класса.
         *
         *    Найти сумму 20 первых чисел последовательности Фибоначчи:
         *
         * 2. Создать экземпляр класса Fibonacci так, чтобы он
         *    возвращал последовательность чисел Фибоначчи длиной
         *    в 20 элементов.
         *
         * 3. Найти сумму полученных значений.
         *
         * 4. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
        /*
        Fibonacci fibonacci = new Fibonacci(20);
        int fibonacciSum = 0;
        for(int value : fibonacci){
        fibonacciSum += value;
        }
*/
       Fibonacci demoFibo = new Fibonacci(20);
       int fiboArraySum = Arrays.stream(Fibonacci.fibonacciArray).sum();

    }
}
