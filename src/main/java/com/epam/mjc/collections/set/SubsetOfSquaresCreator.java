package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int element : sourceList
        ) {
            int elementSquared = (int) Math.pow(element, 2);
            if (elementSquared >= lowerBound && elementSquared <= upperBound) {
                treeSet.add(elementSquared);
            }
        }
        return treeSet;
    }
}
