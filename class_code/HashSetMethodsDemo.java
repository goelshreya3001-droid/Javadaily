import java.util.HashSet;
import java.util.Iterator;

public class HashSetMethodsDemo {
    public static void main(String[] args) {

        // 1. Create HashSet
        HashSet<String> set = new HashSet<>();

        // 2. add(E e)
        set.add("Apple");
        set.add("Banana");
        set.add("Mango");
        set.add("Apple"); // duplicate

        System.out.println("After add(): " + set);

        // 3. size()
        System.out.println("Size: " + set.size());

        // 4. isEmpty()
        System.out.println("Is empty? " + set.isEmpty());

        // 5. contains(Object o)
        System.out.println("Contains Mango? " + set.contains("Mango"));

        // 6. remove(Object o)
        set.remove("Banana");
        System.out.println("After remove(): " + set);

        // 7. iterator()
        Iterator<String> it = set.iterator();
        System.out.print("Using Iterator: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // 8. forEach() (Java 8+)
        System.out.print("Using forEach(): ");
        set.forEach(item -> System.out.print(item + " "));
        System.out.println();

        // 9. clone()
        HashSet<String> clonedSet = (HashSet<String>) set.clone();
        System.out.println("Cloned set: " + clonedSet);

        // 10. addAll(Collection c)
        HashSet<String> set2 = new HashSet<>();
        set2.add("Orange");
        set2.add("Grapes");

        set.addAll(set2);
        System.out.println("After addAll(): " + set);

        // 11. containsAll(Collection c)
        System.out.println("Contains all from set2? " + set.containsAll(set2));

        // 12. removeAll(Collection c)
        set.removeAll(set2);
        System.out.println("After removeAll(): " + set);

        // 13. retainAll(Collection c)
        HashSet<String> set3 = new HashSet<>();
        set3.add("Apple");
        set3.add("Kiwi");

        set.retainAll(set3);
        System.out.println("After retainAll(): " + set);

        // 14. clear()
        set.clear();
        System.out.println("After clear(): " + set);

        // 15. equals(Object o)
        HashSet<String> a = new HashSet<>();
        HashSet<String> b = new HashSet<>();
        a.add("X");
        b.add("X");

        System.out.println("a equals b? " + a.equals(b));

        // 16. hashCode()
        System.out.println("HashCode of a: " + a.hashCode());
    }
}