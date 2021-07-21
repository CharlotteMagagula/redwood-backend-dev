package atmsystem;


import java.io.*;
import java.util.Scanner; // Import the Scanner class to read text files


public class AtmSystem {
    static Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        BufferedReader csvReader = new BufferedReader(new FileReader("accountInfo.csv"));
        String row;
        String[][] accountInfo = new String[4][4];
        int i = 0;

        while ((row = csvReader.readLine()) != null) {
            String[] data = row.split(",");
            accountInfo[i] = data;
            i++;
        }
        boolean loggedIn = logIn(accountInfo); //call login method

        System.out.println("Please choose the following options ");
        System.out.println("1 - Check Balance\n 2 - Deposit Amount\n  3 - Withdraw Amount\n  4 - Transfer\n");
        int userChoice = myObj.nextInt();

           String amount = "0.00";

        while (loggedIn) {
            switch (userChoice) {
                case 1:
                    checkBalance(accountInfo,amount);
                    break;
                case 2:
                    deposit(amount);
                    break;
                case 3:
                    withdrawal(amount);
                    break;
                case 4:
                    transfer(amount);
                    break;
                default:
                    System.out.println("option selected does not exist");
                    break;
            }

        }

    }
        static boolean logIn(String[][]accountInfo){
            System.out.println("***********LogIn**********");

            System.out.println("Enter username to log in");
            String userName = myObj.nextLine();

            System.out.println("Enter password to log in");
            String password = myObj.nextLine();

            for (int j = 0; j < accountInfo.length; j++) {
                if (userName.equalsIgnoreCase(accountInfo[j][0].trim())) {
                    if (password.equals(accountInfo[j][1].trim())) {
                        return true;
                    }
                    return false;
                }
            }
            return true;
        }
        private double accountBalance;

        public static void checkBalance(String[][] accountInfo, String balance){
            for (int k = 0; k < accountInfo.length; k++) {
                if (balance.equals(accountInfo[k][2])) {
                    System.out.println("Your Current Balance is " + balance);
                }
            }
        }

        public static void deposit( String balance) {
            System.out.println("Please Enter The Amount To Deposit ");
            double depositAmount = myObj.nextDouble();
            double newBalance = Double.parseDouble(balance) + depositAmount;
            System.out.println("You have successfully deposited " + depositAmount
                    + " \nNow your balance is " + newBalance);
        }

        public static void withdrawal( String balance) {
            System.out.println("Please Enter the Amount to Withdraw");
            double withdrawAmount = myObj.nextDouble();

            if (withdrawAmount > Double.parseDouble(balance)) {
                System.out.println("Insufficient Balance. Please Try Again");
            } else {
                double remainBalance = Double.parseDouble(balance) - withdrawAmount;
                System.out.println("You have successfully withdraw " + withdrawAmount
                        + " \nNow your balance is " + remainBalance);
            }

        }
        public static void transfer( String balance) {
            System.out.println("Please Enter user name");
            String name = myObj.nextLine();
            System.out.println("Please Enter the Amount to transfer");
            double transferAmount = myObj.nextDouble();
            if (transferAmount > Double.parseDouble(balance)) {
                System.out.println("Insufficient Balance. Please Try Again");
            } else {
                double remainBalance = Double.parseDouble(balance) - transferAmount;
                System.out.println("You have successfully transfer " + transferAmount
                        + " to" + name + " \nNow your balance is " + remainBalance);
            }
        }
    }




