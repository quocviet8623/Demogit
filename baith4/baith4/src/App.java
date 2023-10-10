import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/*import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
       SV a = new SV( "Vo Hoang Nam",  new Date(2014, 9, 19), 8);
          a.hienThi();  
        
       SV b = new SV("Nguyen Vo Nhu Quynh", new Date(2003, 5, 8), 7);
          b.hienThi();
       SV c = new SV("Nguyen van A", new Date(2007, 6, 8), 4); 
          c.hienThi();
       SV d = new SV("Tran Thi My", new Date(2005, 05, 27), 6.4);
          d.hienThi();  
       System.out.println("Chuc cac ban may man ^-^");
       
    }
 
}
*/
/*public class App {
   public static void main(String[] args) throws Exception {
       SV a = new SVSP("Nguyen Thi No",2003,7,"THPT Quoc Hoc",6);
       SV b = new SVTH("Nguyen Van B",2002,6.5f,"LTHDT",8);

       
      DSSV list = new DSSV(7);
      list.them(a);
      list.them(b);

      //list.lietKeTheoLoaiSV("SP");
      list.lietKeSVDuocTN();

   }
}
 */
public class App{
   public static void main(String[] args){
      xuat("C.txt");
   }
   // Hien thi du lieu len console
   public static void xuat(){
      PrintWriter pw = new PrintWriter(System.out);
      pw.print("Xin chao");
      pw.close();

   }
   // Hien thi du lieu tren file 
   public static void xuat(String tenFile){
      try{
         FileOutputStream fo = new FileOutputStream(tenFile);
         PrintWriter pw = new PrintWriter(fo,true);
         pw.println("Xin chao");
         pw.println(20);
         pw.println(true);
         pw.close();
      }catch(IOException e){
         System.out.println("Loi ghi file");
      }
      }
   }
