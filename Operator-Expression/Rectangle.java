import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;

        // Khai báo đối tượng Scanner để nhập dữ liệu từ bàn phím
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat(); // Nhập chiều rộng

        System.out.println("Enter height: ");
        height = scanner.nextFloat(); // Nhập chiều cao

        // Tính diện tích của hình chữ nhật
        float area = width * height;

        // Hiển thị diện tích ra màn hình
        System.out.println("Area is: " + area);
    }
}