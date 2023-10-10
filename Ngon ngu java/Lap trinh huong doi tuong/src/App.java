import sinhVien.Diem;
import sinhVien.sinhVien;

public class App {
    public static void main(String[] args)  {
        Diem m1 = new Diem("GTNCNTT", 3, 10, 8, 8);

        Diem m2 = new Diem("KTCT", 3, 10, 9, 4.5);

    sinhVien s1 = new sinhVien("Vu", m1, m2);
    sinhVien s2 = new sinhVien("My", new Diem("GTNCNTT", 1, 10, 8, 8 ), new Diem("KTCT", 3, 8, 7, 4.5));
             s1.hienThi();
             s2.hienThi();
        System.out.println("Hello, a good luck!");
    }
}
