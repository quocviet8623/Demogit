/*import java.util.*;  // Bai lam
 class DSSV {
    private SV[] dssv;
    private int soSV;
 public DSSV(String hoTen, Date ngaySinh, double dtb, int soSV ){
	dssv = new SV[4];
	soSV = 0;
 	}
 public void them(SV s){
		if (soSV < dssv.length)
		dssv[soSV++] = s;
	}
 public int laySV(int soSV){
	 return soSV;
	} 
 public void hienThi(){
	for (int i=0; i<soSV; i++)
		dssv[i].hienThi();
	}
 public void sapHoten(){	
	String[] arrHoten = new String[4];
	System.out.println ("Truoc khi sap xep Ho va Ten: " + Arrays.toString(arrHoten));
	Arrays.sort(arrHoten);
	System.out.println ("Sau khi sap xep: " + Arrays.toString(arrHoten)); 
	} 
}
 */
public class DSSV {
    private SV[] dssv;
    private int soSV;

    public DSSV(int n){
        dssv = new SV[n];
        soSV = 0;
    }
    //Phuong thuc them 1 sv vao dssv
    public void them(SV a){
        if (soSV<dssv.length){
            dssv[soSV] = a;
            soSV++;
        }
    }
    //Phuong thuc liet ke dssv
    public void lietKe(){
        for(int i =0; i<soSV; i++)
            dssv[i].hienThi();
    }
    //Phuong thuc liet ke dssv theo loai SV
    public void lietKeTheoLoaiSV(String loaiSV){
        for(int i =0; i<soSV; i++)
            if (dssv[i].loaiSV().equals(loaiSV))
                dssv[i].hienThi();
    }
    //Phuong thuc liet ke dssv theo loai SV
    public void lietKeSVDuocTN(){
        for(int i =0; i<soSV; i++)
            if (dssv[i].duocTN())
                dssv[i].hienThi();
    }
    
}







/*/ Phuong thuc them mot sinh vien vao dssv
 public void them(SV a){
	if(soSV< dssv.length){
		dssv[soSV] = a;
		soSV++;
	}
 }
 // Phuong thuc liet ke dssv
 public void lietKe(){
	for(int i = 0; i < soSV; i++)
	dssv[i].hienThi();
 }
 // Phuonwg thuc liet ke dssv theo loai SV
 public void lietKeTheoLoaiSV(String loaiSv){
	for (int i = 0; i < soSV; i++)
	if(dssv[i].loaiSV().equals(loaiSV))
	   dssv[i].hienThi();
 }
 //Phuong thuc liet ke dssv theo loai sv
 public void lietKeSVDuocTN(){
	for(int i =0; i < soSV; i++)
	  if (dssv[i].duocTN())
	  dssv[i].hienThi();
 }
/* 	
public DSSV(String hoTen, Date ngaySinh, double dtb, int soSV){
    super (hoTen, ngaySinh, dtb);
    this.soSV = soSV;
}    
public void them(SV s){
    if (soSV < dssv.length)
    dssv[soSV++] = s;
}
public int laySV(int soSV){
	return soSV;
}
public void hienThi(){
	super.hienThi();
	System.out.println("null"+ + soSV);
}*/




/*public class DSSV {
    private SV[] dssv;
    private int soSV;

    public DSSV(int n){
        dssv = new SV[n];
        soSV = 0;
    }
    //Phuong thuc them 1 sv vao dssv
    public void them(SV a){
        if (soSV<dssv.length){
            dssv[soSV] = a;
            soSV++;
        }
    }
    //Phuong thuc liet ke dssv
    public void lietKe(){
        for(int i =0; i<soSV; i++)
            dssv[i].hienThi();
    }
    //Phuong thuc liet ke dssv theo loai SV
    public void lietKeTheoLoaiSV(String loaiSV){
        for(int i =0; i<soSV; i++)
            if (dssv[i].loaiSV().equals(loaiSV))
                dssv[i].hienThi();
    }
    //Phuong thuc liet ke dssv theo loai SV
    public void lietKeSVDuocTN(){
        for(int i =0; i<soSV; i++)
            if (dssv[i].duocTN())
                dssv[i].hienThi();
    }
    
}
 */
/*class DSSV extends SV    // bai cua Quynh
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