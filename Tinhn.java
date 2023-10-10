
import java.util.Scanner;
 public class Tinhn { 
    public static void main(String[] args) { 
        Scanner inPut = new Scanner(System.in);
         int n, i, S = 1;
          System.out.println("Nhap n: ");
           n = inPut.nextInt(); 
           for(i = 1; i <= n; i++) { S = S * i; } 
           System.out.println("Ket qua la: "+ S); 
        }
     }

