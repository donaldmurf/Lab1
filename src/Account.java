import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Account {
    //Record ID(4 digits), First name (8 char), Last name (8 char), Phone Number (12 characters), Max accounts (20)
    int recordID;
    String firstName;
    String lastName;
    String phoneNumber;


    //SETTERS//
    public void setRecordID(int recordID) {
        this.recordID = recordID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //GETTERS//
        public int getRecordID() {
        return recordID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}

//UNUSED CODE FOR WHEN FIRST NAME, LAST NAME AND PHONE NUMBER WERE GOING TO BE STORED AS AN ARRAY

//    //store  first name @[1];
//    char[] firstToArray = new char[infoArray[1].length()];
//        for (int i = 0; i < firstToArray.length; i++) {
//        firstToArray[i] = infoArray[i].charAt(i);
//        }
//        setFirstName(firstToArray);
//
//        //store last name @[2];
//        char[] lastToArray = new char[infoArray[2].length()];
//        for (int i = 0; i < lastToArray.length; i++) {
//        lastToArray[i] = infoArray[i].charAt(i);
//        }
//        setLastName(lastToArray);
//
//        //store phone# @[3];
//        char[] phoneNum = new char[infoArray[3].length()];
//        for (int i = 0; i < phoneNum.length; i++) {
//        phoneNum[i] = infoArray[i].charAt(i);
//        }
//        setPhoneNumber(phoneNum);



//UNUSED CODE FOR WHEN I HAD THE ADD() FUNCTION ASK THE USER TO ENTER ALL INFO
//   System.out.println("Enter account info (ID FIRST LAST PHONE#:) ");
//
//           //split input into array
//           Scanner scanner = new Scanner(System.in);
//           String infoString = scanner.nextLine();
//           String[] infoArray =  infoString.split(" ");
//
//
//           //Store elements into class variables
//           setRecordID(Integer.valueOf( infoArray[0]));
//           setFirstName(infoArray[1]);
//           setLastName(infoArray[2]);
//           setPhoneNumber(infoArray[3]);