import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("mango");
        list.add("pomegranate");
        list.add("papaya");

                ArrayList<String> result = list.stream()
                        .filter(s -> s.startsWith("p") || s.startsWith("b"))
                        .map(String::toUpperCase)
                        .sorted()
                        .collect(Collectors.toCollection(ArrayList::new));
                  System.out.println(result);      
            }
        }