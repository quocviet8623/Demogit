import java.awt.*;

public class App {
    public static void main(String[] args)  {
      /*   Frame f = new Frame("Demo_DoHoa");
        Label l = new Label("Xin chao cac be.");
        Font font = new Font("Calibri",Font.BOLD,25); // phong chữ và size chữ
        
        l.setForeground(Color.red); // màu phông chữ
        l.setFont(font);
                TextField tf = new TextField(20); // tạo một ô trống dai, rong để điền thông tin

        f.setLayout(new FlowLayout());    // làm một ô trống để điền thông tin
        f.add(l);  // hiển thị câu xin chào be syêu
        f.add(tf);     // bổ trợ cho dòng  TẽxtFiled ô trống 

        f.setSize(500, 400);
        f.setVisible(true);*/ 
    Frame f = new Frame("Thông tin của sinh viên");
    Label l1 = new Label( " Họ Tên :  ");
    Label l2 = new Label("Năm Sinh :  ");
    Label l3 = new Label("Giới Tính:  ");
    Label l4 = new Label("Sở Thích :  ");
    Label l5 = new Label("Quê Quán :  ");
    Label l6 = new Label("Danh sách môn học: ");
    
    Font font = new Font("calibri",Font.BOLD,20);
    
    TextField tf1 = new TextField(20);
    TextField tf2 = new TextField(20);
    
    // Dòng chọn giới tính ,(chọn một trong 2)
    CheckboxGroup cho = new CheckboxGroup();
    Checkbox chk1 = new Checkbox("Nam",cho,false);
    Checkbox chk2 = new Checkbox("Nữ", cho,false);
    
    //Dòng chọn sở thích (có thể chọn nhiều)
    Checkbox chk3 = new Checkbox("Đá bóng");
     Checkbox chk4 = new Checkbox("Có ngiu");
      Checkbox chk5 = new Checkbox("Đếm tiền");
       Checkbox chk6 = new Checkbox("Khoa học");
      
// Dòng bổ trợ khai báo cho Quê quán 
    Choice ch = new Choice();
// Dòng bổ trợ khai báo cho Danh sách môn học.
    List list = new List(10,true);
       
    //Dòng hiển thị dòng ntn của p1 và p2.
    Panel p1 = new Panel(new FlowLayout());
    Panel p2 = new Panel(new GridLayout(4,1));
    
    Button bt1 = new Button("Exit");
    Button bt2 = new Button("Save file");
    public giaoDien(){
        l1.setFont(font);
        l2.setFont(font);
        l3.setFont(font);
        l4.setFont(font);
        l5.setFont(font);
        l6.setFont(font);
    
        l1.setForeground(Color.PINK);
        l2.setForeground(Color.PINK);
        l3.setForeground(Color.PINK);
        l4.setForeground(Color.PINK);
        l5.setForeground(Color.PINK);
        l6.setForeground(Color.PINK);
        
        ch.addItem("Bình Định");
        ch.addItem("TP.Hồ Chí Minh");
        ch.addItem("Hà Nội");
        ch.addItem("Đàng Nẵng");
        ch.addItem("Gia Lai");
        ch.addItem("Phú Yên");
        ch.addItem("Thái Bình");
        ch.addItem("Đà Lạt");
        ch.addItem("Bắc Ninh");
        ch.addItem("Ninh Bình");
        ch.addItem("Nha Trang");
        
        list.addItem("C");
        list.addItem("C#");
        list.addItem("java");
        list.addItem("bython");
        list.addItem("html");
        list.addItem("SQl");
        
        //khai báo dòng họ tên
        f.add(l1); f.add(tf1);
        //khai báo dòng ngày sinh
        f.add(l2); f.add(tf2);
        // khai báo dòng giới tính
        f.add(l3);p1.add(chk1);p1.add(chk2);
        f.add(p1);
        // khai báo dòng sở thích 
        f.add(l4); p2.add(chk3); p2.add(chk4); p2.add(chk5); p2.add(chk6);
        f.add(p2);
        // khai báo dòng quê quán
        f.add(l5); f.add(ch);
        // Khai báo dòng các môn học.
        f.add(l6); f.add(list);
        // khai báo hàm exit and savefiel
        f.add(bt1);
        f.add(bt2);
        /*bt1.addActionListener(this);
        bt2.addActionListener(this);*/
         //f.setLayout(new FlowLayout());// làm một ô trống
        f.setLayout(new GridLayout(7,2));// xếp thành 7 hàng 2 cột.
        
        f.setSize(400,500);
        f.setVisible(true);
    }
}
}