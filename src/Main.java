import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee[] employees = new Employee[4];
        //String code, String name, int age, String numberPhone, String email, double bonus, double penalty, double salary
        employees[0] = new FullTimeEmployee("NV-123", "Truc Vi", 18, "0912312323", "trucvi@gmail.com", 10000, 5000, 100000);
        employees[1] = new FullTimeEmployee("NV-456", "Vi Truc", 16, "0945645645", "vitruc@gmail.com", 20000, 5000, 200000);
        //String code, String name, int age, String numberPhone, String email, int time
        employees[2] = new PartTimeEmployee("PT-123", "Truc Tham", 20, "0985624625", "tructham@gmail.com", 10);
        employees[3] = new PartTimeEmployee("PT-456", "Tham Truc", 20, "0986654987", "thamtruc@gmail.com", 20);

        while (true) {
            System.out.println("QUẢN LÝ NHÂN VIÊN");
            System.out.println("1. Tính lương trung bình của nhân viên cả công ty.");
            System.out.println("2. Tính lương trung bình của nhân viên fulltime.");
            System.out.println("3. Tính lương trung bình của nhân viên partime.");
            System.out.println("4. Tính tổng lương phải trả cho nhân viên partime.");
            System.out.println("5. Đếm số người có mức lương cao hơn mức lương trung bình của toàn công ty.");
            System.out.println("6. Đếm số nhân viên partime được nhập từ bàn phím.");
            System.out.println("0. Kết thúc.");

            System.out.print("Nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    double avgAllEmployeesSalary = getAvgSalaryOfAllEmployees(employees);
                    System.out.println("Lương trung bình của tất cả nhân viên toàn công ty là: " + avgAllEmployeesSalary);
                    break;
                case 2:
                    double avgFullTimeEmployees = getAvgFullTimeEmployees(employees);
                    System.out.println("Lương trung bình của tất cả nhân viên full time là: " + avgFullTimeEmployees);
                    break;
                case 3:
                    double avgPartTimeEmployees = getAvgPartTimeEmployees(employees);
                    System.out.println("Lương trung bình của tất cả nhân viên part time là: " + avgPartTimeEmployees);
                    break;
                case 4:
                    double totalPaymentSalary = getTotalPaymentSalary(employees);
                    System.out.println("Tổng lương phải trả cho nhân viên part time là: " + totalPaymentSalary);
                    break;
                case 5:
                    int count = getCount(employees);
                    System.out.println("Tổng số người có mức lương cao hơn trung bình của công ty là: " + count);
                    break;
                case 6:
                    int countOfEmployeePartTime = getCountOfEmployeePartTime(scanner, employees);
                    System.out.println("Số lượng nhân viên partime được nhập từ bàn phím là: " + countOfEmployeePartTime);
                    break;
                case 0:
                    return;
            }
        }

    }

    private static int getCountOfEmployeePartTime(Scanner scanner, Employee[] employees) {
        System.out.print("Nhập tên nhân viên part time: ");
        String employeePartTimeName = scanner.nextLine();
        int countOfEmployeePartTime = 0;
        for (Employee employee: employees) {
            if (employee instanceof PartTimeEmployee) {
                if (employee.getName().equals(employeePartTimeName)) {
                    countOfEmployeePartTime++;
                }
            }
        }
        return countOfEmployeePartTime;
    }

    private static int getCount(Employee[] employees) {
        int count = 0;
        for (Employee employee: employees) {
            if (employee.getNetSalary() > getAvgSalaryOfAllEmployees(employees)) {
                count++;
            }
        }
        return count;
    }

    private static double getTotalPaymentSalary(Employee[] employees) {
        double totalPaymentSalary = 0;
        for (Employee employee: employees) {
            if (employee instanceof PartTimeEmployee) {
                totalPaymentSalary+=employee.getNetSalary();
            }
        }
        return totalPaymentSalary;
    }

    private static double getAvgPartTimeEmployees(Employee[] employees) {
        double totalSalary = 0;
        int totalPartTimeEmployee = 0;
        for (Employee employee: employees) {
            if (employee instanceof PartTimeEmployee) {
                totalSalary += employee.getNetSalary();
                totalPartTimeEmployee++;
            }
        }
        return totalSalary / totalPartTimeEmployee;
    }

    private static double getAvgFullTimeEmployees(Employee[] employees) {
        double totalSalary = 0;
        int totalFullTimeEmployee = 0;
        for (Employee employee: employees) {
            if (employee instanceof FullTimeEmployee) {
                totalSalary += employee.getNetSalary();
                totalFullTimeEmployee++;
            }
        }
        return totalSalary / totalFullTimeEmployee;
    }

    private static double getAvgSalaryOfAllEmployees(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee: employees) {
            totalSalary += employee.getNetSalary();
        }
        return totalSalary / employees.length;
    }

}