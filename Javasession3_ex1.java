import java.util.Scanner;
public class Javasession3_ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1: nhap thong tin hoa don
        System.out.println("Nhap thong tin hoa don");
        System.out.print("Nhap ten khach hang:");
        String tenKhachHang = scanner.nextLine();
        System.out.print("Nhap ten san pham:");
        String tenSanPham = scanner.nextLine();
        System.out.print("Nhap gia san pham:");
        double gia = scanner.nextDouble();
        System.out.print("Nhap so luong mua:");
        int soLuong = scanner.nextInt();
        System.out.print("Khach co the than vien? (true/false)");
        boolean laThanhVien = scanner.nextBoolean();
        // 2: tinh toan
        double thanhTien = gia * soLuong;
        double giamGia = laThanhVien ? (thanhTien * 0.10) : 0;
        double tienVAT = thanhTien * 0.08; // VAT 8% tinh tren thanh tien
        double tongThanhToan = thanhTien - giamGia + tienVAT;
        // 3: in hoa don dau ra
        System.out.println("Hoa Don");
        System.out.println("Khach hang:" + tenKhachHang);
        System.out.println("San pham:" + tenSanPham);
        System.out.println("Gia:" + gia + "VND");
        System.out.println("So luong:" + soLuong);
        System.out.println("Thanh tien:" + thanhTien + "VND");
        System.out.println("giam gia:" + giamGia);
        System.out.println("Tien VAT:" + tienVAT);
        System.out.println("Tong thanh toan" + tongThanhToan + "VND");
        scanner.close();
    }
}
