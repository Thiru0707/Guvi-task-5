package Task5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Gifts {
    public static void main(String[] args) {
     
        List<String> students = Arrays.asList(
            "Arasu", "Sabari", "Sandy", "Arun", "Avengers",
            "Uma", "Alan", "Satheesh", "Aaron", "Gowri"
        );

       
        List<String> specialGiftStudents = students.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

    
        System.out.println("Students receiving special gifts: " + specialGiftStudents);
    }
}