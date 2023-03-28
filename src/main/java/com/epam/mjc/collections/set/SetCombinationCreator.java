package com.epam.mjc.collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {



        HashSet<String> hashSet = new HashSet<>(firstSet);
        hashSet.retainAll(secondSet);
        hashSet.removeAll(thirdSet);
        HashSet<String> hashSetTwo = new HashSet<>(thirdSet);
        hashSetTwo.removeAll(firstSet);
        hashSetTwo.removeAll(secondSet);
        hashSet.addAll(hashSetTwo);
        return hashSet;
    }

    public static void main(String[] args) {
        SetCombinationCreator setCombinationCreator = new SetCombinationCreator();
        Set<String> firstSet = new HashSet<>(Arrays.asList("Java", "Collection", "framework", "interface", "class", "Queue"));
        Set<String> secondSet = new HashSet<>(Arrays.asList("Queue", "iterator", "Java", "Collection", "comparator"));
        Set<String> thirdSet = new HashSet<>(Arrays.asList("Java", "Set", "Map", "List"));
        System.out.println(setCombinationCreator.createSetCombination(firstSet, secondSet, thirdSet));
    }
}
