class ATM 
{
	private String soTK;
	private double soDu;
		
	public ATM ()
	{
		
	}
	public ATM (String stk, double sd)
	{
		soTK = stk; soDu = sd;
	}
	public String laySTK()
	{
		return soTK;
	}
/*	public laySTK (String soTK)
	{
		this.soTK = soTk;
	} */
	public double laySoDu()
	{
		return soDu;
	}
/*	public laySoDu (double soDu)
	{
		this.soDu = soDu;
	} */
	public String toString()  
	{
		return "So tai khoan: " + soTK + " - " + "So du: " + soDu; 
	}
	public void napTien(double st)  
	{
			System.out.println("Ban vua nap " + st + " vao tai khoan cua minh.");
			System.out.println ("Tong so tien trong tai khoan: " + (soDu = soDu + st));
	}
	public boolean rutTien(double st)  
	{
		if (soDu > st){
			soDu = soDu - st;
			return true;
		} else {
			System.out.println ("Khong the thuc hien.");
			return false;
		}
	}
	public boolean chuyenTien(ATM tk, double st)
	{
		if (rutTien(st)){
			tk.soDu = tk.soDu + st;
			System.out.println ("So du trong tai khoan " + soTK + " : " + soDu);
			return true;
		} else {
			System.out.println ("Khong the chuyen tien, so du khong du.");
			return false;
		}
	}
	public static void main(String[] args)
	{	
		// Tao danh sach 5 tai khoan
		ATM[] arr = new ATM[5];
		arr[0] = new ATM("1111111", 100.0);
		arr[1] = new ATM("2222222", 100.0);
		arr[2] = new ATM("3333333", 100.0);
		arr[3] = new ATM("4444444", 100.0);
		arr[4] = new ATM("5555555", 100.0);
		
		// Tai khoan 1111111 nap 1000
		System.out.println("So tai khoan 1111111: ");
		arr[0].napTien(1000);
		System.out.println (arr[0]);
		System.out.println ();
		
		// Tai khoan 1111111 chuyen tien cho tai khoan 2222222 so tien 500
		System.out.println ("Tai khoan " + arr[0] + " chuyen 500 cho tai khoan " + arr[1]);
		arr[0].chuyenTien(arr[1], 500);
		System.out.println (arr[1]);
		System.out.println ();
		
		// Tai khoan 2222222 rut so tien 200
		System.out.println (arr[1]);
		arr[1].rutTien(200);
		System.out.println ("Rut tien: 200\n" + arr[1]);
		
		// In so tien hien co cua cac tai khoan
		System.out.println ("\nSo tien hien co cua cac tai khoan: ");
		for (int i = 0; i < arr.length; i++){
			System.out.println (arr[i]);
			System.out.print("");
		}
		
		// In tong so tien cua cac tai khoan
		double sum = 0;
		for (int i = 0; i < arr.length; i++){
			sum += arr[i].laySoDu();
		}
		System.out.println ("\nTong so tien cua cac tai khoan: " + sum);
	}
}