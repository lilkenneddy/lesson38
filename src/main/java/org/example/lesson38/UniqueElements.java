package org.example.lesson38;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElements {
    public static <integer> List<integer> getFirstOccurrences(List<integer> numbers) {
        Set<integer> seen = new HashSet<>();
        List<integer> result = new ArrayList<>();
        for (integer num : numbers) {
            if (!seen.contains(num)) {
                seen.add(num);
                result.add(num);
            }
        }
        return result;
    }
}