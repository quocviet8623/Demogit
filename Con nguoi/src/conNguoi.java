import java.util.Date;
public class conNguoi{
  protected String hoTen;
  protected Date ngaySinh;
  protected String gioiTinh;

    public conNguoi(){
       this.hoTen = " ";
       this.ngaySinh = new Date();
       this.gioiTinh = " ";

    }
    public conNguoi(String hT, Date nS, String gT){
       this.hoTen = hT;
       this.ngaySinh = nS;
       this.gioiTinh = gT;
    }
    public void hienThi(){
        System.out.println("Ho ten :"+ this.hoTen);
        System.out.println("Ngay sinh :"+ this.ngaySinh);
        System.out.println("Gioi tinh :"+ this.gioiTinh);
    }
}