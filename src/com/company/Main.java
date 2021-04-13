package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String[] array1 = {"a1", "a2", "a3"};
//        for(int i = 0; i < array1.length; i++){
//            array1[i] += " number";
//        }
//
//        for(String s1 : array1){
//            s1 +=  "number";
//        }

        Stream<String> streamOfStrings = Arrays.stream(array1);
        streamOfStrings.map(x -> {
            x += " number";
            return  x;
        }).map(x ->{
            x += " .";
            return x;
        }).forEach(x -> System.out.println(x));

        Integer[] array2 = {1, 2, 3, 4, 5, 4, 3, 2, 1};
//        Stream<Integer> numberStream = Arrays.stream(array2);
//        numberStream.map(x -> {
//            x *= 10;
//            return x;
//        }).filter(x -> x > 30).forEach(x -> System.out.println(x));
        List<Integer> list2 = Arrays.asList(array2);
        List<Integer> listSorted = list2.stream().filter(x -> x < 4).collect(Collectors.toList());
        for(Integer i : listSorted){
            System.out.println(i);


        List<String> roomNumbers =
                Arrays.stream(array2).map(x ->{
                    return "Room " + x;
                }).collect(Collectors.toList());
        }
    }
}
