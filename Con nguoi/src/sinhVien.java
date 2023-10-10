import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class sinhVien extends conNguoi {
   
    private float dTB;

    public sinhVien(){
        super();
        this.dTB = 0.0f;
    }
    public sinhVien(String hT, Date nS, String gT, float dTB){
        super(hT, nS, gT);
        this.dTB= dTB;
    }
    public void hienThi(){
        System.out.println("Ho ten :"+ this.hoTen);
        System.out.println("Ngay sinh :"+ this.ngaySinh);
        System.out.println("Gioi tinh :"+ this.gioiTinh);
        System.out.println("Diem TB :"+ this.dTB);
    }
    // Ghi cac doi tuong ps len file

public void ghiFile(String tenFile){
    try{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(tenFile));
        for (int i =0 ; i <ds.size(); i++)
                 out.write0bject(ds.elementAt(i));

    }catch(IOException e){

    }
}    
}


