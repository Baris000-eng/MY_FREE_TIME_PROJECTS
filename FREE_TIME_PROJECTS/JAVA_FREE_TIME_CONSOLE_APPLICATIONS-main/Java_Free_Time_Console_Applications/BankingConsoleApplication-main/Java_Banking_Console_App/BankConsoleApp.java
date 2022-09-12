import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BankConsoleApp {

    private static int totalWithdrawalAmount = 0;
    private static int totalDepositAmount = 0;
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_WHITE = "\u001B[37m";
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_GREEN = "\u001B[32m";

    public static final String BLACK_BOLD = "\033[1;30m";

    public static final String RED_BOLD = "\033[1;31m";

    public static final String GREEN_BOLD = "\033[1;32m";

    public static final String YELLOW_BOLD = "\033[1;33m";

    public static final String PURPLE_BOLD = "\033[1;35m";

    public static final String CYAN_BOLD = "\033[1;36m";

    public static final String WHITE_BOLD = "\033[1;37m";

    public static final String BLUE_BOLD = "\033[1;34m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";

    public static final String ANSI_RESET_BACKGROUND = "\u001B[0m";


    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";

    private static int money = 1000;
    private static String colorOfText = "";
    private static String colorOfTextBackground = "";
    private static User user;

    private static String username;
    private static String password;
    private static String name;
    private static String surname;


    public static void main(String[] args) {
        System.out.print("-------- Welcome to the Banking Console App -------\n");
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        name = s.nextLine();
        System.out.println("Please enter your surname: ");
        surname = s.nextLine();
        System.out.println("Please enter your username: ");
        username = s.nextLine();
        System.out.println("Please enter your password: ");
        password = s.nextLine();

        user = new User(name,surname,username,password);
        System.out.print("Enter your text color choice: \n");
        Scanner scanner = new Scanner(System.in);
        String textColor = scanner.nextLine();
        System.out.print("Enter your text background choice: \n");
        String backgroundColor = scanner.nextLine();
        System.out.println("Enter your text boldness choice: ");
        String boldOption = scanner.nextLine();
        if (backgroundColor.toLowerCase().contentEquals("black")) {
            colorOfTextBackground = ANSI_BLACK_BACKGROUND;
        } else if (backgroundColor.toLowerCase().contentEquals("red")) {
            colorOfTextBackground = ANSI_RED_BACKGROUND;
        } else if (backgroundColor.toLowerCase().contentEquals("yellow")) {
            colorOfTextBackground = ANSI_YELLOW_BACKGROUND;
        } else if (backgroundColor.toLowerCase().contentEquals("green")) {
            colorOfTextBackground = ANSI_GREEN_BACKGROUND;
        } else if (backgroundColor.toLowerCase().contentEquals("purple")) {
            colorOfTextBackground = ANSI_PURPLE_BACKGROUND;
        } else if (backgroundColor.toLowerCase().contentEquals("white")) {
            colorOfTextBackground = ANSI_WHITE_BACKGROUND;
        } else if (backgroundColor.toLowerCase().contentEquals("blue")) {
            colorOfTextBackground = ANSI_BLUE_BACKGROUND;
        } else if (backgroundColor.toLowerCase().contentEquals("cyan")) {
            colorOfTextBackground = ANSI_CYAN_BACKGROUND;
        }

        if (boldOption.toLowerCase().contentEquals("no") || boldOption.toLowerCase().contentEquals("n")) {
            if (textColor.toLowerCase().contentEquals("blue") || textColor.toLowerCase().contentEquals("bl")) {
                colorOfText = TEXT_BLUE;
            } else if (textColor.toLowerCase().contentEquals("green") || textColor.toLowerCase().contentEquals("gr")) {
                colorOfText = TEXT_GREEN;
            } else if (textColor.toLowerCase().contentEquals("red") || textColor.toLowerCase().contentEquals("r")) {
                colorOfText = TEXT_RED;
            } else if (textColor.toLowerCase().contentEquals("cyan") || textColor.toLowerCase().contentEquals("cy")) {
                colorOfText = TEXT_CYAN;
            } else if (textColor.toLowerCase().contentEquals("purple") || textColor.toLowerCase().contentEquals("pur")) {
                colorOfText = TEXT_PURPLE;
            } else if (textColor.toLowerCase().contentEquals("black") || textColor.toLowerCase().contentEquals("bla")) {
                colorOfText = TEXT_BLACK;
            } else if (textColor.toLowerCase().contentEquals("white") || textColor.toLowerCase().contentEquals("wh")) {
                colorOfText = TEXT_WHITE;
            } else if (textColor.toLowerCase().contentEquals("yellow") || textColor.toLowerCase().contentEquals("yel")) {
                colorOfText = TEXT_YELLOW;
            }
        } else if (boldOption.toLowerCase().contentEquals("yes") || boldOption.toLowerCase().contentEquals("y")) {
            if (textColor.toLowerCase().contentEquals("blue") || textColor.toLowerCase().contentEquals("bl")) {
                colorOfText = BLUE_BOLD;
            } else if (textColor.toLowerCase().contentEquals("green") || textColor.toLowerCase().contentEquals("gr")) {
                colorOfText = GREEN_BOLD;
            } else if (textColor.toLowerCase().contentEquals("red") || textColor.toLowerCase().contentEquals("r")) {
                colorOfText = RED_BOLD;
            } else if (textColor.toLowerCase().contentEquals("cyan") || textColor.toLowerCase().contentEquals("cy")) {
                colorOfText = CYAN_BOLD;
            } else if (textColor.toLowerCase().contentEquals("purple") || textColor.toLowerCase().contentEquals("pur")) {
                colorOfText = PURPLE_BOLD;
            } else if (textColor.toLowerCase().contentEquals("black") || textColor.toLowerCase().contentEquals("bla")) {
                colorOfText = BLACK_BOLD;
            } else if (textColor.toLowerCase().contentEquals("white") || textColor.toLowerCase().contentEquals("wh")) {
                colorOfText = WHITE_BOLD;
            } else if (textColor.toLowerCase().contentEquals("yellow") || textColor.toLowerCase().contentEquals("yel")) {
                colorOfText = YELLOW_BOLD;
            }
        }

        while (true) {
            System.out.println(colorOfTextBackground + colorOfText + "Bank Operation Choices \n" +
                    "1: Withdraw Money\n" +
                    "2: Deposit Money\n" +
                    "3: Exit\n" +
                    "4: Check Current Money\n" +
                    "5: Show Main Menu\n" +
                    "6: Go to Home Page\n" +
                    "7: Show My Bank Operation Summary\n"+
                    "8: Update your username\n" +
                    "9: Update your password\n" +
                    "10: Display user info\n"
            );

            System.out.println("Do you want to reset the text color? ");
            Scanner resetOption = new Scanner(System.in);
            String reset = resetOption.nextLine();
            System.out.println("Do you want to reset the text background color? ");
            String resetBackground = resetOption.nextLine();
            if ((reset.toLowerCase().contentEquals("y") || reset.toLowerCase().contentEquals("yes"))
                    && ((resetBackground.toLowerCase().contentEquals("n")) || (resetBackground.toLowerCase().contentEquals("no")))) {
                colorOfText = TEXT_RESET;
            } else if ((reset.toLowerCase().contentEquals("n") || reset.toLowerCase().contentEquals("no"))
                    && ((resetBackground.toLowerCase().contentEquals("y")) || (resetBackground.toLowerCase().contentEquals("yes")))) {
                colorOfTextBackground = ANSI_RESET_BACKGROUND;
            } else if ((reset.toLowerCase().contentEquals("y") || reset.toLowerCase().contentEquals("yes"))
                    && ((resetBackground.toLowerCase().contentEquals("y")) || (resetBackground.toLowerCase().contentEquals("yes")))) {
                colorOfText = TEXT_RESET;
                colorOfTextBackground = ANSI_RESET_BACKGROUND;
            }

            Scanner sc = new Scanner(System.in);
            try {
                System.out.print(colorOfTextBackground + colorOfText + "Enter your bank operation choice: \n");
                int choice = sc.nextInt();

                if (choice == 1) {
                        System.out.println(colorOfTextBackground + colorOfText + "Your current money is: " + getMoney());
                        System.out.println(colorOfTextBackground + colorOfText + "Enter the amount that you want to withdraw: ");
                        Scanner scan = new Scanner(System.in);
                        int amount = scan.nextInt();
                        if(moneyAfterWithdrawal(amount)>=0) {
                            withdrawMoney(amount);
                            totalWithdrawalAmount += amount;
                            System.out.println(colorOfTextBackground + colorOfText + "You have withdrawed " + amount + " TL !");
                            System.out.println(colorOfTextBackground + colorOfText + "Your current money after your withdrawal is: " + getMoney() + "\n");
                        } else {
                            System.out.println("You cannot withdraw money from your bank account !");
                        }

                } else if (choice == 2) {
                    System.out.println(colorOfTextBackground + colorOfText + "Your current money is: " + getMoney());
                    System.out.println(colorOfTextBackground + colorOfText + "Enter the amount that you want to deposit: ");
                    Scanner scn = new Scanner(System.in);
                    int amount = scn.nextInt();
                    depositMoney(amount);
                    totalDepositAmount += amount;
                    if(moneyAfterDeposit(amount) == Integer.MAX_VALUE) {
                        System.out.println("Your bank account capacity is not sufficient to keep this much money ! \n" +
                                "You cannot deposit money !");
                    }
                    System.out.println(colorOfTextBackground + colorOfText + "You have deposited " + amount + " TL !");
                    System.out.println(colorOfTextBackground + colorOfText + "Your current money after your deposit is: " + getMoney() + "");
                } else if (choice == 3) {
                    System.out.println("You are exiting your bank account ...");
                    break;
                } else if (choice == 4) {
                    System.out.println(colorOfTextBackground + colorOfText + "You have currently " + getMoney() + " TL in your account !");
                } else if (choice == 5) {
                    String[] choicesArray = {"1: Withdraw Money, ", "2: Deposit Money, ", "3: Exit, ", "4: Check Current Money, ", "5: Show Main Menu, ", "6: Go to Home Page, ","7: Show My Bank Operation Summary", "8: Update your username","9: Update your password\n","10: Display my user info"};
                    List<String> choiceList = Arrays.asList(choicesArray);
                    for (String operation : choiceList) {
                        System.out.println(colorOfTextBackground + colorOfText + operation);
                    }
                } else if (choice == 6) {
                    welcomeToOurBank();
                } else if (choice == 7) {
                    showOperationSummary();
                } else if(choice == 8) {
                    System.out.println("Your current username is: "+user.getUsername());
                    updateUsername();
                    System.out.println("Your new username is: "+user.getUsername());
                } else if(choice == 9) {
                    System.out.println("Your current password is: "+user.getPassword());
                    updatePassword();
                    System.out.println("Your new password is: "+user.getPassword());
                } else if(choice == 10) {
                    displayUserInfo();
                }else {
                    System.out.println(colorOfTextBackground + colorOfText + "Invalid operation choice ! ");
                }
            } catch (InputMismatchException ime) {
                System.out.println("Invalid input is entered ! Input mismatch exception has occurred !!! ");
            } catch (ArithmeticException e) {
                System.out.println("An arithmetic exception has occurred !!! ");
            }
        }


    }

    private static void showOperationSummary() {
        System.out.println("You have withdrawed " + totalWithdrawalAmount + " TL in total.");
        System.out.println("You have deposited " + totalDepositAmount + " TL in total.");
    }


    public static void welcomeToOurBank() {
        System.out.println(colorOfTextBackground + colorOfText + "------ Welcome to our bank Dear "+user.getName()+" "+user.getSurname()+", please enter 5 to see the bank operation choices -------");
    }

    public static void updateUsername() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(colorOfTextBackground + colorOfText +"Please enter the new username you want to set: ");
        String u = scanner.nextLine();
        username = u;
        user.setUsername(username);
    }

    public static void updatePassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(colorOfTextBackground + colorOfText +"Please enter the new password you want to set: ");
        String pass = scanner.nextLine();
        password = pass;
        user.setPassword(password);
    }


    public static void displayUserInfo() {
        System.out.println(colorOfTextBackground + colorOfText +"Your name: "+user.getName());
        System.out.println(colorOfTextBackground + colorOfText +"Your surname: "+user.getSurname());
        System.out.println(colorOfTextBackground + colorOfText +"Your username: "+user.getUsername());
        System.out.println(colorOfTextBackground + colorOfText +"Your password: "+user.getPassword()+"\n");
    }


    public static void withdrawMoney(int amount) {
        money = money - amount;
    }

    public static int moneyAfterWithdrawal(int amount) {
        return getMoney() - amount;
    }

    public static int moneyAfterDeposit(int amount) {
        return getMoney() + amount;
    }

    public static int getMoney() {
        return money;
    }

    public static void depositMoney(int amount) {
        money = money + amount;
    }

}
