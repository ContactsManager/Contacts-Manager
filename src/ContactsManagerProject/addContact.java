package ContactsManagerProject;

public class addContact {
    private String name;
    private String number;

    public addContact(String name, String number) {
        this.name = name;
        setNumber(number);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number){
        String newNum = "";
        if(number.length() == 7){
            newNum = number.replaceFirst("(\\d{3})(\\d+)", "$1-$2"); //selects first 3 digits, adds remaining to the end.
        }else if(number.length() == 10){
            newNum = number.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3"); // selects first 3 digits, second 3 digits, adds remaining to the end.
        }
        this.number = newNum;
    }


}
