package com.lesson;


import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, List<String>> map = new HashMap<>();

        List<String> fioNikolai = new ArrayList<>();
        fioNikolai.add("Николаев");
        fioNikolai.add("Николай");
        fioNikolai.add("Николаевич");

        List<String> fioAlex = new ArrayList<>();
        fioAlex.add("Алексеев");
        fioAlex.add("Алексей");
        fioAlex.add("Алексеевич");

        map.put(234123, fioNikolai);
        map.put(153287, fioAlex);


        for (Map.Entry<Integer, List<String>> people : map.entrySet()) {
            System.out.println(people.getKey());
            for (String fio : people.getValue()) {
                System.out.println("\t" + fio);
            }
            System.out.println(" ");
        }


//        for (String fio : map.get(153287)){
//            System.out.println(fio);
//        }


    }
}
