import java.util.Vector;
class NhanVienHDDH extends NhanVien {
    private double luongThang;
    
    public NhanVienHDDH(String maNV, String hoTen, double luongThang){
        super(maNV, hoTen);
        this.luongThang = luongThang;
    }
    
    @Override
    public double tinhLuong(){
        return luongThang;
    }
}
