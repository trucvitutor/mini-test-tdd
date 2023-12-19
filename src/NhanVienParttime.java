public class NhanVienParttime extends NhanVien{
    private int time;

    public NhanVienParttime(String maNhanVien, String hoVaTen, int tuoi, String numberPhone, String email, int time) {
        super(maNhanVien, hoVaTen, tuoi, numberPhone, email);
        this.time = time;
    }

    public NhanVienParttime(String maNhanVien, String hoVaTen, int tuoi, String numberPhone, String email) {
        super(maNhanVien, hoVaTen, tuoi, numberPhone, email);
    }

    public NhanVienParttime() {
    }

    public NhanVienParttime(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    public double thucLinh(){
        return this.time*100000;
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
