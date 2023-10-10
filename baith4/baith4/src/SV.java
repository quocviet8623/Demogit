/*import java.util.*;    // Bai lam

class SV{
    protected String hoTen;
    protected Date ngaySinh;
    protected double DTB;
// phuong thuc khoi tao
    public SV(String hT, Date nS, double dtb ){
        this.hoTen = hT;
        this.ngaySinh = nS;
        this.DTB = dtb;
    }
    public String layHoTen(){
        return hoTen;
    }
    public Date layngaySinh(){
        return ngaySinh;
    }
    public double layDTB(){
        return DTB;
    }
    public String xepLoai(){
        if ( this.layDTB() >= 8){
            return ("Gioi");
        }
        else if (this.layDTB() >=7){
            return ("Kha");
        }
        else if (this.layDTB() >=5){
            return ("Trung Binh");
        }
        else {
            return ("Yeu");
        }
    }
    public String layHo() {
		return ("Ho: " + hoTen.split(" ")[0]);
	}
	public String layTen() {
		return ("Ten: " + hoTen.split(" ")[2]);
	}
	public String layDem() {
		return ("Ten Dem: " + hoTen.split(" ")[1]);
	}
	public int layTuoi() {
		Date ngayHienTai = new Date(2022, 9, 19);
		return ngayHienTai.getYear() - ngaySinh.getYear();
	} 
    public void hienThi() {
		System.out.println ("Ho va Ten: " + layHoTen());
		System.out.println ("Tuoi: " + layTuoi());
		System.out.println ("Diem trung binh: " + layDTB());
		System.out.println ("Xep loai: " + xepLoai());
	}

}*/
class SV{
    protected String hoTen;
    protected int namSinh;
    protected float dTB;
    //Phuong thuc khoi tao
    public SV(){
        this.hoTen ="";
        this.namSinh =0;
        this.dTB =0.0f;
    }
    public SV(String ht, int ns, float dtb){
        this.hoTen = ht;
        this.namSinh = ns;
        this.dTB = dtb;
    }
    //Phuong thuc hien thi
    public void hienThi(){
        System.out.println("Ho ten:"+this.hoTen);
        System.out.println("Nam sinh:"+this.namSinh);
        System.out.println("Diem TB:"+this.dTB);
    }

    //Phuong thuc loai SV
    abstract public String loaiSV();
    
    //Phuong thuc sv duoc TN
    abstract public boolean duocTN();
        
}
   


/* 	}
	
	// Bai mau 1
	}
	public void hienThi() {
		System.out.println ("Ho va Ten: " + layHoTen());
		System.out.println ("Tuoi: " + layTuoi());
		System.out.println ("Diem trung binh: " + layDTB());
		System.out.println ("Xep loai: " + xepLoai());
	}
	public String layHo() {
		return ("Ho: " + hoTen.split(" ")[0]);
	}
	public String layTen() {
		return ("Ten: " + hoTen.split(" ")[2]);
	}
	public String layDem() {
		return ("Ten Dem: " + hoTen.split(" ")[1]);
	}
	public int layTuoi() {
		Date ngayHienTai = new Date();
		return ngayHienTai.getYear() - ngaySinh.getYear();
	} 
	public static void main (String[] args) {
		SV sv1 = new SV("Nguyen Hoang Hai", new Date("7/13/2003"), 7);
		sv1.hienThi();
		System.out.println ();
    	SV sv2 = new SV("Bui Le Nghi", new Date("3/10/1997"), 8);
    	sv2.hienThi();
    	System.out.println ();
    	SV sv3 = new SV("Pham Thi Ha Chau", new Date("2/4/2003"), 7);
    	sv3.hienThi();
    	System.out.println ();
    	SV sv4 = new SV("Le Mai Duc Tin", new Date("1/6/2003"), 6.5);
    	sv4.hienThi();
    	System.out.println ();
    	SV sv5 = new SV("Pham Van Dong", new Date("12/9/2003"), 8);
    	sv5.hienThi();
    	System.out.println ();
    } 
}
class DSSV extends SV
{
	private SV[] ds;
	private int soSV;
	public DSSV(String hoTen, Date ngaySinh, double dtb, int soSV){
		super(hoTen, ngaySinh, dtb);
		this.soSV = soSV;
	}
	public void them(SV s){
		if (soSV < ds.length)
			ds[soSV++] = s;
	}
	public int laySV(int soSV){
		return soSV;
	} 
	public void hienThi(){
		super.hienThi();
		System.out.println (" " + + soSV);
	}
	public void sapHoten(){	
		String[] arrHoten = new String[4];
		System.out.println ("Truoc khi sap xep Ho va Ten: " + Arrays.toString(arrHoten));
		Arrays.sort(arrHoten);
		System.out.println ("Sau khi sap xep: " + Arrays.toString(arrHoten)); 
	} 
}
 */