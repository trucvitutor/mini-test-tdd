import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Employee[] employeeList = new Employee[2];
        Scanner scanner = new Scanner(System.in);
        Employee phuong = new EmployeeFullTime("CodeGym", "Trần Đức Phương", 25, "080302040", "phuongtran@gmail.com", 700.0,
                3.0, 700000.0);
        Employee trucVi = new EmployeeParttime("Codegym", "nguyễn trúc vi", 18, "077777777", "trucvi@gmail.com", 20);
        employeeList[0] = phuong;
        employeeList[1] = trucVi;
        int choice;
        while (true) {
            System.out.println("1. Tính trung bình lương của nhân viên cả công ty.\n" +
                    "2. Tính trung bình lương của nhân viên fulltime\n" +
                    "3. Tính trung bình lương của nhân viên parttime\n" +
                    "4. Tính tổng lương phải trả cho nhân viên partime\n" +
                    "5. Đếm số người có mức lương cao hơn mức lương trung bình toàn công ty\n" +
                    "6. Đếm số nhân viên partime có tên được nhập vào từ bàn phím\n" +
                    "\n");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    double salaryEmployee = getSalaryEmployee(employeeList);
                    System.out.println(salaryEmployee);
                    break;
                case 2:
                    double salaryEmployeePart =  salaryEmployeePart(employeeList);
                    System.out.println(salaryEmployeePart);
                    break;
                case 3:
                    double salaryEmployeeFull= salaryEmployeeFull(employeeList);
                    System.out.println(salaryEmployeeFull);
                    break;
                case 4:
                    double sumSalaryEmployee=salaryEmployeeSumPart(employeeList);
                    System.out.println(sumSalaryEmployee);
                    break;
                case 5:
                    int memberSalaryThanSumEmployee= memberSalaryThanSumEmployee(employeeList);
                    System.out.println(memberSalaryThanSumEmployee);
                    break;
                case 6:
                    int nameMember= nameMemberEmployeer(employeeList);
                    System.out.println(nameMember);
                    break;
            }
        }
    }

    private static int nameMemberEmployeer(Employee[] employeeList) {
        int count=0;
        Scanner s=new Scanner(System.in);
        System.out.println("nhap name: ");
        String name=s.nextLine();
        for (int i = 0; i < employeeList.length; i++) {
            if(employeeList[i] instanceof EmployeeParttime){
                if(employeeList[i].getHoVaTen().contains(name)){
                    count++;
                }

            }
        }
        return count;
    }

    private static int memberSalaryThanSumEmployee(Employee[] employeeList) {
        int count=0;
        double sum=0;

        for (int i = 0; i <employeeList.length ; i++) {
            sum+=employeeList[i].getThucLinh();
        }
        sum=sum/employeeList.length;
        for (int i = 0; i < employeeList.length; i++) {
            if(employeeList[i].getThucLinh()>sum){
                count++;
            }
        }
        return count;
    }


    private static double salaryEmployeeSumPart(Employee[] employeeList) {
        double sum = 0;
        for (int i = 0; i < employeeList.length; i++) {
            if (employeeList[i] instanceof EmployeeParttime) {
                sum += employeeList[i].getThucLinh();
            }
        }
        return sum;
    }




    private static double salaryEmployeeFull(Employee[] employeeList) {
        int count=0;
        int sum=0;
        for (int i = 0; i <employeeList.length ; i++) {
            if(employeeList[i] instanceof EmployeeFullTime){
                sum+=employeeList[i].getThucLinh();
                count++;
            }
        }
        return sum/count;
    }

    private static double salaryEmployeePart(Employee[] employeeList) {
        int count=0;
        int sum=0;
        for (int i = 0; i <employeeList.length ; i++) {
            if(employeeList[i] instanceof EmployeeParttime){
                sum+=employeeList[i].getThucLinh();
                count++;
            }
        }
        return sum/count;
    }

    private static double getSalaryEmployee(Employee[] employeeList) {
        double sum=0;
        for (int i = 0; i <employeeList.length ; i++) {
            sum+=employeeList[i].getThucLinh();
        }
        return sum/employeeList.length;
    }
}