package sinhVien;
//voquocviet
public class sinhVien {
    private String hoTen;
    private Diem dm1, dm2;

public sinhVien( String hT, Diem dm1, Diem dm2){
        this.hoTen = hT;
        this.dm1 = dm1;
        this.dm2 = dm2;
    }    
public double tinhDTB()
    {
        double tinhDTB = ((dm1.sTC()*dm1.tinhDiem() ) + (dm2.sTC()*dm2.tinhDiem() ));
        return tinhDTB;
    }
public void hienThi()
    {
        System.out.println(hoTen +":" + tinhDTB());
    }
}
