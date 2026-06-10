/**
 * HỆ THỐNG VÍ ĐIỆN TỬ - PAYFAILS (VIÊN BẢN ĐÃ VÁ LỖI)
 * Giải quyết: Lỗi tràn bộ nhớ (Overflow) và lỗi chia cho 0 (Division by Zero).
 */
public class WalletSystem {
    public static void main(String[] args) {
        System.out.println("--- GIAO DỊCH NẠP TIỀN AN TOÀN ---");

        // BUG 1 ĐÃ SỬA: Chuyển sang kiểu long để tránh tràn số khi vượt quá 2.14 tỷ
        long currentBalance = 2147000000L;
        long depositAmount = 1000000L;

        // Kiểm tra dữ liệu biên đầu vào của số tiền nạp
        if (depositAmount <= 0) {
            System.out.println("Số tiền nạp không hợp lệ!");
        } else {
            long newBalance = currentBalance + depositAmount;
            System.out.println("Số dư sau khi nạp: " + newBalance + " VNĐ");
        }

        System.out.println("\n--- THỐNG KÊ CHI TIÊU AN TOÀN ---");

        long totalSpent = 0L;
        long transactionCount = 0L;
        long averageSpent = 0L;

        // BUG 2 ĐÃ SỬA: Sử dụng cấu trúc điều kiện để ngăn chặn phép chia cho số 0
        if (transactionCount == 0) {
            averageSpent = 0L; // Người dùng mới chưa có giao dịch thì chi tiêu mặc định bằng 0
        } else {
            averageSpent = totalSpent / transactionCount;
        }

        System.out.println("Chi tiêu trung bình mỗi giao dịch: " + averageSpent + " VNĐ");
        System.out.println("Hệ thống vận hành an toàn, app không bị sập!");
    }
}