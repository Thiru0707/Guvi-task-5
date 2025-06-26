package Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNonEmptyStrings {
    public static void main(String[] args) {
        List<String> listStrings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

     
        List<String> NES = listStrings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println(NES);
    }
}