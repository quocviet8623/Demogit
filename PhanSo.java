import java.util.Scanner;

public class PhanSo {
    private int tu; // thuộc tính 
    private int mau;

    // phươn thức khởi tạo
    public PhanSo(){
        this.tu =0;
        this.mau =1;
    }
    // Hàm khởi tạo có đổi số
    public PhanSo(int tu, int mau){
        this.tu = tu;
        this.mau = mau;
    }
    // Hàm nhập phân số
    public void nhapPS(Scanner sc){
        int q;
        int p;

        {
            System.out.print ("\tNhap vao tu so: ");
            q = sc.nextInt();
            System.out.print ("\tNhap vao mau so: ");
            p = sc.nextInt();

            // Kiểm tra
            if (p == 0)  {
                System.out.println("Mau so khong duoc bang 0..Hay nhap lai!");
            }
             
            else {
                tu = q;
                mau = p;
            }
        }
        while (p ==0);
    }
/* Phương thức lấy và gắn giá trị cho các thuộc thính 
public int getTu(){
    return this.tu;
 }
 public void setTu(int tu){
    this.tu =tu;
 }
 public void getMau(){
     return this.mau;;
 }
 public void setMau(int mau){
    this.mau = mau;
 }

 */   


 // Phuong thức hiển thị 
    public void hienThi(){
        if (tu * mau < 0){
            System.out.println("\t-"+ this.tu +"/" + this.mau);
        }
        else {
            System.out.println("\t-" + this.tu + "/" + this.mau);
        }
    }                                                            // một lớp gồm 2 thành phần
 // Phuong thức cộng hai phân số 1/2+ 2/3 = (1*3+2*3)/ 2/3
    public PhanSo congPS (PhanSo ps2){
        int q = tu * ps2.mau + ps2.tu * mau;
        int p = mau * ps2.mau;
        return new PhanSo(q,p);
    }
// Phuong thuc tru
public PhanSo truPS (PhanSo ps2){
    int q = tu * ps2.mau - ps2.tu * mau;
    int p = mau * ps2.mau;

    return new PhanSo(q,p);
}   
// phuong thuc nhan
public PhanSo nhanPS (PhanSo ps2){
    int q = tu * ps2.tu;
    int p = mau * ps2.mau;

    return new PhanSo(q,p);
} 
// Phuong thuc chia
public PhanSo chiaPS(PhanSo ps2){
    int q = tu * ps2.mau;
    int p = mau * ps2.tu;

    return new PhanSo(q,p);
}
// Ham tim uscln
private int timUSCLN (int q, int p){
    int r = q % p;

    while (r != 0) {
        q = p;
        p = r;
        r = q % p;
    }
    return p;
}
// Ham kiem tra phan so toi gian
public Boolean kiemTraToiGian(){
    if (timUSCLN (tu, mau) == 1){
        return true;
    }
    return false;
}
// Ham toi gian
public void toiGianPS(){
    int x = timUSCLN (tu, mau);

    tu /= x;
    mau /= x;
}
}
