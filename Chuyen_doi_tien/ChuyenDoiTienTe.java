import java.text.DecimalFormat;
import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {

        final double RATE = 26000;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền USD: ");
        double usd = scanner.nextDouble();

        double vnd = usd * RATE;

        DecimalFormat df = new DecimalFormat("#,###");

        System.out.println(usd + " USD = " + df.format(vnd) + " VND");

        scanner.close();
    }
}