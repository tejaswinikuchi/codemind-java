import java.util.Scanner;
public class Area{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float r = sc.nextFloat();
        double area = 3.14* r *r;
        double peri = 2*3.14*r;
        System.out.printf("%.2f
",area);
        System.out.printf("%.2f",peri);
    }
}