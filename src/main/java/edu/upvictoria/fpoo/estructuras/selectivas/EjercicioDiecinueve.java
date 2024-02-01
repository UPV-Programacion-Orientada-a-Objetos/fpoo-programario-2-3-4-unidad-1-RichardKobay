package edu.upvictoria.fpoo.estructuras.selectivas;

import edu.upvictoria.fpoo.helpers.Scanner;

import java.util.*;

public class EjercicioDiecinueve {
    public void getOrderedPeople (Map<String, Integer> map) {
        List<String> peopleOrdered = new ArrayList<>(map.keySet());
        Collections.sort(peopleOrdered);

        System.out.println("The younger person is: " + peopleOrdered.get(0));
        System.out.println("The older person is: " + peopleOrdered.get(2));
    }

    public EjercicioDiecinueve () {
        Scanner scanner = new Scanner();
        Map<String, Integer> map = new HashMap<>();

        map.put(scanner.readLine("Give me the name of the first person"),
                scanner.readInt("Give me the age of this person"));

        map.put(scanner.readLine("Give me the name of the second person"),
                scanner.readInt("Give me the age of this person"));

        map.put(scanner.readLine("Give me the name of the third person"),
                scanner.readInt("Give me the age of this person"));

        getOrderedPeople(map);
    }
}
