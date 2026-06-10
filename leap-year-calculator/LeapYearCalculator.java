import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = false;

        // Kỹ thuật tách biến để câu lệnh điều kiện rõ ràng, dễ hiểu
        boolean isDivisibleBy4 = year % 4 == 0;

        if (isDivisibleBy4) {
            boolean isDivisibleBy100 = year % 100 == 0;
            if (isDivisibleBy100) {
                boolean isDivisibleBy400 = year % 400 == 0;
                if (isDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        // Hiển thị kết quả ra màn hình
        if (isLeapYear) {
            System.out.printf("%d is a leap year", year);
        } else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}