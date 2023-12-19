public class NhanVien {
    private String maNhanVien;
    private String hoVaTen;
    private int tuoi;
    private String numberPhone;
    private String email;

    public NhanVien(String maNhanVien, String hoVaTen, int tuoi, String numberPhone, String email) {
        this.maNhanVien = maNhanVien;
        this.hoVaTen = hoVaTen;
        this.tuoi = tuoi;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public NhanVien() {
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNhanVien='" + maNhanVien + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", tuoi=" + tuoi +
                ", numberPhone=" + numberPhone +
                ", email='" + email + '\'' +
                '}';
    }
}
