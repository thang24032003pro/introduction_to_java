import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("out of ability");
        } else {
            System.out.println(readNumber(number));
        }

        scanner.close();
    }

    public static String readNumber(int number) {
        if (number < 10) {
            return readOneDigit(number);
        } else if (number < 20) {
            return readLessThanTwenty(number);
        } else if (number < 100) {
            return readTwoDigits(number);
        } else {
            int hundreds = number / 100;
            int remainder = number % 100;

            if (remainder == 0) {
                return readOneDigit(hundreds) + " hundred";
            } else {
                return readOneDigit(hundreds) + " hundred and " + readNumber(remainder);
            }
        }
    }

    public static String readOneDigit(int number) {
        switch (number) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    public static String readLessThanTwenty(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";
        }
    }

    public static String readTwoDigits(int number) {
        int tens = number / 10;
        int ones = number % 10;

        String tensText = "";

        switch (tens) {
            case 2:
                tensText = "twenty";
                break;
            case 3:
                tensText = "thirty";
                break;
            case 4:
                tensText = "forty";
                break;
            case 5:
                tensText = "fifty";
                break;
            case 6:
                tensText = "sixty";
                break;
            case 7:
                tensText = "seventy";
                break;
            case 8:
                tensText = "eighty";
                break;
            case 9:
                tensText = "ninety";
                break;
        }

        if (ones == 0) {
            return tensText;
        } else {
            return tensText + " " + readOneDigit(ones);
        }
    }
}