import java.util.Date;
import java.text.SimpleDateFormat;
public class NV {
    private String hoTen;
    private Date ngaySinh;
    // phuong thuc khoi trao
     public NV(){
         this.hoTen ="";
         this.ngaySinh = new Date();
     }
     public NV (String ht, Date ns){
        this.hoTen =ht;
        this.ngaySinh = new Date();
     }
     public NV(String ht , Date ns, String cv){
     this.hoTen =ht;
     this.ngaySinh = ns;
     }
// Phuong thuc tinh tuoi
public int tinhTuoi(){
    Date d = new Date();
    return d. getYear() - this.ngaySinh.getYear();


  }
}

