package emailapp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String company;
    private String alternateEmail;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 16;
    private String companySuffix = "SAMSUNG.com";
    private String email;
    //Contructor to receive first and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created: " + this.firstName + " " + this.lastName);

        // Call a method asking for the department - return department
        this.department = setDepartment(); 
        System.out.println("Department: " + this.department);

        // Call a mathod that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Password is: " + this.password);

        // Combine email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + companySuffix;
        System.out.println(email);
    }
    // Ask for the department
    private String setDepartment() {
        System.out.print("Department code\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter code choice: ");
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
        in.close();
        return switchResult;


    }
    // Generate a random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIKLMNOPQRSTYWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i=0; i<length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // Set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    // Set alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }
    // Change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public int getMailboxCapacity() {return mailBoxCapacity; }
    public String getAlternateEmail() {return alternateEmail; }
    public String getPassword() {return password; }
}