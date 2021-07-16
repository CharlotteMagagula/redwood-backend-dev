package atmsystem;


import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class Main {

    public static void main(String[] args) {
        try {
            File myObj = new File("accountinfo.csv"); //reading users from a file
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();


            String userName = "Charlotte";
            String password = "5432";
            double balance = 3500;

            Scanner bankScanner = new Scanner(System.in);
            System.out.println("Please Enter Your PIN Number ");
            String enteredPassword = bankScanner.nextLine();

            if (enteredPassword.equalsIgnoreCase(password)) {
                System.out.println("Account Name Holder : " + userName);
                System.out.println("Please choose the following options ");

                System.out.println("1 - Check Balance , 2 - Deposit Amount , 3 - Withdraw Amount , 4 - Transfer");
                int userChoice = bankScanner.nextInt();

                if (userChoice == 1) {
                    System.out.println("Your Current Balance is " + balance);
                }else if (userChoice == 2) {

                    System.out.println("Please Enter The Amount To Deposit ");
                    double depositAmount = bankScanner.nextDouble();

                    balance += depositAmount;
                    System.out.println("You have successfully deposited " + depositAmount
                            + " \nNow your balance is " + balance);
                }   else if (userChoice == 3) {
                    System.out.println("Please Enter the Amount to Withdraw");
                    double withdrawAmount = bankScanner.nextDouble();

                    if (withdrawAmount > balance) {
                        System.out.println("Insufficient Balance. Please Try Again");
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("You have successfully withdraw " + withdrawAmount
                                + " \nNow your balance is " + balance);
                    }
                }else if (userChoice == 4) {
                        System.out.println("Please Enter user name");
                        String name = bankScanner.nextLine();
                        System.out.println("Please Enter the Amount to transfer");
                        double transferAmount = bankScanner.nextDouble();
                        if (transferAmount > balance) {
                            System.out.println("Insufficient Balance. Please Try Again");
                        } else {
                            balance -= transferAmount;
                            System.out.println("You have successfully transfer " + transferAmount
                                    + " to" + name + " \nNow your balance is " + balance);
                        }
                }
                }


            } catch (FileNotFoundException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    }
}

