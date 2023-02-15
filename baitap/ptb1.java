import java.util.Scanner;

public class ptb1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double d,dx,dy,x,y;
        System.out.println("Cho he phuong trinh bac nhat 2 an: \na*x +b*y =c \nm*x +n*y =p\nNhap a,b,c,m,n,p:");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double m = sc.nextDouble();
        double n = sc.nextDouble();
        double p = sc.nextDouble();
        System.out.println("He phuong trinh da nhap: \n"+a+"*x + "+b+"*y = "+c);
        System.out.println(m+"*x + "+n+"*y = "+p);

            d = a*n - m*b;
            dx = c*n - p*b;
            dy = a*p - m*c;
            x = dx/d;
            y = dy/d;
        if(a/m != b/n) {
            System.out.println("He phuong trinh co 2 nghiem x,y.");
            System.out.println("x = "+x+ ", y = "+y);
        }
        if(a/m == b/n && b/n == c/p) {
            System.out.println("He phuong trinh co vo so nghiem");
        }
        if(a/m == b/n && b/n != c/p) {
            System.out.println("He phuong trinh vo nghiem");
        }
    }
}
