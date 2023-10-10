/*public class SVSP extends SV{    Bai lam
    private String noiTT;
    private float diemTT;
    public SVSP(){
        super();
        this.noiTT ="";
        this.diemTT = 0.0f;
    }

    public  SVSP(String hoTen, int ngaySinh, float dtb, String noitt, float diemtt){
        super(hoTen, ngaySinh ,dtb, noitt, diemtt);
        this.noiTT = noitt;
        this.diemTT = diemtt;
    }
    public void hienThi(){
        super.hienThi();
        System.out.println("Noi thuc tap :"+ this.noiTT);
        System.out.println("Diem thuc tap :"+ this.diemTT);

    }
    // phuong thuc loai sv
    public String loaiSV(){
        return "SP";
    }
    // phuong thuc sv duoc tot nghiep
    public boolean duocTN(){
        return DTB >= 5 && diemTT >= 7;
    }
}
*/
public class SVSP extends SV{
    private String noiTT;
    private float diemTT;
    public SVSP(){
        super();
        this.noiTT ="";
        this.diemTT =0.0f;
    }

    public SVSP(String ht, int ns, float dtb, String noitt, float diemtt){
        super(ht,ns,dtb);
        this.noiTT =noitt;
        this.diemTT = diemtt;
    }

    public void hienThi(){
        super.hienThi();
        System.out.println("Noi thuc tap:"+this.noiTT);
        System.out.println("Diem thuc tap:"+this.diemTT);
    }
     //Phuong thuc loai SV
     public String loaiSV(){
        return "SP";
    }
    //Phuong thuc sv duoc TN
     public boolean duocTN(){
        return dTB>=5 && diemTT>=6;
    }

}

