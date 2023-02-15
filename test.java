import java.util.Scanner;

public class test{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        int a = sc.nextInt();
        if(a>=10 && a<=100){
            System.out.println(a+ " thuoc doan [10,100]");
        }
        else{
            System.out.println(a+ " khong thuoc doan [10,100]");
        }
    }
}