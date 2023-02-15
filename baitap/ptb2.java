import java.util.Scanner;
import java.lang.Math;

public class ptb2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cho phuong trinh bac 2: a*x^2 + b*x + c = 0\n Nhap a,b,c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double delta = b*b - 4*a*c;;
        System.out.println("Phuong trinh da nhap la: "+a+"*x^2 + "+b+"*x + "+c+" = 0");
        System.out.println("Delta = "+delta);
        if(delta > 0) {
            System.out.println("Delta > 0 Nen phuong trinh da nhap co 2 nghiem phan biet.");
            System.out.println("Nghiem x1 = "+(double)((-b + Math.sqrt(delta))/2*a));
            System.out.println("Nghiem x2 = "+(double)((-b - Math.sqrt(delta))/2*a));
        }
        else if(delta == 0) {
            System.out.println("Delta = 0 nen phuong trinh da nhap co 1 nghiem kep.");
            System.out.println("Phuong trinh co 1 nghiem kep x =  "+(double)(-b/2*a));
        }
        else {
            System.out.println("Delta < 0 nen phuong trinh da nhap vo nghiem.");
        }
    }
}