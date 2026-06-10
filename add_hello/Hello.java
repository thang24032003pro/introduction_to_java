import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Scanner để nhận dữ liệu gõ từ bàn phím
        Scanner scanner = new Scanner(System.in);

        // Hiển thị thông báo yêu cầu nhập tên
        System.out.println("Enter your name: ");

        // Đọc toàn bộ dòng chữ mà người dùng nhập vào
        String name = scanner.nextLine();

        // Hiển thị lời chào kết hợp với tên vừa nhập
        System.out.println("Hello: " + name);
    }
}