import java.util.Vector;
class NhanVienHDG extends NhanVien {
    private double luongGio;
    private byte soGio;
    
    public NhanVienHDG(String maNV, String hoTen, double luongGio, byte soGio){
        super(maNV, hoTen);
        this.luongGio = luongGio;
        this.soGio = soGio;
    }
    
    @Override
    public double tinhLuong(){
        int gioThem = 0;
        if(soGio >= 160)
            gioThem = soGio - 160;
        return (luongGio * soGio + luongGio * 0.5 * gioThem);
    }
}