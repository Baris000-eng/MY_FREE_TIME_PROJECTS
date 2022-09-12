import java.util.Scanner;

public class CalculatorByUsingTextColorCodes {
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


    public static void main(String[] args) {
        System.out.println("----Welcome to the Calculator Desktop App ---------");
        while (true) {
            System.out.println("Please enter the console output color choice: ");
            Scanner s = new Scanner(System.in);
            String color = s.nextLine();
            System.out.println("Please enter your choice about boldness: ");
            Scanner bold = new Scanner(System.in);
            String str = bold.nextLine();
            String textColor = "";
            if(str.equalsIgnoreCase("NO")) {
                if(color.equalsIgnoreCase("B")){
                    textColor = TEXT_BLUE;
                } else if(color.equalsIgnoreCase("R")){
                    textColor = TEXT_RED;
                } else if(color.equalsIgnoreCase("G")){
                    textColor = TEXT_GREEN;
                } else if(color.equalsIgnoreCase("C")) {
                    textColor = TEXT_CYAN;
                } else if(color.equalsIgnoreCase("W")) {
                    textColor = TEXT_WHITE;
                } else if(color.equalsIgnoreCase("RES")) {
                    textColor = TEXT_RESET;
                } else if(color.equalsIgnoreCase("BL")) {
                    textColor = TEXT_BLACK;
                } else if(color.equalsIgnoreCase("P")) {
                    textColor = TEXT_PURPLE;
                } else if(color.equalsIgnoreCase("Y")) {
                    textColor = TEXT_YELLOW;
                }
            } else if(str.equalsIgnoreCase("YES")) {
                if(color.equalsIgnoreCase("B")){
                    textColor = BLUE_BOLD;
                } else if(color.equalsIgnoreCase("R")){
                    textColor = RED_BOLD;
                } else if(color.equalsIgnoreCase("G")){
                    textColor = GREEN_BOLD;
                } else if(color.equalsIgnoreCase("C")) {
                    textColor = CYAN_BOLD;
                } else if(color.equalsIgnoreCase("W")) {
                    textColor = WHITE_BOLD;
                } else if(color.equalsIgnoreCase("RES")) {
                    textColor = TEXT_RESET;
                } else if(color.equalsIgnoreCase("BL")) {
                    textColor = BLACK_BOLD;
                } else if(color.equalsIgnoreCase("P")) {
                    textColor = PURPLE_BOLD;
                } else if(color.equalsIgnoreCase("Y")) {
                    textColor = YELLOW_BOLD;
                }
            }

            System.out.println(textColor + "Operation Choices: " +
                    "\n1 for summation\n"+
                    "2 for subtraction\n"+
                    "3 for multiplication\n"+
                    "4 for division\n"+
                    "5 for taking power\n"+
                    "6 for taking logarithm\n"+
                    "7 for taking the absolute value\n"+
                    "8 for rounding the number to nearest value\n"+
                    "9 for rounding the number to the nearest value bigger than the number\n"+
                    "10 for rounding the number to the nearest value smaller than the number\n"
            );
            System.out.println(textColor + "Enter choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if(choice ==1 || choice == 2 || choice == 3 || choice == 4 || choice == 5){
                System.out.println(textColor + "Enter the first number: ");
                int firstNum = sc.nextInt();
                System.out.println(textColor + "Enter the second number: ");
                int secondNum = sc.nextInt();
                if(choice == 1) {
                    System.out.println(textColor + "The summation of "+firstNum+" and "+secondNum+" is: "+sum(firstNum,secondNum));
                } else if(choice == 2) {
                    System.out.println(textColor + "The subtraction of "+secondNum+" from "+firstNum+" is: "+subtract(firstNum,secondNum));
                } else if(choice == 3) {
                    System.out.println(textColor + "The multiplication of "+firstNum+" and "+secondNum+" is: "+multiply(firstNum,secondNum));
                } else if(choice == 4) {
                    System.out.println(textColor + ""+firstNum+" divided by "+secondNum+" is: "+divide(firstNum,secondNum));
                } else if(choice == 5) {
                    System.out.println(textColor + ""+firstNum+" to the power of "+secondNum+" is "+power(firstNum,secondNum));
                }
            } else if(choice == 6 || choice==7 || choice==8 || choice==9 || choice==10){
                System.out.println(textColor + "Enter the number: ");
                int num = sc.nextInt();
                if(choice == 6) {
                    System.out.println(textColor + "Logarithm result: "+logarithm(num));
                } else if(choice == 7) {
                    System.out.println(textColor + "Absolute value of "+num+" is: "+absoluteValue(num));
                } else if(choice == 8) {
                    System.out.println(textColor + "Rounding result: "+round(num));
                } else if(choice == 9) {
                    System.out.println(textColor + "Ceiling result: "+ceil(num));
                } else if(choice == 10) {
                    System.out.println(textColor + "Flooring result: "+floor(num));
                }
            } else {
                System.out.println(textColor + "Invalid operation choice !!");
                break;
            }
        }

    }




    public static double ceil(double a) {
        return Math.ceil(a);
    }
    public static double floor(double a) {
        return Math.floor(a);
    }
    public static double round(double a) {
        return Math.round(a);
    }
    public static double absoluteValue(double a) {
        return Math.abs(a);
    }
    public static double logarithm(double a) {
        if(a<=0) {
            System.out.println("Invalid number to take the logarithm !");
            System.exit(0);
        }
        return Math.log(a);
    }
    public static double power(double a, double b) {
        if(a== 0 && b<=0) {
            throw new ArithmeticException();
        }
        return Math.pow(a,b);
    }

    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double sum(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double divide(double a, double b) {
        double div = 0.0;
        try {
           div = a/b;
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
            System.out.println("Invalid division !! The denumerator is 0 !!");
            System.exit(0);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return div;
    }


}
