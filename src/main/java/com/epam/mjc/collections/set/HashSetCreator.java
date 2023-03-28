package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> integers = new HashSet<>();
        for (int element : sourceList
        ) {
            if (element % 2 == 0) {
                integers.add(element);
                while (element % 2 == 0) {
                    element /= 2;
                    integers.add(element);
                }
            } else if (element % 2 != 0) {
                integers.add(element);
                integers.add(element * 2);
            }
        }
        return integers;
    }
}
