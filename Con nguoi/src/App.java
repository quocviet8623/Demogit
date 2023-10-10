
import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
     conNguoi a = new sinhVien("Pham Diem My", new Date(25)), " Nu", 6);
     conNguoi b = new sinhVien("Mai Huynh Diep", new Date(27 ), "nam",4);

     a.hienThi();
     b.hienThi();
    }
    

ds.ghiFile("Ps.dat");

public static void ghiFile(String tenFile){
    try{
        RandomAccessFile rdf = new RandomAccessFile(tenFile,"rw");
        String st ="Xin chao";
        rdf.writeBytes(st);
        rdf.seek(st.length()+1);
        rdf.writeBytes( " cac ban CNTT k 44A");

    }catch(IOException e){

    }
}
}


