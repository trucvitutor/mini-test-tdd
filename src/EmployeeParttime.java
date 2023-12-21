public class EmployeeParttime extends Employee {
    private int time;

    public EmployeeParttime(String maNhanVien, String hoVaTen, int tuoi, String numberPhone, String email, int time) {
        super(maNhanVien, hoVaTen, tuoi, numberPhone, email);
        this.time = time;
    }

    public EmployeeParttime(String maNhanVien, String hoVaTen, int tuoi, String numberPhone, String email) {
        super(maNhanVien, hoVaTen, tuoi, numberPhone, email);
    }

    public EmployeeParttime() {
    }

    @Override
    public double getThucLinh() {
        return this.time*100000;
    }

    public EmployeeParttime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }


    @Override
    public String toString() {
        return "NhanVienParttime{" +
                "maNhanVien='" + super.getMaNhanVien() + '\'' +
                ", hoVaTen='" + super.getHoVaTen() + '\'' +
                ", tuoi=" + super.getTuoi() +
                ", numberPhone=" + super.getNumberPhone() +
                ", email='" + super.getEmail() + '\'' +
                ",time=" + time +
                '}';
    }
}
