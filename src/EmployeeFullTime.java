public class EmployeeFullTime extends Employee {
    private double tienThuong;
    private double soTienPhat;
    private double luongCung;

    public EmployeeFullTime() {
    }

    public EmployeeFullTime(double tienThuong, double soTienPhat, double luongCung) {
        this.tienThuong = tienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }

    public EmployeeFullTime(String maNhanVien, String hoVaTen, int tuoi, String numberPhone, String email,
                            double tienThuong, double soTienPhat, double luongCung) {
        super(maNhanVien, hoVaTen, tuoi, numberPhone, email);
        this.tienThuong = tienThuong;
        this.soTienPhat = soTienPhat;
        this.luongCung = luongCung;
    }

    public EmployeeFullTime(String maNhanVien, String hoVaTen, int tuoi, String numberPhone, String email) {
        super(maNhanVien, hoVaTen, tuoi, numberPhone, email);
    }

    public double getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }

    public double getSoTienPhat() {
        return soTienPhat;
    }

    public void setSoTienPhat(double soTienPhat) {
        this.soTienPhat = soTienPhat;
    }

    public double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(double luongCung) {
        this.luongCung = luongCung;
    }
    @Override
    public double getThucLinh(){
        return this.luongCung+(this.tienThuong-this.soTienPhat);
    }

    @Override
    public String toString() {
        return "NhanVienFullTime{" +
                "tienThuong=" + tienThuong +
                ", soTienPhat=" + soTienPhat +
                ", luongCung=" + luongCung +
                '}';
    }
}
