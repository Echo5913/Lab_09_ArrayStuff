import java.util.Scanner;

public class SafeInput {

    // Part A - Get a string that is not blank
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";

        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    // Part B - Get any integer
    public static int getInt(Scanner pipe, String prompt) {
        int value = 0;
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                valid = true;
            } else {
                System.out.println("Invalid input. Enter an integer.");
            }
            pipe.nextLine();
        } while (!valid);

        return value;
    }

    // Part C - Get any double
    public static double getDouble(Scanner pipe, String prompt) {
        double value = 0;
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                valid = true;
            } else {
                System.out.println("Invalid input. Enter a number.");
            }
            pipe.nextLine();
        } while (!valid);

        return value;
    }

    // Part D - Get an integer within a range
    public static int getRangedInt(Scanner pipe, String prompt,
                                   int low, int high) {
        int value = 0;
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextInt()) {
                value = pipe.nextInt();

                if (value >= low && value <= high) {
                    valid = true;
                } else {
                    System.out.println("Number must be between " + low + " and " + high);
                }
            } else {
                System.out.println("Invalid input. Enter an integer.");
            }
            pipe.nextLine();
        } while (!valid);

        return value;
    }

    // Part E - Get a double within a range
    public static double getRangedDouble(Scanner pipe, String prompt,
                                         double low, double high) {
        double value = 0;
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();

                if (value >= low && value <= high) {
                    valid = true;
                } else {
                    System.out.println("Number must be between " + low + " and " + high);
                }
            } else {
                System.out.println("Invalid input. Enter a number.");
            }
            pipe.nextLine();
        } while (!valid);

        return value;
    }

    // Part F - Get a yes or no answer
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String answer = "";

        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            answer = pipe.nextLine().trim().toUpperCase();

            if (!answer.equals("Y") && !answer.equals("N")) {
                System.out.println("Please enter Y or N.");
            }
        } while (!answer.equals("Y") && !answer.equals("N"));

        return answer.equals("Y");
    }

    // Part G - Get a string matching a regular expression
    public static String getRegExString(Scanner pipe, String prompt,
                                        String regEx) {
        String value = "";

        do {
            System.out.print("\n" + prompt + ": ");
            value = pipe.nextLine();

            if (!value.matches(regEx)) {
                System.out.println("Invalid format. Try again.");
            }
        } while (!value.matches(regEx));

        return value;
    }

    // Program 06 - Print a 60-character header
    public static void prettyHeader(String msg) {
        int width = 60;
        int space = width - 6;
        if (msg.length() > space) {
            msg = msg.substring(0, space);
        }

        int left = (space - msg.length()) / 2;
        int right = space - msg.length() - left;

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();

        System.out.print("***");

        for (int i = 0; i < left; i++) {
            System.out.print(" ");
        }

        System.out.print(msg);

        for (int i = 0; i < right; i++) {
            System.out.print(" ");
        }

        System.out.println("***");

        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}