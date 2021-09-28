import java.io.*;
import java.util.Scanner;


public class Main {

    //Create a file called "Directory" or notify if it exists
    public  static  void CreateDirFile(){
        try{
            File myObj = new File("Directory");
            if( myObj.createNewFile()){
                System.out.println("File created: " + myObj.getName());
            }else{
                System.out.println("File Already Exists.");
            }
        }catch (
                IOException e){
            System.out.println("Error Occurred");
            e.printStackTrace();
        }
    }


    public static void Menu(){

        //Display Menu and show user how to use program
        System.out.println("//////////WELCOME//////////");
        System.out.println();
        System.out.println("Enter a command followed by the information.");
        System.out.println();
        System.out.println("EXAMPLES:");
        System.out.println("ADD 1001 Jinhua Guo 313-123-4567");
        System.out.println("EDIT 1001");
        System.out.println("LIST");
        System.out.println("SHUTDOWN");
        System.out.println("QUIT");

        System.out.println("//////////////////////////");
        System.out.printf("Entry: ");

        //takes the user input and splits it into array
        Scanner scanner = new Scanner(System.in);
       String menuInput = scanner.nextLine();
       String[] menuArray = menuInput.split(" ");

      //create instance of account
       Account account = new Account();

        //Set command to uppercase
             menuArray[0] = menuArray[0].toUpperCase();



       //switch to take first part of input and perform correct action
        switch (menuArray[0]){
            case "ADD":

               // if(menuArray[1].length() >=)




                account.setRecordID(CalculateIDNumber()); //The number of lines in the document +1001 = ID number.
                account.setFirstName(menuArray[1].toUpperCase());
                account.setLastName(menuArray[2].toUpperCase());
                account.setPhoneNumber(menuArray[3]);





                //The standard way of writing into a file for Java WITHOUT OVERWRITE
                try {
                    FileWriter myWriter = new FileWriter("Directory",true);
                    BufferedWriter out = new BufferedWriter(myWriter);
                    out.write(account.getRecordID() + " " + account.getFirstName() + " "+ account.getLastName() + " " + account.getPhoneNumber()+ "\n");
                    out.close();
                    myWriter.close();
                    System.out.println("Account created : " + account.getRecordID() + " " + account.getFirstName() + " "+ account.getLastName() + " " + account.getPhoneNumber());
                } catch (IOException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
                Menu();
                break;
            case "EDIT":
                System.out.println("EDIT picked this is a place holder");

                break;
            case "LIST":
                try {
                    File myObj = new File("Directory");
                    Scanner myReader = new Scanner(myObj);
                    if(!myReader.hasNextLine())
                        System.out.println("The file is currently empty");

                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        System.out.println(data);
                    }
                    myReader.close();
                } catch (FileNotFoundException e) {
                    System.out.println("Unknown Error occured when trying to list all the accounts.");
                    e.printStackTrace();
                }

//                try {
//                    BufferedReader in = new BufferedReader((new FileReader("Directory")));
//                    String line = in.readLine();
//                    if(line == null)
//                        System.out.println("The file is currently empty.");
//
//                    while(line != null){
//                        line = in.readLine();
//                        System.out.println(line);
//
//                    }
//                    in.close();
//
//
//                } catch (FileNotFoundException e) {
//                    e.printStackTrace();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
                Menu();
                break;
            case "SHUTDOWN":
                System.out.println("SHUTDOWN SERVER picked this is a place holder");

                break;
            case "QUIT":
                System.out.println("QUIT CLIENT picked this is a place holder");

                break;
            default:
                System.out.println("Invalid input. Let's Try again.");
                Menu();
                break;
        }















    }

    static int CalculateIDNumber() { // Look through the Directory file and count how many lines are currently in the document. The number of lines in the document +1001 = ID number.
        int count = 1001;

        try {
            File myObj = new File("Directory");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                //System.out.println(data);
                count += 1;
            }
            //System.out.println("The number the next account should be assigned is: " + count);
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return count;
    }


    public static void main(String[] args) {
	// write your code here
        CreateDirFile(); //create the "Directory" file if it does not exist
        Menu();





        


    }
}
