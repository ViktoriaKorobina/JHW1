package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        double average = list.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(n -> n)
                .average()
                .orElse(0);
        System.out.println("Среднее значение: " + average);
    }
}