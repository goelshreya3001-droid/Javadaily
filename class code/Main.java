import java.util.*;

public class Main {
    public static void main(String[] args) {

//         List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

//         list.stream()
//             .filter(x -> x % 2 == 0)   // 2,4,6
//             .map(x -> x * x)           // 4,16,36
//             .sorted()                  // sorted
//             .forEach(System.out::println);
//     }
// }
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

// Step 1: Filter
List<Integer> filtered = list.stream()
        .filter(x -> x % 2 == 0)
        .toList();

System.out.println("After filter: " + filtered);

// Step 2: Map
List<Integer> mapped = filtered.stream()
        .map(x -> x * x)
        .toList();

System.out.println("After map: " + mapped);

// Step 3: Sorted
List<Integer> sorted = mapped.stream()
        .sorted()
        .toList();

System.out.println("After sorted: " + sorted);
    }
}//