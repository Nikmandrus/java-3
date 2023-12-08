import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int numberOfExecutions = 1000; // Измените значение в соответствии с требованиями задачи

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

// Запуск тестирования методов add, delete, get для ArrayList
        long arrayListAddTime = testAdd(arrayList, numberOfExecutions);
        long arrayListDeleteTime = testDelete(arrayList, numberOfExecutions);
        long arrayListGetTime = testGet(arrayList, numberOfExecutions);

// Запуск тестирования методов add, delete, get для LinkedList
        long linkedListAddTime = testAdd(linkedList, numberOfExecutions);
        long linkedListDeleteTime = testDelete(linkedList, numberOfExecutions);
        long linkedListGetTime = testGet(linkedList, numberOfExecutions);

// Вывод результатов в виде таблицы
        System.out.println("Метод\t\tКоличество вызовов\t\tВремя выполнения (мс)");
        System.out.println("add (ArrayList)\t\t" + numberOfExecutions + "\t\t\t" + arrayListAddTime);
        System.out.println("delete (ArrayList)\t" + numberOfExecutions + "\t\t\t" + arrayListDeleteTime);
        System.out.println("get (ArrayList)\t\t" + numberOfExecutions + "\t\t\t" + arrayListGetTime);
        System.out.println("add (LinkedList)\t" + numberOfExecutions + "\t\t\t" + linkedListAddTime);
        System.out.println("delete (LinkedList)\t" + numberOfExecutions + "\t\t\t" + linkedListDeleteTime);
        System.out.println("get (LinkedList)\t" + numberOfExecutions + "\t\t\t" + linkedListGetTime);
    }

    public static long testAdd(List<Integer> list, int numberOfExecutions) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numberOfExecutions; i++) {
            list.add(i);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long testDelete(List<Integer> list, int numberOfExecutions) {
// Предварительно заполняем список
        for (int i = 0; i < numberOfExecutions; i++) {
            list.add(i);
        }

        long startTime = System.currentTimeMillis();

        for (int i = numberOfExecutions - 1; i >= 0; i--) {
            list.remove(i);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static long testGet(List<Integer> list, int numberOfExecutions) {
// Предварительно заполняем список
        for (int i = 0; i < numberOfExecutions; i++) {
            list.add(i);
        }

        long startTime = System.currentTimeMillis();

        for (int i = 0; i < numberOfExecutions; i++) {
            list.get(i);
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
}