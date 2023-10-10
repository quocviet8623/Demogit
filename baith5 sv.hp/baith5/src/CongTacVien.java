import java.util.Vector;
class CongTacVien extends NhanVien {
    private double doanhSo;
    private double tyLeHoaHong;
    
    public CongTacVien(String maNV, String hoTen, double doanhSo, double tyLeHoaHong){
        super(maNV, hoTen);
        this.doanhSo = doanhSo;
        this.tyLeHoaHong = tyLeHoaHong;
    }
    
    @Override
    public double tinhLuong(){
        return (doanhSo * tyLeHoaHong);
    }
}