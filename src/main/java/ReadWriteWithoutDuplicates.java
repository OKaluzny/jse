import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadWriteWithoutDuplicates {

    public static void main(String args[]) throws IOException {
        //Read from file
        String entryListId = "D://Doc1.txt";
        //collection strings with duplicates
        List<String> listId = new ArrayList<>();
        //Set<String> listId = new TreeSet<>();

        try (Stream<String> stream = Files.lines(Paths.get(entryListId))) {

            listId = stream.distinct()   // deleted duplicates
                    //.filter(line -> !line.startsWith("line"))  -> filter line 3
                    // .map(String::toUpperCase)                 -> convert all content to upper case
                    .collect(Collectors.toList());//subList(0,5);               // convert it into a List

        } catch (IOException e) {
            e.printStackTrace();
        }

        listId.forEach(System.out::println);
        //Write in file (without duplicates)
        Files.write(Paths.get("D://demo.xlsx"), listId, StandardOpenOption.CREATE);
    }
}
