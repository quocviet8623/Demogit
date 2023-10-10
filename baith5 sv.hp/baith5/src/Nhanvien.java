import java.util.Vector;

abstract public class NhanVien {
    protected String maNV;
    protected String hoTen;
    
    public NhanVien(String maNV, String hoTen){
        this.maNV = maNV;
        this.hoTen = hoTen;
    }
    
    public abstract double tinhLuong();
}
