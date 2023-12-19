import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        NhanVien[] nhanVienList = new NhanVien[100];
        NhanVien[] nhanViens;
        Scanner scanner = new Scanner(System.in);
        NhanVien phuong = new NhanVienFullTime("CodeGym", "Trần Đức Phương", 25, "080302040", "phuongtran@gmail.com", 700.0,
                3.0, 700000.0);
        NhanVien trucVi = new NhanVienParttime("Codegym", "nguyễn trúc vi", 18, "077777777", "trucvi@gmail.com", 20);

        nhanVienList[0] = phuong;
        nhanVienList[1] = trucVi;

        System.out.println("1. Tính trung bình lương của nhân viên cả công ty.\n" +
                "2. Tính trung bình lương của nhân viên fulltime\n" +
                "3. Tính trung bình lương của nhân viên parttime\n" +
                "4. Tính tổng lương phải trả cho nhân viên partime\n" +
                "5. Đếm số người có mức lương cao hơn mức lương trung bình toàn công ty\n" +
                "6. Đếm số nhân viên partime có tên được nhập vào từ bàn phím\n" +
                "\n");
        int choice;
        double sum1 = 0;
        double sum2 = 0;
        double sum = 0;
        int count1 = 0;
        int count2 = 0;
        int count;
        double temp1 = 0;
        double temp2 = 0;
        double temp;
        int count3=0;
        for (int i = 0; i < nhanVienList.length; i++) {
            if (nhanVienList[i] instanceof NhanVienFullTime) {
                sum1 += ((NhanVienFullTime) nhanVienList[i]).getThucLinh();
                count1++;
                if (sum < ((NhanVienFullTime) nhanVienList[i]).getThucLinh()) {
                    temp1++;
                }
            } else if (nhanVienList[i] instanceof NhanVienParttime) {
                sum2 += ((NhanVienParttime) nhanVienList[i]).thucLinh();
                count2++;
                if (sum < ((NhanVienParttime) nhanVienList[i]).thucLinh()) {
                    temp2++;
                }
            }
        }
        temp = temp1 + temp2;
        count = count1 + count2;
        sum = (sum1 + sum2) / count;

        while (true) {
            System.out.println("mời bạn chọn:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("tổng:" + sum);
                    break;
                case 2:
                    System.out.println("trung bình lương full: " + sum1 / count1);
                    break;
                case 3:
                    System.out.println("trung bình luong part: " + sum2 / count2);
                    break;
                case 4:
                    System.out.println("tổng lương phải trả cho nhân viên parttime: " + sum2);
                    break;
                case 5:
                    System.out.println("tổng số người có mức lương cao hơn trung bình toàn công ty:" + temp);
                    break;
                case 6:
                    System.out.println(" mã nhân viên: ");
                    String maNhanVien = scanner.nextLine();
                    System.out.println(" họ và tên : ");
                    String hoVaTen = scanner.nextLine();
                    System.out.println(" old : ");
                    int old = Integer.parseInt(scanner.nextLine());
                    System.out.println(" numberphone : ");
                    String numberPhone = scanner.nextLine();
                    System.out.println(" email: ");
                    String email = scanner.nextLine();
                    System.out.println("time: ");
                    int time = Integer.parseInt(scanner.nextLine());
                    NhanVien vien = new NhanVienParttime(maNhanVien, hoVaTen, old, numberPhone, email, time);
                   // System.out.println(vien);
                    boolean check = true;
                    for (int i = 0; i < nhanVienList.length; i++) {
                        if (nhanVienList[i] == null) {
                            nhanVienList[i] = vien;
                            count3++;
                            check = false;
                            break;
                        }
                    }
                    for (int i = 0; i < nhanVienList.length; i++) {
                        if(nhanVienList[i]!=null) {;
                        System.out.println(nhanVienList[i]);
                    }
                    }
                    System.out.println("so nhan vien parttime nguoi dung nhap la: "+count3);
                    if (check) {
                        nhanViens = new NhanVien[nhanVienList.length * 2];
                        for (int i = 0; i < nhanViens.length; i++) {
                            nhanViens[i] = nhanVienList[i];
                            if (nhanViens[i] == null) {
                                nhanViens[i] = vien;
                                break;
                            }
                        }
                        System.out.println(Arrays.toString(nhanViens));
                    }


                        break;

            }
        }

    }

}