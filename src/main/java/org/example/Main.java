import java.util.Arrays;
import java.util.List;

import static org.example.lesson38.MapMerger.mergeMaps;
import static org.example.lesson38.UniqueElements.getFirstOccurrences;

public static void main(String[] args) {
    List<Integer> original = Arrays.asList(1, 2, 3, 2, 4, 1, 5);
    List<Integer> filtered = getFirstOccurrences(original);
    System.out.println(filtered);
}

public static void main() {
    Map<String, Integer> map1 = new HashMap<>();
    map1.put("apple", 2);
    map1.put("banana", 3);

    Map<String, Integer> map2 = new HashMap<>();
    map2.put("banana", 1);
    map2.put("orange", 4);

    Map<String, Integer> merged = mergeMaps(map1, map2);

    System.out.println(merged);
}
