package sinhVien;
// voquocviet
public class Diem {
    private String tenHocPhan;
    private int soTinChi;
    private double chuyenCan, giuaKy, cuoiKy;
    public Diem( String tHP, int sTC, double cC, double gK, double cK){
        this.tenHocPhan = tHP;
        this.soTinChi = sTC;
        this.chuyenCan = cC;
        this.giuaKy = gK;
        this.cuoiKy = cK;
    
    }
    public String tHP()
    {
        return tenHocPhan;
    }
    public int sTC()
    {
        return soTinChi;
    }
    public double tinhDiem()
    {
        double dTB = this.chuyenCan*0.1 + this.giuaKy*0.2 +this.cuoiKy*0.7;
        return dTB;
    }
}
