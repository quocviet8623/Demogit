

/*public class SVTH extends SV {               // Bai lam
    private String tenDT;                  // private chỉ được truy cập trong nội bộ lớp .
    private float diemDT;                  // protected có thành phần được bảo vệ , quyền truy cập bị hạn chế. 

    public SVTH(){
        super();
        this.tenDT ="";
        this.diemDT = 0.0f;
    }
    public SVTH(String hoTen, int ngaySinh, float dtb, String tendt, float diemdt){
        super( , ngaySinh,dtb,tendt,diemdt);
        this.tenDT = tendt;
        this.diemDT = diemdt;
    }
    public void hienThi(){
        super.hienThi();
        System.out.println("Ten de tai :"+  this.tenDT);
        System.out.println("Diem de tai :"+ this.diemDT);

    }   
    // phuon thuc loai sv
    public String loaiSV(){
        return "TH";
    } 
    // Phuong thuc sv duoc TN
    public boolean duocTn(){
        return DTB >=5 && diemDT >= 8;
    }
}
*/
public class SVTH extends SV{
    private String tenDT;
    private float diemDT;

    public SVTH(){
        super();
        this.tenDT ="";
        this.diemDT =0.0f;
    }

    public SVTH(String ht, int ns, float dtb, String tendt, float diemdt){
        super(ht,ns,dtb);
        this.tenDT =tendt;
        this.diemDT =diemdt;
    }

    public void hienThi(){
        super.hienThi();
        System.out.println("Ten de tai:"+this.tenDT);
        System.out.println("Diem de tai:"+this.diemDT);
    }
     //Phuong thuc loai SV
     public String loaiSV(){
        return "TH";
    }
    //Phuong thuc sv duoc TN
    public boolean duocTN(){
        return dTB>=5 && diemDT>=8;
    }
    
}
