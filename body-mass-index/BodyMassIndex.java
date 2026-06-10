import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        // 1. Nhập dữ liệu từ bàn phím
        System.out.print("Your weight (in kilogram): ");
        weight = scanner.nextDouble();

        System.out.print("Your height (in meter): ");
        height = scanner.nextDouble();

        // 2. Tính chỉ số BMI (Trọng lượng chia cho bình phương chiều cao)
        bmi = weight / Math.pow(height, 2);

        // 3. Hiển thị tiêu đề định dạng cột
        System.out.printf("%-20s%s\n", "bmi", "Interpretation");

        // 4. Phân loại kết quả bằng cấu trúc if-else
        if (bmi < 18.5) {
            System.out.printf("%-20.2f%s\n", bmi, "Underweight");
        } else if (bmi < 25.0) {
            System.out.printf("%-20.2f%s\n", bmi, "Normal");
        } else if (bmi < 30.0) {
            System.out.printf("%-20.2f%s\n", bmi, "Overweight");
        } else {
            System.out.printf("%-20.2f%s\n", bmi, "Obese");
        }
    }
}