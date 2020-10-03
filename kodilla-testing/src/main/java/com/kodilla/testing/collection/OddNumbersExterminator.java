package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> returnedList = new ArrayList<>();
        if (numbers.size() == 0) {
            System.out.println("The list is empty.");
            return returnedList;
        } else {
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) % 2 == 0)
                    returnedList.add(numbers.get(i));
            }
            return returnedList;
        }
    }
}
