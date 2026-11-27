import java.util.Scanner;
public class Javasession3_ex2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Các biến lưu trữ dữ liệu thống kê
            int soHocVien = 0;
            double tongDiem = 0;
            double diemCaoNhat = -1;
            double diemThapNhat = 11;

            int luaChon;
            do {
                // Hiển thị Menu
                System.out.println("\n====== MENU ======");
                System.out.println("1. Nhập điểm học viên");
                System.out.println("2. Hiển thị thống kê");
                System.out.println("3. Thoát");
                System.out.print("Lựa chọn của bạn: ");
                luaChon = scanner.nextInt();

                switch (luaChon) {
                    case 1:
                        System.out.println("\n--- Nhập điểm học viên (nhập -1 để dừng) ---");
                        while (true) {
                            System.out.print("Nhập điểm: ");
                            double diem = scanner.nextDouble();

                            // Nhập -1 thì thoát vòng lặp nhập điểm
                            if (diem == -1) {
                                break;
                            }

                            // Kiểm tra điểm hợp lệ từ 0 đến 10
                            if (diem < 0 || diem > 10) {
                                System.out.println("Nhập điểm: Điểm không hợp lệ. Nhập lại.");
                                continue;
                            }

                            // Xếp loại học lực
                            if (diem < 5) {
                                System.out.println("Học lực: Yếu");
                            } else if (diem < 7) {
                                System.out.println("Học lực: Trung bình");
                            } else if (diem < 8 ) {
                                System.out.println("Học lực: Khá");
                            } else if (diem < 9) {
                                System.out.println("Học lực: Giỏi");
                            } else {
                                System.out.println("Học lực: Xuất sắc");
                            }

                            // Cập nhật thống kê
                            soHocVien++;
                            tongDiem = tongDiem + diem;
                            if (diem > diemCaoNhat) {
                                diemCaoNhat = diem;
                            }
                            if (diem < diemThapNhat) {
                                diemThapNhat = diem;
                            }
                        }
                        break;

                    case 2:
                        System.out.println("\n--- KẾT QUẢ ---");
                        if (soHocVien == 0) {
                            System.out.println("Chưa có dữ liệu");
                        } else {
                            double diemTrungBinh = tongDiem / soHocVien;
                            System.out.println("Số học viên đã nhập: " + soHocVien);
                            System.out.printf("Điểm trung bình: %.2f\n", diemTrungBinh);
                            System.out.printf("Điểm cao nhất: %.2f\n", diemCaoNhat);
                            System.out.printf("Điểm thấp nhất: %.2f\n", diemThapNhat);
                        }
                        break;

                    case 3:
                        System.out.println("Kết thúc chương trình.");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Lựa chọn không hợp lệ, vui lòng chọn từ 1 đến 3.");
                }
            } while (true);
        }
    }

