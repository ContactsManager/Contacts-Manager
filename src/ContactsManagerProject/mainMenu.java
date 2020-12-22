package ContactsManagerProject;

//Why is this extended?
public class mainMenu extends menuChoices {
    public static void showMenu(){
        boolean stayOn = true;

        do {
            System.out.println("1. View contacts. \n " +
                    "2. Add contact \n" +
                    "3. Search contact (name)" +
                    "4. Delete contact" +
                    "5. Exit\n");
            //This will run off of input
            int userChoice = input.getInt(1, 5);



            switch(userChoice){
                case 1:
                    System.out.println("\n");
                    //Will run off of input
                    showContacts();
                    break;

                case 2:
                    System.out.println("No worky");
                            break;
//                case 2:
//                    //Will run off of input
//                    newContact();
//                    System.out.println("\n");
//                    //Shows added contact
//                    showContacts();
//                    System.out.println("\n");
//                    break;
//                case 3:
//                    //Will run off of input
//                    String findName = Input.getString("Choose a name:");
//                    System.out.println("\n");
//                    //CRUD
//                    searchContacts(findName);
//                    System.out.println("\n");
//                    break;
//                case 4:
//                    System.out.println("\n");
//                    showContacts();
//                    System.out.println("\n");
//                    //CRUD
//                    deleteContact();
//                    System.out.println("\n");
//                    //Verify deleted
//                    showContacts();
//                    System.out.println("\n");
//                    break;
//                case 5:
//                    stayOn = false;
//                    System.out.println("Critical ERROR! So long!");
//                    break;
            }
        }while(stayOn);
    }
}
