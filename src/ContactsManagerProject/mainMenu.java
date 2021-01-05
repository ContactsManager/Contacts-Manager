package ContactsManagerProject;


public class mainMenu extends menuChoices {
    public static void showMenu(){
        boolean stayOn = true;

        do {
            System.out.println("1. View contacts. \n " +
                    "2. Add contact \n" +
                    "3. Search contact (name)\n" +
                    "4. Delete contact\n" +
                    "5. Exit\n");

            int userChoice = input.getInt(1, 5);



            switch(userChoice){
                case 1:
                    System.out.println("\n");
                    showContacts();
                    break;
                case 2:
                    newContact();
                    System.out.println("\n");
                    showContacts();
                    System.out.println("\n");
                    break;
                case 3:
                    String findName = input.getString("Choose a name:");
                    System.out.println("\n");
                    searchContacts(findName);
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("\n");
                    showContacts();
                    System.out.println("\n");
                    deleteContact();
                    System.out.println("\n");
                    showContacts();
                    System.out.println("\n");
                    break;
                case 5:
                    stayOn = false;
                    System.out.println("Critical ERROR! So long!");
                    break;
            }
        }while(stayOn);
    }
}
