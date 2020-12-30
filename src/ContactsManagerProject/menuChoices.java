package ContactsManagerProject;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
                System.out.print((i + 1) + " : " + strList.get(i) + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void newContact() {
        String name = input.getString("Provide New Contact Name");
        System.out.println("Enter Phone number for contact (digits only");
        String num = input.getString(7,10);
        addContact newContact = new addContact(name, num);

        try{
            Files.write(
                    p,
                    Arrays.asList(String.format("%-14s | %s", newContact.getName(), newContact.getNumber())),
                    StandardOpenOption.APPEND
            );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void searchContacts(String name) {
        List<String> strList;
        String nameTitle = "            Name";
        String numTitle = "           Number";
        System.out.printf("%-17s | %s \n", nameTitle, numTitle);
        System.out.println("---------------------");
        try{
            strList = Files.readAllLines(p);
            for (int i = 0; i < strList.size(); i++) {
                if (strList.get(i).toLowerCase().contains(name.toLowerCase())) {
                    System.out.println((i + 1) + ": " + strList.get(i) + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deleteContact(){
        System.out.println("Choose the contact you would like to remove:");
        List<String> lines = null;
        int userInput;

        try {
            lines = Files.readAllLines(p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        userInput = input.getInt(1, lines.size());

        List<String> newList = new ArrayList<>();
        for (String line : lines) {
            if (line.equals(lines.get(userInput - 1))) {
                continue;
            }
            newList.add(line);

            try{
                Files.write(
                    p, newList);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }






