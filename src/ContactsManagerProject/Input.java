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

//    public int getInt(){
//        try{
//            int userNumber = Integer.valueOf( scanner.nextLine() );
//            return userNumber;
//        } catch (Exception e){
//            System.out.println("Invalid input.");
//            return getInt();
//        }
//    }

    public int getInt(int min, int max){
        System.out.format("Choose number between %s and %s: \n", min, max);

        try{
            int userNum = Integer.parseInt( scanner.nextLine() );;

            if ( userNum >= min && userNum  <= max){
                return userNum;
            }else {
                System.out.format("invalid number, choose number between %s and %s: \n", min, max);
                return getInt(min, max);
            }
        }catch (Exception e){
            System.out.println("Not valid integer");
            return getInt(min, max);
        }
    }

    public int getInt(){
        try{
            int userNum = Integer.valueOf( scanner.nextLine() );
            return userNum;

        }catch (Exception e){
            System.out.println("Not valid integer");
            return getInt();
        }
    }


//  Will add to PSVM
//    public char getChar(Scanner charScanner){
//
//        return System.out.println(getString().startsWith());
//    }

    //int


    //string
    //char
}
