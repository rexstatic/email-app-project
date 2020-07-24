package emailapp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String department;
    private String company;
    private String alternateEmail;
    private int mailBoxCapacity;
    
    //Contructor to receive first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return department
        this.department = setDepartment(); 
        System.out.println("Department: " + this.department);
    }
    // Ask for the department
    private String setDepartment() {
        System.out.print("Department code\n1 for Sales\n2 for Development\n3 for accounting\n0 for none\nEnter code choice: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();

        /* It's done this way to only have one exit with return dep.
        With multiple exits dep wouldn't be needed and a return in switch case would
        replace dep and break; would be removed.
        Mixed signals regarding multiple or one exit*/
        String switchResult = ""; 
        switch(depChoice) {
            case 1:
                switchResult = "Sales";
                break;
            case 2:
                switchResult = "Development";
                break;
            case 3:
                switchResult = "Accounting";
                break;
            case 0:
                switchResult = "";
                break;
        }
        return switchResult;


    }
    // Generate a random password

    // Set mailbox capacity

    // Set alternate email

    // Change the password

}