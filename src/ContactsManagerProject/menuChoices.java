package ContactsManagerProject;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.nio.file.Files;


public class menuChoices {
    static Input input = new Input();
    static Path p = Paths.get("src", "data", "contacts.txt");


    public static void showContacts() {
        List<String> strList;
        String name = "        Name";
        String num = "     Number";
        System.out.printf("%-18s | %s \n", name, num);
        System.out.println("---------------");
        try {
            strList = Files.readAllLines(p);
            for (int i = 0; i < strList.size(); i++) {
                System.out.printf((i + 1) + " : " + strList.get(i) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
