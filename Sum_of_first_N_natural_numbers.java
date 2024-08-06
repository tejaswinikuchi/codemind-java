import java.util.Scanner;
public class Number{
    public static void main(String args[]){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int sum = (n*(n+1))/2;
        System.out.println(sum);
    }
}