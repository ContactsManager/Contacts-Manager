package ContactsManagerProject;

import java.util.Scanner;
import java.io.IOException;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return scanner.nextLine();
    }

    public int getInt(){
        Try{
            int userNumber = Integer.valueOf( scanner.nextLine() );
            return userNumber;
        } catch (Exception e){
            System.out.println("Invalid input.");
            return getInt();
        }
    }

    //int


    //string
    //char
}
