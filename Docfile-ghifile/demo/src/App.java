import java.io.*;
public class App {
    public static void main(String[] args) throws Exception {
       // ghiFile( "CNTT k44");
      docFile("CNTT k44");
        
        //System.out.println("Hello, World!");
    }

    public static void docFile (String tenFile){
        try{
                FileInputStream in = new FileInputStream( tenFile);
                int b;
                while ((b = in.read(null))!=-1)
                System.out.println(b);
                in.close();
            }catch(IOException e){
                System.out.println("Loi doc file.");
            }
    }

    public static void ghiFile(String tenFile){
        try{
            FileOutputStream out = new FileOutputStream(tenFile);
            String st = "Lop CNTT k44 dat danh hieu xuat sac";
            for (int i=0; i <st.length(); i++)
            out.write(st.charAt(i));
            out.close();

            } catch(IOException e){
                System.out.println("Loi ghi file");
            }
        }
}